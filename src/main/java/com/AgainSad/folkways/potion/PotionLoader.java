package com.AgainSad.folkways.potion;

import net.minecraft.potion.Potion;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class PotionLoader {
	public static Potion bless = new PotionBless();
	
	public static void init() {
		ForgeRegistries.POTIONS.register(bless);
		
	}
}
