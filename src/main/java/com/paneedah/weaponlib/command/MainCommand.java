package com.paneedah.weaponlib.command;

import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import net.minecraft.client.resources.I18n;
import net.minecraft.command.ICommandSender;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;

import java.util.*;

import static com.paneedah.mwc.ProjectConstants.ID;
import static com.paneedah.mwc.proxies.ClientProxy.MC;

/**
 * The Main Command for MWC, "/mwc"
 */
public class MainCommand extends TidyCommand {

    private static final String MAIN_SHOW = "show";
    private static final String SUB_RECIPE = "recipe";
    private static final String SUB_ATTACHMENTS = "attachments";
    private static final String MAIN_TOGGLE = "togglesway";

    public MainCommand() {
        super(ID, "MWC");

        addMainOption(MAIN_TOGGLE, "Toggles weapon sway on/off");
        addMainOption(MAIN_SHOW, "Show item info");

        addSubOption(MAIN_SHOW, SUB_RECIPE, "Show recipe for held weapon");
        addSubOption(MAIN_SHOW, SUB_ATTACHMENTS, "Show attachments for held weapon", "page");

        initCommand();
    }

    @Override
    protected void executeTidyCommand(ICommandSender sender, String mainArg, String subArg, String[] args) {

        switch (mainArg.toLowerCase()) {

            case MAIN_TOGGLE: {
                ClientEventHandler.cancelSway = !ClientEventHandler.cancelSway;
                sendFormattedMessage(sender,
                        "Weapon sway toggled to " + ClientEventHandler.cancelSway);
                return;
            }

            case MAIN_SHOW: {
                handleShow(sender, subArg, args);
                return;
            }

            default:
                sendFormattedMessage(sender, getErrorColor() + "Unknown command option.");
        }
    }

    private void handleShow(ICommandSender sender, String subArg, String[] args) {

        if (subArg.isEmpty() || !checkForSecondaryArgument(MAIN_SHOW, subArg)) {
            sendOptionHelp(sender, MAIN_SHOW);
            return;
        }

        switch (subArg.toLowerCase()) {

            case SUB_RECIPE:
                showRecipe(sender);
                return;

            case SUB_ATTACHMENTS:
                int page = 1;
                if (args.length >= 1) {
                    try {
                        page = Integer.parseInt(args[0]);
                    } catch (NumberFormatException ignored) {}
                }
                showAttachments(sender, page);
                return;
        }
    }

    /**
     * Shows all attachments for the held item
     *
     * @param page What page should be shown
     */
    private void showAttachments(ICommandSender sender, int page) {

        ItemStack stack = MC.player.getHeldItemMainhand();
        Item item = stack.getItem();

        if (!(item instanceof AttachmentContainer)) {
            sendFormattedMessage(sender, getErrorColor() + "This item has no attachments.");
            return;
        }

        AttachmentContainer container = (AttachmentContainer) item;

        Collection<CompatibleAttachment<? extends AttachmentContainer>> attachments =
                container.getCompatibleAttachments(
                        AttachmentCategory.BULLET,
                        AttachmentCategory.GRIP,
                        AttachmentCategory.MAGAZINE,
                        AttachmentCategory.SCOPE,
                        AttachmentCategory.SILENCER,
                        AttachmentCategory.SKIN);

        List<CompatibleAttachment<? extends AttachmentContainer>> sorted = new ArrayList<>(attachments);
        sorted.sort(Comparator.comparing(c -> c.getAttachment().getTranslationKey()));

        int pageSize = 8;
        int offset = (page - 1) * pageSize;

        if (sorted.isEmpty()) {
            sendFormattedMessage(sender,
                    "No attachments found for " + stack.getDisplayName());
            return;
        }

        if (page < 1 || offset >= sorted.size()) {
            sendFormattedMessage(sender, getErrorColor() + "Invalid page.");
            return;
        }

        int totalPages = (int) Math.ceil(sorted.size() / (double) pageSize);

        sendNormalMessage(sender,
                TextFormatting.GOLD + "-- Attachments for "
                        + TextFormatting.GRAY + stack.getDisplayName()
                        + ", page " + TextFormatting.GREEN + page
                        + TextFormatting.GRAY + " of "
                        + TextFormatting.GREEN + totalPages
                        + TextFormatting.GOLD + " --"
        );

        for (int i = offset; i < offset + pageSize && i < sorted.size(); i++) {
            CompatibleAttachment<?> ca = sorted.get(i);
            sendNormalMessage(sender,
                    " - " + ca.getAttachment().getItemStackDisplayName(null));
        }
    }


    /**
     * Shows the recipe for the held item
     */
    private void showRecipe(ICommandSender sender) {

        ItemStack stack = MC.player.getHeldItemMainhand();
        Item item = stack.getItem();

        if (!(item instanceof Weapon)) {
            sendFormattedMessage(sender,
                    getErrorColor() + "This item does not have a recipe.");
            return;
        }

        CraftingEntry[] recipe = ((Weapon) item).getCraftingRecipe();
        if (recipe == null) {
            sendFormattedMessage(sender,
                    getErrorColor() + "No recipe found.");
            return;
        }

        sendNormalMessage(sender,
                TextFormatting.GOLD + "-- Recipe for "
                        + TextFormatting.GRAY + item.getItemStackDisplayName(null)
                        + TextFormatting.GOLD + " --");

        for (CraftingEntry entry : recipe) {
            String name = I18n.format(entry.getIngredient().toString() + ".name");
            String line = "> " + entry.getCount() + "x "
                    + TextFormatting.WHITE + name
                    + TextFormatting.GRAY + " -> "
                    + TextFormatting.GREEN + (entry.getCount() * entry.getYield()) + "x "
                    + name;

            sendNormalMessage(sender, TextFormatting.GOLD + line);
        }
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
}
