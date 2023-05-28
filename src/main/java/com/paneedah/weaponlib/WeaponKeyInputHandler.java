package com.paneedah.weaponlib;

import com.paneedah.weaponlib.animation.AnimationModeProcessor;
import com.paneedah.weaponlib.animation.DebugPositioner;
import com.paneedah.weaponlib.animation.OpenGLSelectionHelper;
import com.paneedah.weaponlib.compatibility.CompatibleExtraEntityFlags;
import com.paneedah.weaponlib.inventory.GuiHandler;
import com.paneedah.weaponlib.inventory.OpenCustomPlayerInventoryGuiMessage;
import com.paneedah.weaponlib.render.ModificationGUI;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import org.lwjgl.input.Keyboard;

import java.util.function.Function;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class WeaponKeyInputHandler {

    @SuppressWarnings("unused")
    private SimpleNetworkWrapper channel;
    private Function<MessageContext, EntityPlayer> entityPlayerSupplier;
    private ModContext modContext;

    public WeaponKeyInputHandler(ModContext modContext, Function<MessageContext, EntityPlayer> entityPlayerSupplier, WeaponAttachmentAspect attachmentAspect, SimpleNetworkWrapper channel) {
        this.modContext = modContext;
        this.entityPlayerSupplier = entityPlayerSupplier;
        this.channel = channel;
    }

    @SubscribeEvent
    public final void onKeyInput(InputEvent.KeyInputEvent event) {

        EntityPlayer player = entityPlayerSupplier.apply(null);
        ItemStack itemStack = player.getHeldItemMainhand();

	    boolean altMode = false;
	    if(DebugPositioner.isDebugModeEnabled()) {
	        altMode = Keyboard.isKeyDown(KeyBindings.altModeDebugKey.getKeyCode());
	    }
	    
	   
//	    System.out.println("Alt mode: " + altMode);
	    
//	    if(DebugPositioner.isDebugModeEnabled()) {
//	        KeyBindings.bindDebugKeys();
//        }
	    
	    /*
	    try {
	    	//System.out.println(KeyBindings.jDebugKey);
	    	if(ClientEventHandler.muzzlePositioner) {
		    	double incr = 0.1;
		    	if(KeyBindings.upArrowKey.isPressed()) {
		    		ClientEventHandler.debugmuzzlePosition = ClientEventHandler.debugmuzzlePosition.add(0, incr, 0);
		    	} else if(KeyBindings.downArrowKey.isPressed()) {
		    		ClientEventHandler.debugmuzzlePosition = ClientEventHandler.debugmuzzlePosition.add(0, -incr, 0);
			    	
		    	} else if(KeyBindings.leftArrowKey.isPressed()) {
		    		ClientEventHandler.debugmuzzlePosition = ClientEventHandler.debugmuzzlePosition.add(incr, 0, 0);
			    	
		    	} else if(KeyBindings.rightArrowKey.isPressed()) {
		    		ClientEventHandler.debugmuzzlePosition = ClientEventHandler.debugmuzzlePosition.add(-incr, 0, 0);
			    	
		    	} else if(KeyBindings.jDebugKey.isPressed()) {
		    		ClientEventHandler.debugmuzzlePosition = ClientEventHandler.debugmuzzlePosition.add(0, 0, incr);
			    	
		    	} else if(KeyBindings.kDebugKey.isPressed()) {
		    		ClientEventHandler.debugmuzzlePosition = ClientEventHandler.debugmuzzlePosition.add(0, 0, -incr);
			    	
		    	}
		    }
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	    
   		*/

	    if(AnimationModeProcessor.getInstance().getFPSMode()) {
	    	if(Keyboard.isKeyDown(Keyboard.KEY_COMMA)) {
	    		System.out.println("hello");
	    		AnimationModeProcessor.getInstance().transformMode = 1;
	    	} else if(Keyboard.isKeyDown(Keyboard.KEY_PERIOD)) {
	    		System.out.println("hello");
	    		AnimationModeProcessor.getInstance().transformMode = 2;
	    	} else if(Keyboard.isKeyDown(Keyboard.KEY_END)) {
	    		OpenGLSelectionHelper.ballBuf.framebufferClear();
	    		AnimationModeProcessor.getInstance().transformMode = 3;
	    	}
	    
	    }
	    
	    
	    if(KeyBindings.openDoor.isPressed() && itemStack != null && !itemStack.isEmpty() && itemStack.getItem() instanceof Weapon) {
	    	
	    	Vec3d origin = player.getPositionVector().add(0, player.getEyeHeight(), 0);
	    	Vec3d direction = player.getLookVec().scale(5);
	    	
			RayTraceResult rtr = player.world.rayTraceBlocks(origin, origin.add(direction), false, true, false);
	 		if(rtr != null) {
	 			IBlockState state = player.world.getBlockState(rtr.getBlockPos());
	 			if(state.getBlock() instanceof BlockDoor) {
	 				
	 				mc.playerController.processRightClickBlock(mc.player, mc.world, rtr.getBlockPos(), rtr.sideHit, rtr.hitVec, EnumHand.MAIN_HAND);
	 				//modContext.getChannel().sendToServer(new OpenDoorPacket(rtr.getBlockPos()));
	 				
	 				
	 				/*
	 				BlockDoor door = (BlockDoor) state.getBlock();
	 				door.onBlockActivated(player.world, rtr.getBlockPos(), state, player, EnumHand.MAIN_HAND, EnumFacing.NORTH, (float) rtr.hitVec.x, (float) rtr.hitVec.y, (float) rtr.hitVec.z);
	 				*/
	 			}
	 		
	 		}
	    }
	    
	    
	    /*
	    if(!AnimationGUI.getInstance().magEdit.isState()) {
	    	if(DebugPositioner.isDebugModeEnabled() && KeyBindings.upArrowKey.isPressed()) {
	            DebugPositioner.incrementXRotation(5);
	        } else if(DebugPositioner.isDebugModeEnabled() && KeyBindings.downArrowKey.isPressed()) {
	            DebugPositioner.incrementXRotation(-5);
	        } else if(DebugPositioner.isDebugModeEnabled() && KeyBindings.leftArrowKey.isPressed()) {
	            DebugPositioner.incrementYRotation(5);
	        } else if(DebugPositioner.isDebugModeEnabled() && KeyBindings.rightArrowKey.isPressed()) {
	            DebugPositioner.incrementYRotation(-5);
	        } else if(DebugPositioner.isDebugModeEnabled() && KeyBindings.jDebugKey.isKeyDown()) {
	        //	System.out.println("yo");
	            DebugPositioner.incrementZRotation(5);
	        } else if(DebugPositioner.isDebugModeEnabled() && KeyBindings.kDebugKey.isKeyDown()) {
	            DebugPositioner.incrementZRotation(-5);
	        } else if(DebugPositioner.isDebugModeEnabled() && KeyBindings.minusDebugKey.isKeyDown()) {
	        
	            DebugPositioner.incrementXPosition(-1f, altMode);
	        } else if(DebugPositioner.isDebugModeEnabled() && KeyBindings.equalsDebugKey.isKeyDown()) {
	            DebugPositioner.incrementXPosition(1f, altMode);
	        } else if(DebugPositioner.isDebugModeEnabled() && KeyBindings.lBracketDebugKey.isKeyDown()) {
	            DebugPositioner.incrementYPosition(-1f, altMode);
	        } else if(DebugPositioner.isDebugModeEnabled() && KeyBindings.rBracketDebugKey.isKeyDown()) {
	            DebugPositioner.incrementYPosition(1f, altMode);
	        } else if(DebugPositioner.isDebugModeEnabled() && KeyBindings.semicolonDebugKey.isKeyDown()) {
	            DebugPositioner.incrementZPosition(-1f, altMode);
	        } else if(DebugPositioner.isDebugModeEnabled() && KeyBindings.apostropheDebugKey.isKeyDown()) {
	            DebugPositioner.incrementZPosition(1f, altMode);
	        } else if(DebugPositioner.isDebugModeEnabled() && KeyBindings.deleteDebugKey.isKeyDown()) {
	            DebugPositioner.reset();
	        }
	    } else {
	    	if(KeyBindings.upArrowKey.isKeyDown()) {
	    		ClientEventHandler.magRotPositioner = ClientEventHandler.magRotPositioner.add(0, 0.1, 0);
	    	} else if(KeyBindings.leftArrowKey.isKeyDown()) {
	    		ClientEventHandler.magRotPositioner =ClientEventHandler.magRotPositioner.add(-0.1, 0, 0);
	    	} else if(KeyBindings.rightArrowKey.isKeyDown()) {
	    		ClientEventHandler.magRotPositioner =ClientEventHandler.magRotPositioner.add(0.1, 0, 0);
	    	} else if(KeyBindings.downArrowKey.isKeyDown()) {
	    		ClientEventHandler.magRotPositioner =ClientEventHandler.magRotPositioner.add(0, -0.1, 0);
	    	} else if(KeyBindings.jDebugKey.isKeyDown()) {
	    		ClientEventHandler.magRotPositioner =ClientEventHandler.magRotPositioner.add(0, 0, 0.1);
	    	} else if(KeyBindings.kDebugKey.isKeyDown()) {
	    		ClientEventHandler.magRotPositioner =ClientEventHandler.magRotPositioner.add(0, 0, -0.1);
	    	}
	    }*/
	    
	     

         if(KeyBindings.reloadKey.isPressed()) {
            if(itemStack != null) {
           
            	
            	//modContext.getMainHeldWeapon().setIsAwaitingCompoundInstructions(true);
            	
                Item item = itemStack.getItem();
                if(item instanceof Reloadable) {
                    ((Reloadable) item).reloadMainHeldItemForPlayer(player);
                }
            }
        }
        
        else if(KeyBindings.unloadKey.isPressed()) {
            if(itemStack != null) {
                Item item = itemStack.getItem();
                if(item instanceof Reloadable) {
                    ((Reloadable) item).unloadMainHeldItemForPlayer(player);
                }
            }
        }
        
        else if(KeyBindings.inspectKey.isPressed()) {
            PlayerWeaponInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerWeaponInstance.class);
            if(itemStack != null) {
                Item item = itemStack.getItem();
                if(item instanceof Inspectable) {
                    ((Inspectable) item).inspectMainHeldItemForPlayer(player);
                }
              
            }
            /*
            if(instance != null && instance.getState() == WeaponState.MODIFYING) {
                instance.setAltModificationModeEnabled(!instance.isAltMofificationModeEnabled());
            } else if(itemStack != null) {
                Item item = itemStack.getItem();
                if(item instanceof Inspectable) {
                    ((Inspectable) item).inspectMainHeldItemForPlayer(player);
                }
            }
            */
        }

        else if(KeyBindings.laserSwitchKey.isPressed()) {
            PlayerWeaponInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerWeaponInstance.class);
            if(instance != null && (instance.getState() == WeaponState.READY || instance.getState() == WeaponState.MODIFYING)) {
                instance.setLaserOn(!instance.isLaserOn());
            }
        }

        else if(KeyBindings.nightVisionSwitchKey.isPressed()) {
            ItemStack helmetStack = mc.player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
            if(helmetStack != null && helmetStack.getItem() instanceof CustomArmor 
                    && ((CustomArmor)helmetStack.getItem()).hasNightVision()){
                modContext.getChannel().sendToServer(new ArmorControlMessage(true));
                NBTTagCompound tagCompound = helmetStack.getTagCompound();
                boolean nightVisionOn = tagCompound != null && tagCompound.getBoolean(ArmorControlHandler.TAG_NIGHT_VISION);
                mc.player.playSound(nightVisionOn ? modContext.getNightVisionOffSound() : modContext.getNightVisionOnSound(), 1, 1);
            } else {
                PlayerWeaponInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerWeaponInstance.class);
                if(instance != null && (instance.getState() == WeaponState.READY || instance.getState() == WeaponState.MODIFYING || instance.getState() == WeaponState.EJECT_REQUIRED)) {
                    instance.setNightVisionOn(!instance.isNightVisionOn());
                }
            }
        }

        else if(KeyBindings.attachmentKey.isPressed()) {
        	
            if(itemStack != null && itemStack.getItem() instanceof Modifiable /* && itemStack.getItem() instanceof Weapon*/) {
                ((Modifiable) itemStack.getItem()).toggleClientAttachmentSelectionMode(player);
                
                if(modContext.getMainHeldWeapon() != null) {
                	if((modContext.getMainHeldWeapon() .getState() == WeaponState.MODIFYING)
            				|| modContext.getMainHeldWeapon() .getState() == WeaponState.MODIFYING_REQUESTED
            				|| modContext.getMainHeldWeapon() .getState() == WeaponState.NEXT_ATTACHMENT
            				|| modContext.getMainHeldWeapon() .getState() == WeaponState.NEXT_ATTACHMENT_REQUESTED) {
                		ModificationGUI.getInstance().setupForWeapon(modContext.getMainHeldWeapon());
                	}
                }
                
               if(!mc.inGameHasFocus) {
            	   mc.setIngameFocus();
               }
                
            }
        }
        
        else if(KeyBindings.customInventoryKey.isPressed()) {
            modContext.getChannel().sendToServer(new OpenCustomPlayerInventoryGuiMessage(GuiHandler.CUSTOM_PLAYER_INVENTORY_GUI_ID));
        }

        /*
        else if(KeyBindings.upArrowKey.isPressed()) {
            PlayerWeaponInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerWeaponInstance.class);
            if(instance != null && instance.getState() == WeaponState.MODIFYING) {
                AttachmentCategory category = instance.isAltMofificationModeEnabled() 
                        ? AttachmentCategory.RAILING: AttachmentCategory.SCOPE;
                modContext.getAttachmentAspect().changeAttachment(category, instance);
            }
        }*/

         /*
        else if(KeyBindings.rightArrowKey.isPressed()) {
            PlayerItemInstance<?> instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player);
            if(instance instanceof PlayerWeaponInstance && instance.getState() == WeaponState.MODIFYING) {
                AttachmentCategory category = ((PlayerWeaponInstance) instance).isAltMofificationModeEnabled() 
                        ? AttachmentCategory.STOCK: AttachmentCategory.SKIN;
                modContext.getAttachmentAspect().changeAttachment(category, (PlayerWeaponInstance) instance);
            } else if(instance instanceof PlayerMeleeInstance && instance.getState() == MeleeState.MODIFYING) {
                modContext.getMeleeAttachmentAspect().changeAttachment(AttachmentCategory.SKIN, (PlayerMeleeInstance) instance);
            } else if(instance instanceof PlayerTabletInstance) {
                PlayerTabletInstance playerTabletInstance = (PlayerTabletInstance) instance;
                playerTabletInstance.nextActiveWatchIndex();
            }
        }

        else if(KeyBindings.downArrowKey.isPressed()) {
            PlayerWeaponInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerWeaponInstance.class);
            if(instance != null && instance.getState() == WeaponState.MODIFYING) {
                AttachmentCategory category = instance.isAltMofificationModeEnabled() 
                        ? AttachmentCategory.GUARD: AttachmentCategory.GRIP;
                modContext.getAttachmentAspect().changeAttachment(category, instance);
            }
        }
        
        else if(KeyBindings.laserAttachmentKey.isPressed()) {
            PlayerWeaponInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerWeaponInstance.class);
            if(instance != null && instance.getState() == WeaponState.MODIFYING) {
                AttachmentCategory category = instance.isAltMofificationModeEnabled() 
                        ? AttachmentCategory.BACKGRIP: AttachmentCategory.LASER;
                modContext.getAttachmentAspect().changeAttachment(category, instance);
            }
        }

        else if(KeyBindings.leftArrowKey.isPressed()) {
            PlayerItemInstance<?> instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player);
            if(instance instanceof PlayerWeaponInstance && instance.getState() == WeaponState.MODIFYING) {
                AttachmentCategory category = ((PlayerWeaponInstance) instance).isAltMofificationModeEnabled() 
                        ? AttachmentCategory.RECEIVER: AttachmentCategory.SILENCER;
                modContext.getAttachmentAspect().changeAttachment(category, (PlayerWeaponInstance) instance);
            } else if(instance instanceof PlayerTabletInstance) {
                PlayerTabletInstance playerTabletInstance = (PlayerTabletInstance) instance;
                playerTabletInstance.previousActiveWatchIndex();
            }
        }
        
        else if(KeyBindings.periodKey.isPressed()) {
            PlayerItemInstance<?> instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player);
            if(instance instanceof PlayerWeaponInstance && instance.getState() == WeaponState.MODIFYING 
                    && ((PlayerWeaponInstance) instance).isAltMofificationModeEnabled()) {
                AttachmentCategory category = AttachmentCategory.FRONTSIGHT;
                modContext.getAttachmentAspect().changeAttachment(category, (PlayerWeaponInstance) instance);
            }
        }*/

        else if(KeyBindings.fireModeKey.isPressed()) {
            PlayerWeaponInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerWeaponInstance.class);
            if(instance != null && instance.getState() == WeaponState.READY) {
                instance.getWeapon().changeFireMode(instance);
            }
        }

        else if(KeyBindings.addKey.isPressed()) {
            PlayerWeaponInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerWeaponInstance.class);
            if(instance != null && (instance.getState() == WeaponState.READY || instance.getState() == WeaponState.EJECT_REQUIRED)) {
                instance.getWeapon().incrementZoom(instance);
            }
        }

        else if(KeyBindings.subtractKey.isPressed()) {
            PlayerWeaponInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerWeaponInstance.class);
            if (instance != null && (instance.getState() == WeaponState.READY || instance.getState() == WeaponState.EJECT_REQUIRED))
                instance.getWeapon().decrementZoom(instance);
        }

        else if (mc.isSingleplayer() && KeyBindings.proningSwitchKey.isPressed()) {
            modContext.getChannel().sendToServer(new EntityControlMessage(player, CompatibleExtraEntityFlags.PRONING | CompatibleExtraEntityFlags.FLIP, 0));
        }
    }
}
