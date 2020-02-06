package net.mcreator.godcraft;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

@Elementsgodcraft.ModElement.Tag
public class MCreatorHexadorium_Transposer_GUI_Trigger extends Elementsgodcraft.ModElement {
	public MCreatorHexadorium_Transposer_GUI_Trigger(Elementsgodcraft instance) {
		super(instance, 14);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorHexadorium_Transposer_GUI_Trigger!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorHexadorium_Transposer_GUI_Trigger!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorHexadorium_Transposer_GUI_Trigger!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorHexadorium_Transposer_GUI_Trigger!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorHexadorium_Transposer_GUI_Trigger!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(godcraft.instance, MCreatorHexadoriumTransposerGUI.GUIID, world, x, y, z);
	}
}
