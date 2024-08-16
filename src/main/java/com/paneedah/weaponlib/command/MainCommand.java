package com.paneedah.weaponlib.command;

import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import net.minecraft.block.Block;
import net.minecraft.client.resources.I18n;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

import java.util.*;

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.utils.ModReference.ID;

public class MainCommand extends CommandBase {

    private static final String SHOW_OPTION_RECIPE = "recipe";

    private static final String SHOW_OPTION_ATTACHMENTS = "attachments";

    private static final String ARG_SHOW = "show";

    private final String mainCommandName;
    private final ModContext modContext;

    public MainCommand(ModContext modContext) {
        this.modContext = modContext;
        this.mainCommandName = ID;
    }

    @Override
    public String getName() {
        return ID;
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "/" + mainCommandName + "<options>";
    }

    private String getSubCommandShowUsage() {
        return String.format("/%s %s recipe|attachments", mainCommandName, ARG_SHOW);
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {


        if (args[0].equals("nosway")) {
            ClientEventHandler.cancelSway = !ClientEventHandler.cancelSway;

        }

        if (args.length > 0) {
            if (ARG_SHOW.indexOf(args[0].toLowerCase()) == 0) {
                processShowSubCommand(args);
            } else {
                MC.player.sendMessage(new TextComponentString(getUsage(sender)));
            }
        } else {
            MC.player.sendMessage(new TextComponentString(getUsage(sender)));
        }
    }

    private void processShowSubCommand(String[] args) {
        if (args.length < 2) {
            MC.player.sendMessage(new TextComponentString(getSubCommandShowUsage()));
            return;
        }

        if (SHOW_OPTION_RECIPE.indexOf(args[1].toLowerCase()) == 0) {
            showRecipe();
        } else if (SHOW_OPTION_ATTACHMENTS.indexOf(args[1].toLowerCase()) == 0) {
            int page = 1;
            if (args.length == 3) {
                page = Integer.parseInt(args[2]);
            }
            showAttachments(page);
        } else {
            MC.player.sendMessage(new TextComponentString(getSubCommandShowUsage()));
        }
    }

    private void showAttachments(int page) {
        ItemStack itemStack = MC.player.getHeldItemMainhand();
        if (itemStack != null) {
            Item item = itemStack.getItem();
            if (item instanceof AttachmentContainer) {

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
                if (page < 1) {
                    MC.player.sendMessage(new TextComponentString("Invalid page"));
                } else if (sorted.size() == 0) {
                    MC.player.sendMessage(new TextComponentString("No attachments found for "
                            + item.getItemStackDisplayName(itemStack)));
                } else if (offset < sorted.size()) {
                    MC.player.sendMessage(new TextComponentString("Attachments for "
                            + item.getItemStackDisplayName(itemStack) + ", page " + page + " of "
                            + (int) Math.ceil((double) sorted.size() / pageSize)));

                    for (int i = offset; i < offset + pageSize; i++) {
                        if (i < 0 || i >= sorted.size()) {
                            break;
                        }
                        MC.player.sendMessage(new TextComponentString(" - "
                                + sorted.get(i).getAttachment().getItemStackDisplayName(null)));
                    }
                } else {
                    MC.player.sendMessage(new TextComponentString("Invalid page"));
                }
            }
        }
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }

    private void showRecipe() {
        ItemStack itemStack = MC.player.getHeldItemMainhand();
        if (itemStack != null) {
            Item item = itemStack.getItem();
            showRecipe(item);
        }
    }

    private void showRecipe(Item item) {
        if (item != null && (item instanceof Weapon)) {
            MC.player.sendMessage(new TextComponentString(TextFormatting.GOLD + "-- Recipe for " + TextFormatting.GRAY + item.getItemStackDisplayName(null) + TextFormatting.GOLD + "--"));

            CraftingEntry[] modernRecipe = ((Weapon) item).getModernRecipe();
            if (modernRecipe == null) {
                return;
            }
            for (CraftingEntry stack : modernRecipe) {
                String toPrint = "> " + stack.getCount() + "x " + TextFormatting.WHITE + I18n.format(stack.getIngredient().toString() + ".name");
                // Appends the disassembly to the end of the string
                toPrint += " -> " + (stack.getCount() * stack.getYield()) + "x " + I18n.format(stack.getIngredient().toString() + ".name");

                MC.player.sendMessage(new TextComponentString(TextFormatting.GOLD + toPrint));
            }
             
            /*
            List<Object> recipe = modContext.getRecipeManager().getRecipe(item);
            if(recipe != null) {
                formatRecipe(recipe);
            } else {
                compatibility.addChatMessage(MC.player,
                        "Recipe for " + item.getItemStackDisplayName(null) + " not found");
            }*/
        }
    }

    private String formatRecipe(List<Object> recipe) {
        String output = "";
        Map<Character, Object> decoder = new HashMap<>();

        boolean inRow = true;
        for (int i = 0; i < recipe.size(); i++) {
            Object element = recipe.get(i);
            if (inRow && !(element instanceof String)) {
                inRow = false;
            }
            if (!inRow) {
                if (element instanceof Character && recipe.size() > i + 1) {
                    Object value = recipe.get(i + 1);
                    if (value instanceof Item) {
                        value = ((Item) value).getItemStackDisplayName(null);
                    } else if (value instanceof Block) {
                        value = ((Block) value).getLocalizedName();
                    }
                    decoder.put((Character) element, value);
                    i++;
                }
            }
        }

        MC.player.sendMessage(new TextComponentString(""));

        for (int i = 0; i < recipe.size(); i++) {
            Object element = recipe.get(i);
            if (element instanceof String) {
                StringBuilder builder = new StringBuilder();
                for (Character c : ((String) element).toCharArray()) {
                    Object decoded = decoder.get(c);
                    builder.append(String.format("[%.20s] ", decoded != null ? decoded : "*"));
                }
                MC.player.sendMessage(new TextComponentString(
                        String.valueOf(builder)));
            } else {
                break;
            }
        }

        return output;
    }
}
