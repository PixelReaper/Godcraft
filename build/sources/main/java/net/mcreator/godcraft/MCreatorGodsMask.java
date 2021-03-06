package net.mcreator.godcraft;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@Elementsgodcraft.ModElement.Tag
public class MCreatorGodsMask extends Elementsgodcraft.ModElement {
	@GameRegistry.ObjectHolder("godcraft:godsmaskhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("godcraft:godsmaskbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("godcraft:godsmasklegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("godcraft:godsmaskboots")
	public static final Item boots = null;

	public MCreatorGodsMask(Elementsgodcraft instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("GODSMASK", "godcraft:gods_mask_armor", 0, new int[]{5, 5, 5, 5}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				super.onArmorTick(world, entity, itemstack);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					MCreatorGodEffectTierMaximus.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("godsmaskhelmet").setRegistryName("godsmaskhelmet").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("godcraft:godsmaskhelmet", "inventory"));
	}
}
