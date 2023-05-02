package com.paneedah.weaponlib.command;

import com.paneedah.mwc.bases.ManufacturingItemBase;
import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.compatibility.CompatibleClientEventHandler;
import com.paneedah.weaponlib.compatibility.CompatibleCommand;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import net.minecraft.block.Block;
import net.minecraft.client.resources.I18n;
import net.minecraft.command.ICommandSender;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;

import java.util.*;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class MainCommand extends CompatibleCommand {

    private static final String SHOW_OPTION_RECIPE = "recipe";

    private static final String SHOW_OPTION_ATTACHMENTS = "attachments";

    private static final String ARG_SHOW = "show";

    private String mainCommandName;
    private ModContext modContext;

    public MainCommand(ModContext modContext) {
        this.modContext = modContext;
        this.mainCommandName = ModReference.id;
    }

    @Override
    public String getCompatibleName() {
        return ModReference.id;
    }

    @Override
    public String getCompatibleUsage(ICommandSender sender) {
        return "/" + mainCommandName + "<options>";
    }

    private String getSubCommandShowUsage() {
        return String.format("/%s %s recipe|attachments", mainCommandName, ARG_SHOW);
    }

    @Override
    public void execCommand(ICommandSender sender, String[] args) {
    	
    	
    	if(args[0].equals("nosway")) {
    		CompatibleClientEventHandler.cancelSway = !CompatibleClientEventHandler.cancelSway;
    		
    	}
    	
        if (args.length > 0) {
            if(ARG_SHOW.indexOf(args[0].toLowerCase()) == 0) {
                processShowSubCommand(args);
            } else {
                compatibility.addChatMessage(compatibility.clientPlayer(), getCompatibleUsage(sender));
            }
        } else {
            compatibility.addChatMessage(compatibility.clientPlayer(), getCompatibleUsage(sender));
        }
    }

    private void processShowSubCommand(String[] args) {
        if(args.length < 2) {
            compatibility.addChatMessage(compatibility.clientPlayer(), getSubCommandShowUsage());
            return;
        }

        if(SHOW_OPTION_RECIPE.indexOf(args[1].toLowerCase()) == 0) {
            showRecipe();
        } else if(SHOW_OPTION_ATTACHMENTS.indexOf(args[1].toLowerCase()) == 0) {
            int page = 1;
            if(args.length == 3) {
                page = Integer.parseInt(args[2]);
            }
            showAttachments(page);
        } else {
            compatibility.addChatMessage(compatibility.clientPlayer(), getSubCommandShowUsage());
        }
    }

    private void showAttachments(int page) {
        ItemStack itemStack = compatibility.getHeldItemMainHand(compatibility.clientPlayer());
        if(itemStack != null) {
            Item item = itemStack.getItem();
            if(item instanceof AttachmentContainer) {

                AttachmentContainer container = (AttachmentContainer) item;
                Collection<CompatibleAttachment<? extends AttachmentContainer>> compatibleAttachments = container.getCompatibleAttachments(
                        AttachmentCategory.BULLET,
                        AttachmentCategory.GRIP,
                        AttachmentCategory.MAGAZINE,
                        AttachmentCategory.SCOPE,
                        AttachmentCategory.SILENCER,
                        AttachmentCategory.SKIN);
                List<CompatibleAttachment<? extends AttachmentContainer>> sorted = new ArrayList<>(compatibleAttachments);
                sorted.sort((c1, c2) -> c1.getAttachment().getTranslationKey().compareTo(c2.getAttachment().getTranslationKey()));
                int pageSize = 8;
                int offset = pageSize * (page - 1);
                if(page < 1) {
                    compatibility.addChatMessage(compatibility.clientPlayer(), "Invalid page");
                } else if(sorted.size() == 0) {
                    compatibility.addChatMessage(compatibility.clientPlayer(), "No attachments found for "
                            + item.getItemStackDisplayName(itemStack));
                } else if(offset < sorted.size()) {
                    compatibility.addChatMessage(compatibility.clientPlayer(), "Attachments for "
                            + item.getItemStackDisplayName(itemStack) + ", page " + page + " of "
                            + (int)Math.ceil((double)sorted.size() / pageSize));

                    for(int i = offset; i < offset + pageSize; i++) {
                        if(i < 0 || i >= sorted.size()) {
                            break;
                        }
                        compatibility.addChatMessage(compatibility.clientPlayer(), " - "
                                + sorted.get(i).getAttachment().getItemStackDisplayName(null));
                    }
                } else {
                    compatibility.addChatMessage(compatibility.clientPlayer(), "Invalid page");
                }
            }
        }
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }

    private void showRecipe() {
        ItemStack itemStack = compatibility.getHeldItemMainHand(compatibility.clientPlayer());
        if(itemStack != null) {
            Item item = itemStack.getItem();
            showRecipe(item);
        }
    }

    private void showRecipe(Item item) {
        if(item != null && (item instanceof Weapon)) {
           // compatibility.addChatMessage(compatibility.clientPlayer(), "");
            compatibility.addChatMessage(compatibility.clientPlayer(), TextFormatting.GOLD +
                    "-- Recipe for " + TextFormatting.GRAY +  item.getItemStackDisplayName(null) + TextFormatting.GOLD + "--");
           
            CraftingEntry[] modernRecipe = ((Weapon) item).getModernRecipe();
            if(modernRecipe == null) {
            	return;
            }
            for(CraftingEntry stack : modernRecipe) {
            	
            	
            	String toPrint = "> " + stack.getCount() + "x " + TextFormatting.WHITE + I18n.format(stack.getItem().getTranslationKey() + ".name");
            	
            	// Appends the disassembly to the end of the string
            	if(stack.getItem() instanceof ManufacturingItemBase) {
                    ManufacturingItemBase craftingItem = (ManufacturingItemBase) stack.getItem();
            		System.out.println(craftingItem.getRecoveryChance());
            		toPrint += " -> " + (stack.getCount()*craftingItem.getRecoveryChance()) + "x " + I18n.format(craftingItem.getRegistryName() + ".name");
            	}
            	
            	compatibility.addChatMessage(compatibility.clientPlayer(), TextFormatting.GOLD + toPrint);
                 
            }
             
            /*
            List<Object> recipe = modContext.getRecipeManager().getRecipe(item);
            if(recipe != null) {
                formatRecipe(recipe);
            } else {
                compatibility.addChatMessage(compatibility.clientPlayer(),
                        "Recipe for " + item.getItemStackDisplayName(null) + " not found");
            }*/
        }
    }

    private String formatRecipe(List<Object> recipe) {
        StringBuilder output = new StringBuilder();
        Map<Character, Object> decoder = new HashMap<>();

        boolean inRow = true;
        for(int i = 0; i < recipe.size(); i++) {
            Object element = recipe.get(i);
            if(inRow && !(element instanceof String)) {
                inRow = false;
            }
            if(!inRow) {
                if(element instanceof Character && recipe.size() > i + 1) {
                    Object value = recipe.get(i + 1);
                    if(value instanceof Item) {
                        value = ((Item)value).getItemStackDisplayName(null);
                    } else if(value instanceof Block) {
                        value = ((Block)value).getLocalizedName();
                    }
                    decoder.put((Character)element, value);
                    i++;
                }
            }
        }

        compatibility.addChatMessage(compatibility.clientPlayer(), "");

        for(int i = 0; i < recipe.size(); i++) {
            Object element = recipe.get(i);
            if(element instanceof String) {
                StringBuilder builder = new StringBuilder();
                for(Character c: ((String) element).toCharArray()) {
                    Object decoded = decoder.get(c);
                    builder.append(String.format("[%.20s] ", decoded != null ? decoded : "*"));
                }
                compatibility.addChatMessage(compatibility.clientPlayer(),
                        "" + builder.toString());
            } else {
                break;
            }
        }

        return output.toString();
    }
}
