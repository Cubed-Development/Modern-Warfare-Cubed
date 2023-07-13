package com.paneedah.mwc.content.types;

import net.minecraftforge.fml.loading.FMLPaths;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TypeFile {
    public Types type;
    public String name, packName, folder;
    private final ArrayList<String> lines;
    public static HashMap<Types, ArrayList<TypeFile>> files;
    private int readerPosition = 0;
    private int hash = 0x12345678;

    static {
        files = new HashMap<>();
        for(Types type : Types.values()) {
            files.put(type, new ArrayList<>());
        }
    }

    public TypeFile(String packName, String folder, Types type, String fileName) {
        this(packName, folder, type, fileName, true);
    }

    public TypeFile(String packName, String folder, Types type, String fileName, boolean addToList) {
        this.type = type;
        this.packName = packName;
        this.folder = folder;
        name = fileName;
        lines = new ArrayList<>();
        if(addToList) files.get(type).add(this);
    }

    public void parseLine(String line) {
        lines.add(line);
        hash ^= line.hashCode();
    }

    public String readLine() {
        if(readerPosition == lines.size()) return null;
        return lines.get(readerPosition++);
    }

    public List<String> getLines() {
        return lines;
    }

    public File getAsFile() throws IOException {
        File file = new File(FMLPaths.GAMEDIR.get() + "/MWC/cache/"+packName+"/"+ folder+"/"+ name);
        /*
        if(!file.exists()) {
            file.getParentFile().mkdirs();
            file.createNewFile();
        }
        */

        FileWriter writer = new FileWriter(file);
        for(String string : lines) writer.write(string + System.lineSeparator());
        writer.flush();
        writer.close();

        return file;
    }

    @Override
    public int hashCode() {
        return hash;
    }
}
