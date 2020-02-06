package net.mcreator.godcraft;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.IInventory;
import net.minecraft.init.Items;

import java.util.HashMap;

@Elementsgodcraft.ModElement.Tag
public class MCreatorHexadoriumTransposerGUISlot2 extends Elementsgodcraft.ModElement {
	public MCreatorHexadoriumTransposerGUISlot2(Elementsgodcraft instance) {
		super(instance, 18);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("guiinventory") == null) {
			System.err.println("Failed to load dependency guiinventory for procedure MCreatorHexadoriumTransposerGUISlot2!");
			return;
		}
		HashMap guiinventory = (HashMap) dependencies.get("guiinventory");
		if (((new Object() {
			public ItemStack getItemStack(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("inherited");
				if (inv != null)
					return inv.getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(MCreatorHexadorium.block, (int) (1)).getItem())) {
			if (((new Object() {
				public ItemStack getItemStack(int sltid) {
					IInventory inv = (IInventory) guiinventory.get("inherited");
					if (inv != null)
						return inv.getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))).getItem() == new ItemStack(Items.GOLD_INGOT, (int) (1)).getItem())) {
				{
					IInventory inv = (IInventory) guiinventory.get("inherited");
					if (inv != null)
						inv.decrStackSize((int) (1), (int) (4));
				}
				{
					IInventory inv = (IInventory) guiinventory.get("inherited");
					if (inv != null)
						inv.decrStackSize((int) (0), (int) (1));
				}
				{
					IInventory inv = (IInventory) guiinventory.get("inherited");
					if (inv != null)
						inv.setInventorySlotContents((int) (2), new ItemStack(MCreatorHexadorium.block, (int) (4)));
				}
			} else if (((new Object() {
				public ItemStack getItemStack(int sltid) {
					IInventory inv = (IInventory) guiinventory.get("inherited");
					if (inv != null)
						return inv.getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))).getItem() == new ItemStack(Items.EMERALD, (int) (1)).getItem())) {
				{
					IInventory inv = (IInventory) guiinventory.get("inherited");
					if (inv != null)
						inv.decrStackSize((int) (1), (int) (4));
				}
				{
					IInventory inv = (IInventory) guiinventory.get("inherited");
					if (inv != null)
						inv.decrStackSize((int) (0), (int) (1));
				}
				{
					IInventory inv = (IInventory) guiinventory.get("inherited");
					if (inv != null)
						inv.setInventorySlotContents((int) (2), new ItemStack(MCreatorHexadorium.block, (int) (64)));
				}
			}
		} else if (((new Object() {
			public ItemStack getItemStack(int sltid) {
				IInventory inv = (IInventory) guiinventory.get("inherited");
				if (inv != null)
					return inv.getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == new ItemStack(MCreatorCompressedHexadorium.block, (int) (1)).getItem())) {
			if (((new Object() {
				public ItemStack getItemStack(int sltid) {
					IInventory inv = (IInventory) guiinventory.get("inherited");
					if (inv != null)
						return inv.getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))).getItem() == new ItemStack(Items.GOLD_INGOT, (int) (1)).getItem())) {
				{
					IInventory inv = (IInventory) guiinventory.get("inherited");
					if (inv != null)
						inv.decrStackSize((int) (1), (int) (8));
				}
				{
					IInventory inv = (IInventory) guiinventory.get("inherited");
					if (inv != null)
						inv.decrStackSize((int) (0), (int) (1));
				}
				{
					IInventory inv = (IInventory) guiinventory.get("inherited");
					if (inv != null)
						inv.setInventorySlotContents((int) (2), new ItemStack(MCreatorCompressedHexadorium.block, (int) (4)));
				}
			} else if (((new Object() {
				public ItemStack getItemStack(int sltid) {
					IInventory inv = (IInventory) guiinventory.get("inherited");
					if (inv != null)
						return inv.getStackInSlot(sltid);
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (1))).getItem() == new ItemStack(Items.EMERALD, (int) (1)).getItem())) {
				{
					IInventory inv = (IInventory) guiinventory.get("inherited");
					if (inv != null)
						inv.decrStackSize((int) (1), (int) (8));
				}
				{
					IInventory inv = (IInventory) guiinventory.get("inherited");
					if (inv != null)
						inv.decrStackSize((int) (0), (int) (1));
				}
				{
					IInventory inv = (IInventory) guiinventory.get("inherited");
					if (inv != null)
						inv.setInventorySlotContents((int) (2), new ItemStack(MCreatorCompressedHexadorium.block, (int) (64)));
				}
			}
		}
	}
}
