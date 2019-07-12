package com.AgainSad.folkways;

import com.AgainSad.folkways.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Folkways.MODID, name = Folkways.NAME, version = Folkways.VERSION)
public class Folkways {
	
	public static final String MODID = "folkways";
	public static final String NAME = "Folkways Mod";
	public static final String VERSION = "1.0.0";
	private static Logger logger;

	@Instance(Folkways.MODID)
	public static Folkways instance = new Folkways();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		logger = event.getModLog();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	@SidedProxy(clientSide = "com.AgainSad.folkways.client.ClientProxy",
			serverSide = "com.AgainSad.folkways.common.CommonProxy")
	public static CommonProxy proxy;
}
