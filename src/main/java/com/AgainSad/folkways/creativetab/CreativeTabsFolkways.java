package com.AgainSad.folkways.creativetab;

import com.AgainSad.folkways.item.ItemLoader;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabsFolkways extends CreativeTabs {
	public static CreativeTabs tabFolkways = new CreativeTabsFolkways();

	public CreativeTabsFolkways() {
		super("folkways");
		
	}
	
	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(ItemLoader.redPaper);
	}

}
