package com.AgainSad.folkways.item;

import com.AgainSad.folkways.creativetab.CreativeTabsFolkways;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemArtKnife extends ItemSword{
	public static final Item.ToolMaterial KNIFE = EnumHelper.addToolMaterial("KNIFE", 0, 250, 7.0F, 1.0F, 22);
	public ItemArtKnife() {
		super(KNIFE);
		this.setRegistryName("art_knife");
		this.setUnlocalizedName("artKnife");
		this.setCreativeTab(CreativeTabsFolkways.tabFolkways);
	}
}
