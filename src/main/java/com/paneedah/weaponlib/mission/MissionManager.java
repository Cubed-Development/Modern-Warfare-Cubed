package com.paneedah.weaponlib.mission;

import com.google.gson.*;
import com.paneedah.weaponlib.mission.MissionReward.ItemReward;
import net.minecraft.advancements.AdvancementManager;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.util.JsonUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileSystem;
import java.nio.file.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import static com.paneedah.mwc.utils.ModReference.log;

public class MissionManager {
    
    private Gson gson;
    private String modId;
    private Map<String, MissionOffering> offeringsByName = new HashMap<>();
    private Map<UUID, MissionOffering> offeringsById = new HashMap<>();
    private Map<String, List<UUID>> entityOfferings = new HashMap<>();
    private File missionsDir;
    private  File entityMissionsFile;
    
    public MissionManager(String modId, File missionsDir, File entityMissionsFile) {
        this.modId = modId;
        this.missionsDir = missionsDir;
        this.entityMissionsFile = entityMissionsFile;
        this.gson = new GsonBuilder()
                .registerTypeAdapter(MissionOffering.class, new MissionOffering.Deserializer())
                
                .registerTypeAdapter(Goal.class, new Goal.Deserializer())
                
                .registerTypeAdapter(KillEntityAction.class, new KillEntityAction.Deserializer())
                .registerTypeAdapter(ObtainItemAction.class, new ObtainItemAction.Deserializer())
                .registerTypeAdapter(GoToLocationAction.class, new GoToLocationAction.Deserializer())
                
                .registerTypeAdapter(ItemReward.class, new ItemReward.Deserializer())
                
                .registerTypeHierarchyAdapter(Action.class, new TypeHierarchyDeserializer<>()
                        .registerType(KillEntityAction.class)
                        .registerType(ObtainItemAction.class)
                        .registerType(GoToLocationAction.class))
                
                .registerTypeAdapter(MissionReward.class, new TypeHierarchyDeserializer<>()
                        .registerType(ItemReward.class)
                        )
        .create();
        
        reload();
    }
    
    private void reload() {
        loadCustomMissionOfferings();
        loadBuiltInMissionOfferings();
        loadEntityMissionsMappings();
    }
    
    private void loadEntityMissionsMappings() {
        if(!entityMissionsFile.exists()) {
            return;
        }
        try(Reader reader = new FileReader(entityMissionsFile)) {
            Map<?, ?> result = gson.fromJson(reader, Map.class);
            for(Entry<?, ?> entry: result.entrySet()) {
                String entityName = (String) entry.getKey();
                List<UUID> offeringIds = new ArrayList<>();
                List<?> missionNames = (List<?>) entry.getValue();
                for(Object missionName: missionNames) {
                    MissionOffering offering = offeringsByName.get(missionName);
                    if(offering != null) {
                        offeringIds.add(offering.getId());
                    }
                }
                entityOfferings.put(entityName, offeringIds);
            }
        } catch (JsonSyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JsonIOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public void updateOfferings(Collection<MissionOffering> missionOfferings) {
        offeringsByName.clear();
        offeringsById.clear();
        missionOfferings.stream().forEach(m -> {
            offeringsByName.put(m.getMissionName(), m);
            offeringsById.put(m.getId(), m);
        });
        log.info("Updated " + missionOfferings.size() + " mission offerings");
    }
    
    public void updateEntityOfferings(Map<String, List<UUID>> entityOfferings) {
        this.entityOfferings.clear();
        this.entityOfferings.putAll(entityOfferings);
    }
    
    public Map<String, List<UUID>> getEntityMissionOfferings() {
        return entityOfferings;
    }
    
    public Collection<MissionOffering> getOfferings() {
        return offeringsByName.values();
    }
    
    public MissionOffering getOffering(String missionName) {
        return offeringsByName.get(missionName);
    }
    
    public MissionOffering getOffering(UUID id) {
        return offeringsById.get(id);
    }

    private void loadBuiltInMissionOfferings() {
        FileSystem filesystem = null;

        try {
            URL url = AdvancementManager.class.getResource("/assets/" + modId + "/sounds.json");

            if (url != null) {
                URI uri = url.toURI();
                Path path;

                if ("file".equals(uri.getScheme())) {
                    URL resource = CraftingManager.class.getResource("/assets/" + modId + "/missions");
                    if(resource == null) {
                        return;
                    }
                    path = Paths.get(resource.toURI());
                } else {
                    if (!"jar".equals(uri.getScheme())) {
                        log.error("Unsupported scheme " + uri + " trying to list all built-in missions");
                        // this.hasErrored = true;
                        return;
                    }

                    filesystem = FileSystems.newFileSystem(uri, Collections.emptyMap());
                    path = filesystem.getPath("/assets/" + modId + "/missions");
                }

                Iterator<Path> iterator = Files.walk(path).iterator();

                while (iterator.hasNext()) {
                    Path path1 = iterator.next();

                    if ("json".equals(FilenameUtils.getExtension(path1.toString()))) {

                        try(BufferedReader bufferedreader = Files.newBufferedReader(path1)) {
                            MissionOffering missionOffering = JsonUtils.fromJson(gson, bufferedreader,
                                    MissionOffering.class);
                            offeringsByName.putIfAbsent(missionOffering.getMissionName(), missionOffering);
                            offeringsById.putIfAbsent(missionOffering.getId(), missionOffering);
                        } catch (JsonParseException jsonparseexception) {
                            log.error("Parsing error loading built-in mission " + path1,
                                    (Throwable) jsonparseexception);
                            // this.hasErrored = true;
                        } catch (IOException ioexception) {
                            log.error("Couldn't read mission from " + path1,
                                    (Throwable) ioexception);
                            // this.hasErrored = true;
                        }
                    }
                }

                return;
            }

            log.error("Couldn't find mod resource root");
            // this.hasErrored = true;
        } catch (IOException | URISyntaxException urisyntaxexception) {
            log.error("Couldn't get a list of all built-in mission files", (Throwable) urisyntaxexception);
            // this.hasErrored = true;
            return;
        } finally {
            IOUtils.closeQuietly((Closeable) filesystem);
        }
    }

    private void loadCustomMissionOfferings() {
        this.missionsDir.mkdirs();

        for (File file1 : FileUtils.listFiles(this.missionsDir, new String[] { "json" }, true)) {
            try {
                MissionOffering missionOffering = JsonUtils.fromJson(gson, new FileReader(file1), MissionOffering.class);

                if (missionOffering == null) {
                    log.error("Couldn't load custom mission from " + file1 + " as it's empty or null");
                } else {
                    offeringsByName.put(missionOffering.getMissionName(), missionOffering);
                    offeringsById.put(missionOffering.getId(), missionOffering);
                }
            } catch (IllegalArgumentException | JsonParseException jsonparseexception) {
                log.error("Parsing error loading custom mission from " + file1,
                        (Throwable) jsonparseexception);
                // this.hasErrored = true;
            } catch (IOException ioexception) {
                log.error("Couldn't read custom mission from " + file1,
                        (Throwable) ioexception);
                // this.hasErrored = true;
            }
        }
    }

    public Map<UUID, MissionOffering> getEntityMissionOfferings(String name) {
        List<UUID> entityOfferingUuids = this.entityOfferings.get(name);
        Map<UUID, MissionOffering> result = null;
        if(entityOfferingUuids != null) {
            
            result = entityOfferingUuids.stream().map(id -> offeringsById.get(id)).filter(o -> o != null)
                    .collect(Collectors.toMap(e -> e.getId(), e -> e));
        } else {
            result = Collections.emptyMap();
        }
        return result;
    }

}
