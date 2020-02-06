package net.mcreator.godcraft;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

@Elementsgodcraft.ModElement.Tag
public class MCreatorHexadoriumOreBlockDestroyedByPlayer extends Elementsgodcraft.ModElement {
	public MCreatorHexadoriumOreBlockDestroyedByPlayer(Elementsgodcraft instance) {
		super(instance, 7);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorHexadoriumOreBlockDestroyedByPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(MCreatorHexadorium.block, (int) (1)));
	}
}
