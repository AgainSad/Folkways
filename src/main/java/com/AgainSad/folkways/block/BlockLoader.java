package com.AgainSad.folkways.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLoader {
	
	public static Block candlestick = new BlockCandlestick();
	public static Block gypsumOre = new BlockGypsumOre();
	
	public static void init() {
		ForgeRegistries.BLOCKS.register(candlestick);
		ForgeRegistries.ITEMS.register(new ItemBlock(candlestick).setRegistryName(candlestick.getRegistryName()));
		ForgeRegistries.BLOCKS.register(gypsumOre);
		ForgeRegistries.ITEMS.register(new ItemBlock(gypsumOre).setRegistryName(gypsumOre.getRegistryName()));
	}
	
	@SideOnly(Side.CLIENT)
	public static void clientInit() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(candlestick), 0,
				new ModelResourceLocation(candlestick.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(gypsumOre), 0, 
				new ModelResourceLocation(gypsumOre.getRegistryName(),"inventory"));
		
	}
}
