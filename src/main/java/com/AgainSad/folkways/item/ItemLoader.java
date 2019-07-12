package com.AgainSad.folkways.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader {
	
	public static Item redPaper = new ItemRedPaper();
	public static Item airKnife = new ItemArtKnife();
	public static Item gypsumPowder = new ItemGypsumPowder();
	public static Item dumpling = new ItemDumpling();
	
	public static void init() {
		ForgeRegistries.ITEMS.register(redPaper);
		ForgeRegistries.ITEMS.register(airKnife);
		ForgeRegistries.ITEMS.register(gypsumPowder);
		ForgeRegistries.ITEMS.register(dumpling);
		
		
	}
	
	@SideOnly(Side.CLIENT)
	public static void clienInt() {
		ModelLoader.setCustomModelResourceLocation(redPaper, 0,
				new ModelResourceLocation(redPaper.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(airKnife, 0,
				new ModelResourceLocation(airKnife.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(gypsumPowder, 0, 
				new ModelResourceLocation(gypsumPowder.getRegistryName(),"inventory"));
		ModelLoader.setCustomModelResourceLocation(dumpling,0,
				new ModelResourceLocation(dumpling.getRegistryName(),"inventory"));
	}

}
