package com.paneedah.weaponlib;

import com.paneedah.mwc.rendering.IModelSource;
import com.paneedah.mwc.rendering.TexturedModel;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.IModernCrafting;
import com.paneedah.weaponlib.grenade.GrenadeRenderableState;
import com.paneedah.weaponlib.melee.MeleeRenderableState;
import com.paneedah.weaponlib.melee.PlayerMeleeInstance;
import dev.redstudio.redcore.vectors.Vector3F;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class ItemAttachment<T> extends Item implements IModelSource, IModernCrafting {

	private AttachmentCategory category;
	private ApplyHandler<T> apply;
	private ApplyHandler<T> remove;
	protected ApplyHandler2<T> apply2;
	protected ApplyHandler2<T> remove2;
	protected MeleeWeaponApplyHandler<T> apply3;
	protected MeleeWeaponApplyHandler<T> remove3;
	public List<TexturedModel> texturedModels = new ArrayList<>();
	public List<TexturedModel> onWeaponTexturedModels = new ArrayList<>();
	private List<CustomRenderer<?>> postRenderer = new ArrayList<>();
	private CustomRenderer<?> preRenderer;
	private Part renderablePart;
	private String name;
	private Function<ItemStack, String> informationProvider;
	protected int maxStackSize = 1;

	private CraftingEntry[] modernRecipe;
	private CraftingGroup craftGroup;
	
	private List<CompatibleAttachment<T>> attachments = new ArrayList<>();

	private List<Weapon> compatibleWeapons = new ArrayList<>();
	
	private List<ItemAttachment<T>> requiredAttachments = new ArrayList<>();

	protected String textureName;
	
	public Vector3F rotationPoint = new Vector3F(0, 0, 0);
	

	public static interface ApplyHandler<T> {
		public void apply(ItemAttachment<T> itemAttachment, T target, EntityLivingBase player);
	}

	public static interface ApplyHandler2<T> {
		public void apply(ItemAttachment<T> itemAttachment, PlayerWeaponInstance instance);
	}

	public static interface MeleeWeaponApplyHandler<T> {
        public void apply(ItemAttachment<T> itemAttachment, PlayerMeleeInstance instance);
    }

	protected ItemAttachment(AttachmentCategory category, ModelBase model, String textureName, ApplyHandler<T> apply, ApplyHandler<T> remove) {
		this.category = category;
//		if(model != null) {
//			this.texturedModels.add(new Pair<ModelBase, String>(model, textureName));
//		}
		this.textureName = textureName;
		this.apply = apply;
		this.remove = remove;
	}

	protected ItemAttachment(AttachmentCategory category, ApplyHandler<T> apply, ApplyHandler<T> remove) {
		this.category = category;
		this.apply = apply;
		this.remove = remove;
	}

	@Override
	public int getItemStackLimit() {
		return maxStackSize;
	}

	public Item setTextureName(String name) {
		return this;
	}
	
	@Override
	public CraftingGroup getCraftingGroup() {
		return this.craftGroup;
	}
	
	public void setCraftingGroup(CraftingGroup cg) {
		this.craftGroup = cg;
	}
	
	public void setModernRecipe(CraftingEntry...is) {
		this.modernRecipe = is;
	}


	public Part getRenderablePart() {
		return renderablePart;
	}

	protected void setRenderablePart(Part renderablePart) {
		this.renderablePart = renderablePart;
	}

	protected Function<ItemStack, String> getInformationProvider() {
		return informationProvider;
	}

	protected void setInformationProvider(
			Function<ItemStack, String> informationProvider) {
		this.informationProvider = informationProvider;
	}
	
	protected void setRequiredAttachments(List<ItemAttachment<T>> requiredAttachments) {
        this.requiredAttachments = Collections.unmodifiableList(requiredAttachments);
    }
	
	public List<ItemAttachment<T>> getRequiredAttachments() {
        return requiredAttachments;
    }

	@Deprecated // Todo: Figure out why?
	public ItemAttachment<T> addModel(final TexturedModel texturedModel) {
		texturedModels.add(texturedModel);
		return this;
	}

	public ItemAttachment(AttachmentCategory category) {
		this(category, (a, w, p) -> {}, (a, w, p) -> {});
	}

	public ItemAttachment(AttachmentCategory category, ModelBase attachment, String textureName) {
		this(category, attachment, textureName, (a, w, p) -> {}, (a, w , p) -> {});
	}

	public AttachmentCategory getCategory() {
		return category;
	}

	public List<TexturedModel> getTexturedModels() {
		return texturedModels;
	}

	public List<TexturedModel> getOnWeaponTexturedModels() {
        return onWeaponTexturedModels;
    }

	/**
	 * For use with the "magic mag"
	 * @param model
	 */
	public void setFirstModel(ItemAttachment<Weapon> model) {
		//texturedModels.set(0, model.getTexturedModels().get(0));
	}

	public ApplyHandler<T> getApply() {
		return apply;
	}

	public ApplyHandler<T> getRemove() {
		return remove;
	}

	public void addCompatibleWeapon(Weapon weapon) {
		compatibleWeapons.add(weapon);
	}

	@Override
    public void addInformation(ItemStack itemStack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if(tooltip != null && informationProvider != null) {
			tooltip.add(informationProvider.apply(itemStack));
		}
		
//		if(getCategory() == AttachmentCategory.GRIP) {
			//tooltip.add("Here: " + this.getApply().apply(itemAttachment, target, player);)
		//}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPostRenderers(List<CustomRenderer<?>> postRenderer) {
		postRenderer = postRenderer;
	}


	@Override
	public CustomRenderer<RenderableState> getPostRenderer() {
		return postRenderer.isEmpty() ? null : (CustomRenderer<RenderableState>) postRenderer.get(0);
	}

	public CustomRenderer<MeleeRenderableState> getMeleePostRenderer() {
		return postRenderer.isEmpty() ? null : (CustomRenderer<MeleeRenderableState>) postRenderer.get(0);
	}

	public CustomRenderer<GrenadeRenderableState> getGrenadePostRenderer() {
		return postRenderer.isEmpty() ? null : (CustomRenderer<GrenadeRenderableState>) postRenderer.get(0);
	}
	
	public List<CustomRenderer<?>> getAllPostRenderers() {
		return postRenderer;
	}

	public CustomRenderer<?> getPreRenderer() {
		return preRenderer;
	}

	public void setPreRenderer(CustomRenderer<?> preRenderer) {
		this.preRenderer = preRenderer;
	}

	protected void addCompatibleAttachment(CompatibleAttachment<T> attachment) {
		attachments.add(attachment);
	}

	public List<CompatibleAttachment<T>> getAttachments() {
		return Collections.unmodifiableList(attachments);
	}

	@Override
	public String toString() {
		return name != null ? "Attachment [" + name + "]" : super.toString();
	}

	public ApplyHandler2<T> getApply2() {
		return apply2;
	}

	protected ApplyHandler2<T> getRemove2() {
		return remove2;
	}

    public MeleeWeaponApplyHandler<T> getApply3() {
        return apply3;
    }

    public MeleeWeaponApplyHandler<T> getRemove3() {
        return remove3;
    }

	public void setPostRenderer(List<CustomRenderer<?>> postRenderer2) {
		this.postRenderer = postRenderer2;

	}
	
	@Override
	public Item getItem() {
		return this;
	}

	@Override
	public CraftingEntry[] getModernRecipe() {
		return this.modernRecipe;
	}

	@Override
	public void setCraftingRecipe(CraftingEntry[] recipe) {
		this.modernRecipe = recipe;
	}

	@Override
	public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
		return true;
	}
}
