package com.AgainSad.folkways.block;

import com.AgainSad.folkways.creativetab.CreativeTabsFolkways;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockCandlestick extends Block{
	public BlockCandlestick() {
		super(Material.WOOD);
		this.setRegistryName("candlestick_block");
		this.setUnlocalizedName("candlestick");
		this.setHardness(1F);
		this.setSoundType(SoundType.WOOD);
		this.setResistance(4);
		this.setCreativeTab(CreativeTabsFolkways.tabFolkways);
	}

}
