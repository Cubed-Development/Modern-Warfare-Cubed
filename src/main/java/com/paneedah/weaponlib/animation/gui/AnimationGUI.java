package com.paneedah.weaponlib.animation.gui;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.WeaponAttachmentAspect.ChangeAttachmentPermit;
import com.paneedah.weaponlib.WeaponRenderer.Builder;
import com.paneedah.weaponlib.animation.AnimationModeProcessor;
import com.paneedah.weaponlib.animation.DebugPositioner;
import com.paneedah.weaponlib.animation.DebugPositioner.Position;
import com.paneedah.weaponlib.animation.OpenGLSelectionHelper;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import java.awt.Color;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class AnimationGUI {
	
	private static AnimationGUI instance = new AnimationGUI();
	
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(ModReference.ID + ":textures/hud/animguio.png");
	
	

	public ArrayList<Panel> panels = new ArrayList<>();

	public boolean mouseStatus = false;
	public boolean grabStatus = false;
	public boolean guiHoverStatus = false;
	
	public Button resetCamera = new Button("Reset Camera", 0, 10, 10, 20);
	public Button resetTransforms = new Button("Reset Transforms", 3, 35, 10, 20);
	public Button forceSteveArms = new Button("Force steve arms", 1, 60, 10, 20);
	public Button forceAlexArms = new Button("Force alex arms", 2, 85, 10, 20);
	public Button printConsole = new Button("Print to console", 6, 10, 35, 20);
	public Button switchScopes = new Button("Switch scopes", 8,  85, 35, 20);
	
	public Button axisToggle = new Button("Toggle axis indicator", true, 4, 110, 10, 20);
	public Button forceFlash = new Button("Position muzzle flash", true, 5, 135, 10, 20);
	
	public Button titleSafe = new Button("Center indicator", true, 9, 110, 35, 20);
	public Button editRotButton = new Button("Edit rotation point", true, 10, 35, 35, 20);
	public Button moveForward = new Button("Move axis backwards", true,7,  60, 35, 20);
	public Button leftDrag = new Button("Position drag alignment", true, 11, 135, 35, 20);
	public Button magEdit = new Button("Edit magazine rotation point", true, 12, 10, 80, 20);
	public Button forceADS = new Button("Force ADS", true, 13, 10, 80, 20);
	
	
	
	/*
	 * RECOIL
	 */
	public  Slider weaponPower = new Slider("Weapon Power", false, 0, 200);
	public  Slider muzzleClimbDivisor = new Slider("Muzzle Climb Divisor", false, 0, 30);
	public  Slider stockLength = new Slider("Stock Length", false, 0, 100);
	public  Slider powerRecoveryNormalRate = new Slider("Power Recovery", false, 0, 1.0);
	public  Slider powerRecoveryStockRate = new Slider("Power Recovery @ Stock", false, 0.0, 1.0);
	public  Slider weaponRotationX = new Slider("Recoil Rotation (Y)", false, 0, 1.0);
	public  Slider weaponRotationY = new Slider("Recoil Rotation (Z)", false, 0, 1.0);
	public  Slider adsSimilarity = new Slider("ADS Similarity", false, 1.0, 10);
	
	public Slider debugFireRate = new Slider("Debug Fire Rate", false, 1, 25);
	
	
	public static AnimationGUI getInstance() {
		//instance = new AnimationGUI();
		return instance;
	}
	
	public boolean isPanelClosed(String name) {
		for(Panel panel : this.panels) {
			if(panel.getTitle().equals(name)) return panel.isClosed();
		}
		return false;
	}
	
	public void setRecoilDefaults(RecoilParam param) {
		weaponPower.setValue(param.getWeaponPower());
		muzzleClimbDivisor.setValue(param.getMuzzleClimbDivisor());
		stockLength.setValue(param.getStockLength());
		powerRecoveryNormalRate.setValue(param.getPowerRecoveryNormalRate());
		powerRecoveryStockRate.setValue(param.getPowerRecoveryStockRate());
		weaponRotationX.setValue(param.getWeaponRotationX());
		weaponRotationY.setValue(param.getWeaponRotationY());
	}
	

	
	public RecoilParam getRecoilParams() { 
		return new RecoilParam(weaponPower.getValue(), muzzleClimbDivisor.getValue(), stockLength.getValue(), powerRecoveryNormalRate.getValue(), powerRecoveryStockRate.getValue(), weaponRotationX.getValue(), weaponRotationY.getValue(), adsSimilarity.getValue());
		
	}
	
	public AnimationGUI() {
	
		
		
		Panel cameraPanel = new Panel(this, "Functionality", 10, 10, 20);
		
		// cam reset 0
		cameraPanel.addButtons(resetCamera, resetTransforms, forceSteveArms, forceAlexArms, switchScopes, magEdit, leftDrag, printConsole, forceADS);
		
		Panel renderPanel = new Panel(this, "Rendering", 10, 45, 20);
		
		renderPanel.addButtons(axisToggle, forceFlash, editRotButton, moveForward, titleSafe);
		
		Panel recoilPanel = new Panel(this, "Recoil", 10, 100, 20);
		recoilPanel.setWidth(100);
		recoilPanel.setHeight(200);
		recoilPanel.setClosed(true);
		//System.out.println("CHECKEROO: " + weaponPower);
		
		setRecoilDefaults(new RecoilParam());
		debugFireRate.setValue(10);
		debugFireRate.push(25);
		
		recoilPanel.addElement(weaponPower);
		recoilPanel.addElement(muzzleClimbDivisor);
		recoilPanel.addElement(stockLength);
		recoilPanel.addElement(powerRecoveryNormalRate);
		recoilPanel.addElement(powerRecoveryStockRate);
		recoilPanel.addElement(weaponRotationX);
		recoilPanel.addElement(weaponRotationY);
		recoilPanel.addElement(adsSimilarity);
		recoilPanel.addElement(debugFireRate);
		

		this.axisToggle.setState(true);
		
		this.panels.add(recoilPanel);
		this.panels.add(cameraPanel);
		this.panels.add(renderPanel);
		
		
	}
	
	public Button but;
	
	public void render() {
		
		//if(1+1==2) return;
		
		 ScaledResolution scaledresolution = new ScaledResolution(mc);
         final int scaledWidth = scaledresolution.getScaledWidth();
         final int scaledHeight = scaledresolution.getScaledHeight();
         int mouseX = Mouse.getX() * scaledWidth / mc.displayWidth;
         int mouseY = scaledHeight - Mouse.getY() * scaledHeight / mc.displayHeight - 1;
         but = null;
		update(mouseX, mouseY);
		
		extraRender();
		
		
		for(Panel p : panels) {
			p.render(mouseX, mouseY);
		}
		
		/*
		but = null;
		for(Button b : buttonList) {
			b.renderButton(mouseX, mouseY);
		}
		*/
		
		if(but != null) {
		
			AnimationGUI.renderRect(new Color(0x222f3e).darker().darker().darker(), mouseX, mouseY, mc.fontRenderer.getStringWidth(but.tooltip)*0.8f, 10);
			GlStateManager.enableTexture2D();
			AnimationGUI.renderScaledString(but.tooltip, mouseX+2.5, mouseY+2, 0.9f);
			GlStateManager.disableTexture2D();
		}
		
		GlStateManager.enableTexture2D();
		
	}
	
	public Textbar position = new Textbar("Position", 40, 40, 90, 15);
	public Textbar rotation = new Textbar("Rotation", 10, 75, 90, 15);
	
	public void extraRender() {

		
		
		
		ScaledResolution sr = new ScaledResolution(mc);
		position.x = (int) (sr.getScaledWidth_double()-100);
		rotation.x = (int) (sr.getScaledWidth_double()-100);
		
		
		Position p = DebugPositioner.getCurrentPartPosition();
		if(p == null) {
			position.setStrings(0, 0, 0);
			rotation.setStrings(0, 0, 0);
		} else {
			position.setStrings(p.x, p.y, p.z);
			rotation.setStrings(p.xRotation, p.yRotation, p.zRotation);
		}
		
		position.renderButton(0, 0);
		rotation.renderButton(0, 0);
		//tb.renderButton(0, 0);
		
		GlStateManager.enableTexture2D();
		String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("h:mm a"));
		renderScaledString(time, sr.getScaledWidth_double()-40, 5, 1);
		String fps = "FPS: " + mc.getDebugFPS();
		renderScaledString(fps, sr.getScaledWidth_double()-45, 15, 1);
		
		
		String itemPos = "";
		
		if(magEdit.isState()) {
			itemPos = "Mag Rotation Point";
		} else if(forceFlash.isState()) {
			itemPos = "Muzzle Flash";
		} else if(editRotButton.isState())  {
			 itemPos = "Weapon Rotation Point";
		} else if(OpenGLSelectionHelper.selectID == 3) {
			itemPos = "Weapon";
		} else if(OpenGLSelectionHelper.selectID == 1) {
			itemPos = "Left Hand";
		} else if(OpenGLSelectionHelper.selectID == 2) {
			itemPos = "Right Hand";
		}
		
		String currentlyPositioning = TextFormatting.WHITE + "Positioning " + TextFormatting.GOLD + itemPos;
		
		renderScaledString(currentlyPositioning, 5, 5, 0.5);
		
		
		GlStateManager.color(1, 1, 1);
	
		
		GlStateManager.disableTexture2D();
		//GlStateManager.enableTexture2D();
	}
	
	public void update(int mouseX, int mouseY) {
		
		
		grabStatus = false;
		for(Panel p : this.panels) {
			
			
			if(checkIn2DBox(mouseX, mouseY, p.getPositionX(), p.getPositionY(), p.getWidth(), p.getHeight())) grabStatus = true;
		}
		
		if(Mouse.isButtonDown(0) && !mouseStatus) {
			mouseStatus = true;
			
			
			
			
			onMouseClick(mouseX, mouseY);
			
			
		} else if(!Mouse.isButtonDown(0) && mouseStatus) {
			onMouseReleased(mouseX, mouseY);
			mouseStatus = false;
		}
	}
	
	public boolean checkIn2DBox(double a, double b, double x, double y, double width, double height) {
		return a >= x && a <= x+width && b >= y && b <= y+height;
	}
	
	public void onMouseClick(int mouseX, int mouseY) {
		
		for(Panel panel : this.panels) {
			panel.handleButtonClicks(mouseX, mouseY);
		}
		
	}
	
	public void onMouseReleased(int mouseX, int mouseY) {
		for(Panel panel : this.panels) {
			panel.onMouseReleased(mouseX, mouseY);
		}
	}
	
	
	public void onAction(Button id) {
		
		
		if(id == resetCamera) {
			AnimationModeProcessor.getInstance().rot = Vec3d.ZERO;
			AnimationModeProcessor.getInstance().pan = Vec3d.ZERO;
		} else if(id == resetTransforms) {
			AnimationModeProcessor amp = AnimationModeProcessor.getInstance();
			Builder b = amp.getCurrentWeaponRenderBuilder();
			b.firstPersonTransform.set(amp.backupFP);
			b.firstPersonLeftHandTransform.set(amp.backupFPL);
			b.firstPersonRightHandTransform.set(amp.backupFPR);
			
			AnimationModeProcessor.getInstance().slideTransform.withPosition(0, 0, 0).withRotation(0, 0, 0).withRotationPoint(0, 0, 0);
			
			DebugPositioner.reset();
		} else if(id == forceSteveArms) {
			forceSkin("default");
		} else if(id == forceAlexArms) {
			forceSkin("slim");
		} else if(id == printConsole) {
			
		
			
			
			
			if(ClientEventHandler.muzzlePositioner) {
				System.out.println("(" + ClientEventHandler.debugmuzzlePosition.x + ", " + ClientEventHandler.debugmuzzlePosition.y  + ", " + ClientEventHandler.debugmuzzlePosition.z + ")");
				
				return;
			}

			if(magEdit.isState()) {
				System.out.println("(" + ClientEventHandler.magRotPositioner.x + ", " + ClientEventHandler.magRotPositioner.y  + ", " + ClientEventHandler.magRotPositioner.z + ")");
				return;
			}
			
			int selectID = OpenGLSelectionHelper.selectID;
    		if(ClientModContext.getContext() == null || ClientModContext.getContext().getMainHeldWeapon() == null) {
    		
    			return;
    		}
    		Builder i = ClientModContext.getContext().getMainHeldWeapon().getWeapon().getRenderer().getWeaponRendererBuilder();
    		switch(selectID) {
    		case 1:
    			i.firstPersonLeftHandTransform.printTransform();
    			break;
    		case 2:
    			i.firstPersonRightHandTransform.printTransform();
    			break;
    		case 3:
    			i.firstPersonTransform.printTransform();
    			break;
    		case 4:
    			AnimationModeProcessor.getInstance().slideTransform.printTransform();
    			break;
    			
    		}
    		
    		PlayerWeaponInstance instance = ClientModContext.getContext().getMainHeldWeapon();
    		instance.getWeapon().setRecoilParameters(getRecoilParams());
    		
    		if(!isPanelClosed("Recoil")) {
    			StringBuilder builder = new StringBuilder();
    			builder.append("\n.withRecoilParam(new RecoilParam(\n");
    			builder.append("\t\t// The weapon power\n");
    			builder.append("\t\t" + weaponPower.getValue() + ",\n");
    			builder.append("\t\t// Muzzle climb divisor\n");
    			builder.append("\t\t" +muzzleClimbDivisor.getValue() + ",\n");
    			builder.append("\t\t// \"Stock Length\"\n");
    			builder.append("\t\t" +stockLength.getValue() + ",\n");
    			builder.append("\t\t// Recovery rate from initial shot\n");
    			builder.append("\t\t" +powerRecoveryNormalRate.getValue() + ",\n");
    			builder.append("\t\t// Recovery rate @ \"stock\"\n");
    			builder.append("\t\t" +powerRecoveryStockRate.getValue() + ",\n");
    			builder.append("\t\t// Recoil rotation (Y)\n");
    			builder.append("\t\t" +weaponRotationX.getValue() + ",\n");
    			builder.append("\t\t// Recoil rotation (Z)\n");
    			builder.append("\t\t" +weaponRotationY.getValue() + ",\n");
    			builder.append("\t\t// Ads similarity divisor\n");
    			builder.append("\t\t" +adsSimilarity.getValue() + "\n");
    			builder.append("))");
    			System.out.println(builder.toString());
    		}
    		
		} else if(id == switchScopes) {
			PlayerWeaponInstance instance = ClientModContext.getContext().getPlayerItemInstanceRegistry().getMainHandItemInstance(mc.player, PlayerWeaponInstance.class);
			ClientModContext.getContext().getAttachmentAspect().tryChange(new ChangeAttachmentPermit(AttachmentCategory.SCOPE), instance);
			
		} else if(id == editRotButton) {
			if(editRotButton.isState()) {
				moveForward.setState(false);
			}
		} else if(id == forceFlash) {
			if(forceFlash.isState()) {
				ClientEventHandler.muzzlePositioner = true;
				
			} else {
				ClientEventHandler.muzzlePositioner = false;
			}
		} else if(id == magEdit) {
			DebugPositioner.setDebugMode(true);
		} else if(id == forceADS) {
			PlayerWeaponInstance instance = ClientModContext.getContext().getPlayerItemInstanceRegistry().getMainHandItemInstance(mc.player, PlayerWeaponInstance.class);
			
			if(id.isState()) {
				instance.setAimed(true);
			} else instance.setAimed(false);
			
		}
		
	
	}
	
	
	public static void forceSkin(String type) {
		Method f = ReflectionHelper.findMethod(AbstractClientPlayer.class, "getPlayerInfo", "getPlayerInfo", (Class<?>) null);

		NetworkPlayerInfo npi = null;
		try { npi = (NetworkPlayerInfo) f.invoke((AbstractClientPlayer) mc.player, (Object) null); }
		catch (Exception e) { e.printStackTrace(); }

		if(npi != null) {
			try {
				Field f2 = ReflectionHelper.findField(NetworkPlayerInfo.class, "skinType");
				f2.setAccessible(true);
				f2.set(npi, type);
				
			} catch(Exception ignored) {}
		}

        WeaponRenderer.acp = null;
	}
	
	public static void renderScaledString(String str, double x, double y, double scale) {
		GlStateManager.pushMatrix();
		GlStateManager.translate(x, y, 0);
		GlStateManager.scale(scale, scale, scale);
		
		mc.fontRenderer.drawStringWithShadow(str, 0, 0, 0xffffff);
		
		GlStateManager.popMatrix();
	}
	
	
	// tools
	
	public static void renderRect(Color c, double x, double y, double w, double h) {
		
		float r = (float) c.getRed()/255f;
		
		float g = (float) c.getGreen()/255f;
		float b = (float) c.getBlue()/255f;
		
		Tessellator t = Tessellator.getInstance();
		BufferBuilder bb = t.getBuffer();
		
		bb.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_COLOR);
		
		float grad = 0.8f;
		GlStateManager.shadeModel(GL11.GL_SMOOTH);
		bb.pos(x, y, 0).color(r, g, b, 1).endVertex();
		bb.pos(x, y+h, 0).color(r*grad, g*grad, b*grad, 1).endVertex();
		bb.pos(x+w, y+h, 0).color(r*grad, g*grad, b*grad, 1).endVertex();
		bb.pos(x+w, y, 0).color(r, g, b, 1).endVertex();
		
		
	
		
		t.draw();
	}
	
	public static void renderTexturedRect(int id, double x, double y, double w, double h) {
		mc.getTextureManager().bindTexture(new ResourceLocation(ModReference.ID + ":textures/hud/animguio.png"));
		
		GlStateManager.enableAlpha();
		GlStateManager.enableBlend();
		Tessellator t = Tessellator.getInstance();
		BufferBuilder bb = t.getBuffer();
		
		bb.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
		
		float width = 64;
		float icoSize = 16;
		float height = 64;
		
	
		float u = ((id*icoSize)%width)/width;
		float v = (float) (Math.floor((id*icoSize)/width))*icoSize/height;
		float m = icoSize/width;
		float n = icoSize/height;
		
		
		
	
		bb.pos(x, y, 0).tex(u, v).endVertex();
		bb.pos(x, y+h, 0).tex(u, v+n).endVertex();
		bb.pos(x+w, y+h, 0).tex(u+m, v+n).endVertex();
		bb.pos(x+w, y, 0).tex(u+m, v).endVertex();
		
		
	
		
		t.draw();
		
		GlStateManager.disableAlpha();
		GlStateManager.disableBlend();
		GlStateManager.disableTexture2D();
		
	}
	
	
	
}
