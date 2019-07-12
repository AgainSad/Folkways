package com.AgainSad.folkways.common;

import com.AgainSad.folkways.block.BlockLoader;
import com.AgainSad.folkways.item.ItemLoader;
import com.AgainSad.folkways.potion.PotionLoader;
import com.AgainSad.folkways.worldgen.WorldGeneratorLoader;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event) {
		ItemLoader.init();
		BlockLoader.init();
		WorldGeneratorLoader.init();
		PotionLoader.init();
		EventLoader.init();
	}
	
	public void init(FMLInitializationEvent event) {
		
	}
	
}
