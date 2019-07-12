package com.AgainSad.folkways.item;

import com.AgainSad.folkways.creativetab.CreativeTabsFolkways;

import net.minecraft.item.Item;

public class ItemGypsumPowder extends Item{
	public ItemGypsumPowder() {
		super();
		this.setRegistryName("gypsum_powder");
		this.setUnlocalizedName("gypsumPowder");
		this.setCreativeTab(CreativeTabsFolkways.tabFolkways);
	}

}
