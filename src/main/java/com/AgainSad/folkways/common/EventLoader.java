package com.AgainSad.folkways.common;

import com.AgainSad.folkways.potion.PotionLoader;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.MinecraftForge;

import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class EventLoader {
    public static void init() {
        MinecraftForge.EVENT_BUS.register(EventLoader.class);
    }

    @SubscribeEvent
    public static void onBless(BlockEvent.HarvestDropsEvent event) {
        PotionEffect effect = event.getHarvester().getActivePotionEffect(PotionLoader.bless);
        if(effect != null){
            for(int i =0;i < event.getDrops().size();i++){
                ItemStack stack = event.getDrops().get(i);
                stack.setCount(2);
            }
        }
    }
}
