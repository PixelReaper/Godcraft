package net.mcreator.godcraft;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSender;
import net.minecraft.client.gui.GuiTextField;

import java.util.HashMap;

@Elementsgodcraft.ModElement.Tag
public class MCreatorDeathNoteKill extends Elementsgodcraft.ModElement {
	public MCreatorDeathNoteKill(Elementsgodcraft instance) {
		super(instance, 25);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorDeathNoteKill!");
			return;
		}
		if (dependencies.get("guiinventory") == null) {
			System.err.println("Failed to load dependency guiinventory for procedure MCreatorDeathNoteKill!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap guiinventory = (HashMap) dependencies.get("guiinventory");
		if (!entity.world.isRemote && entity.world.getMinecraftServer() != null) {
			entity.world.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
				@Override
				public String getName() {
					return "";
				}

				@Override
				public boolean canUseCommand(int permission, String command) {
					return true;
				}

				@Override
				public World getEntityWorld() {
					return entity.world;
				}

				@Override
				public MinecraftServer getServer() {
					return entity.world.getMinecraftServer();
				}

				@Override
				public boolean sendCommandFeedback() {
					return false;
				}

				@Override
				public BlockPos getPosition() {
					return entity.getPosition();
				}

				@Override
				public Vec3d getPositionVector() {
					return new Vec3d(entity.posX, entity.posY, entity.posZ);
				}

				@Override
				public Entity getCommandSenderEntity() {
					return entity;
				}
			}, (("kill ") + "" + ((new Object() {
				public String getText() {
					GuiTextField textField = (GuiTextField) guiinventory.get("text:Player");
					if (textField != null) {
						return textField.getText();
					}
					return "";
				}
			}.getText()))));
		}
	}
}
