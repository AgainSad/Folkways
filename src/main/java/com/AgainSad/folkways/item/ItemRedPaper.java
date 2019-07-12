package com.AgainSad.folkways.item;

import com.AgainSad.folkways.creativetab.CreativeTabsFolkways;

import net.minecraft.item.Item;

public class ItemRedPaper extends Item{
	public ItemRedPaper() {
		super();
		this.setRegistryName("red_paper");
		this.setUnlocalizedName("redPaper");
		this.setCreativeTab(CreativeTabsFolkways.tabFolkways);
	}
	
}
