package com.AgainSad.folkways.client;

import com.AgainSad.folkways.block.BlockLoader;
import com.AgainSad.folkways.common.CommonProxy;
import com.AgainSad.folkways.item.ItemLoader;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);
		ItemLoader.clienInt();
		BlockLoader.clientInit();
	}
	@Override
	public void init(FMLInitializationEvent event){
		super.init(event);
	}
	

}
