package com.paneedah.mwc.context;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.instancing.PlayerWeaponInstance;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.ScreenShakingAnimationManager;
import com.paneedah.weaponlib.command.DebugCommand;
import com.paneedah.weaponlib.command.MainCommand;
import com.paneedah.weaponlib.compatibility.CompatibleRenderingRegistry;
import com.paneedah.weaponlib.electronics.EntityWirelessCamera;
import com.paneedah.weaponlib.electronics.WirelessCameraRenderer;
import com.paneedah.weaponlib.grenade.*;
import com.paneedah.weaponlib.inventory.InventoryTabs;
import com.paneedah.weaponlib.melee.ItemMelee;
import com.paneedah.weaponlib.melee.MeleeRenderer;
import com.paneedah.weaponlib.melee.PlayerMeleeInstance;
import com.paneedah.weaponlib.perspective.PerspectiveManager;
import lombok.Getter;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import java.util.HashMap;
import java.util.Map;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public final class ClientModContext extends CommonModContext {

    private ClientEventHandler clientEventHandler;
    private CompatibleRenderingRegistry rendererRegistry;

    @Getter private PerspectiveManager viewManager;

    @Getter private Map<Object, Integer> inventoryTextureMap;

    private EffectManager effectManager;

    @Getter private ScreenShakingAnimationManager playerRawPitchAnimationManager;

    @Override
    public void preInit() {
        super.preInit();

        ClientCommandHandler.instance.registerCommand(new DebugCommand());

        ClientCommandHandler.instance.registerCommand(new MainCommand());

        rendererRegistry = new CompatibleRenderingRegistry();

        rendererRegistry.preInit();

        MinecraftForge.EVENT_BUS.register(new WeaponEventHandler());

        KeyBindings.init();

        clientEventHandler = new ClientEventHandler();
        MinecraftForge.EVENT_BUS.register(clientEventHandler);

        MinecraftForge.EVENT_BUS.register(InventoryTabs.getInstance());

        MinecraftForge.EVENT_BUS.register(clientEventHandler); // TODO: what are the implications of registering the same class with 2 buses

        viewManager = new PerspectiveManager();
        inventoryTextureMap = new HashMap<>();

        effectManager = new ClientEffectManager();

        playerRawPitchAnimationManager = new ScreenShakingAnimationManager();
    }

    @Override
    public void init() {
        super.init();

        rendererRegistry.registerEntityRenderingHandler(WeaponSpawnEntity.class, new SpawnEntityRenderer());
        rendererRegistry.registerEntityRenderingHandler(EntityWirelessCamera.class, new WirelessCameraRenderer());
        rendererRegistry.registerEntityRenderingHandler(EntityShellCasing.class, new ShellCasingRenderer());
        rendererRegistry.registerEntityRenderingHandler(EntityGrenade.class, new EntityGrenadeRenderer());
        rendererRegistry.registerEntityRenderingHandler(EntitySmokeGrenade.class, new EntityGrenadeRenderer());
        rendererRegistry.registerEntityRenderingHandler(EntityGasGrenade.class, new EntityGrenadeRenderer());
        rendererRegistry.registerEntityRenderingHandler(EntityFlashGrenade.class, new EntityGrenadeRenderer());
        rendererRegistry.registerEntityRenderingHandler(EntitySpreadable.class, new InvisibleEntityRenderer());
        //rendererRegistry.registerEntityRenderingHandler(EntityVehicle.class, new RenderVehicle());

        rendererRegistry.processDelayedRegistrations();
    }

    @Override
    public void registerWeapon(String name, Weapon weapon, WeaponRenderer renderer) {
        super.registerWeapon(name, weapon, renderer);
        rendererRegistry.register(weapon, weapon.getName(), weapon.getRenderer());
    }

    @Override
    public void registerRenderableItem(String name, Item item, Object renderer) {
        super.registerRenderableItem(name, item, renderer);
        rendererRegistry.register(item, name, renderer);
    }

    @Override
    public void registerRenderableItem(ResourceLocation name, Item item, Object renderer) {
        super.registerRenderableItem(name, item, renderer);
        rendererRegistry.register(item, name, renderer);
    }

    @Override
    protected EntityPlayer getPlayer(MessageContext ctx) {
        return MC.player;
    }

    public SyncManager<?> getSyncManager() {
        return syncManager;
    }

    @Override
    public PlayerWeaponInstance getMainHeldWeapon() {
        return getPlayerItemInstanceRegistry().getMainHandItemInstance(MC.player, PlayerWeaponInstance.class);
    }

    public PlayerMeleeInstance getMainHeldMeleeWeapon() {
        return getPlayerItemInstanceRegistry().getMainHandItemInstance(MC.player, PlayerMeleeInstance.class);
    }

    @Override
    public void registerMeleeWeapon(String name, ItemMelee itemMelee, MeleeRenderer renderer) {
        super.registerMeleeWeapon(name, itemMelee, renderer);
        rendererRegistry.register(itemMelee, itemMelee.getName(), itemMelee.getRenderer());
    }

    @Override
    public void registerGrenadeWeapon(String name, ItemGrenade itemGrenade, GrenadeRenderer renderer) {
        super.registerGrenadeWeapon(name, itemGrenade, renderer);
        rendererRegistry.register(itemGrenade, itemGrenade.getName(), itemGrenade.getRenderer());
    }

    @Override
    public EffectManager getEffectManager() {
        return effectManager;
    }

    @Override
    public void registerRenderableEntity(Class<? extends Entity> entityClass, Object renderer) {
        rendererRegistry.registerEntityRenderingHandler(entityClass, renderer);
    }

}
