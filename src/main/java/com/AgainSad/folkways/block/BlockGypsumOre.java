package com.AgainSad.folkways.block;

import java.util.Random;

import javax.annotation.Nonnull;

import com.AgainSad.folkways.creativetab.CreativeTabsFolkways;
import com.AgainSad.folkways.item.ItemLoader;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockGypsumOre extends Block{
	public BlockGypsumOre() {
		super(Material.ROCK,MapColor.STONE);
		this.setSoundType(SoundType.STONE);
		this.setRegistryName("gypsum_ore");
		this.setUnlocalizedName("gypsumOre");
		this.setHarvestLevel("pickaxe", 2);
		this.setResistance(5F);//爆炸抗性
		this.setHardness(6F);//方块硬度
		this.setCreativeTab(CreativeTabsFolkways.tabFolkways);
		
		
	}
	

	@Nonnull
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ItemLoader.gypsumPowder;
		
	}

	public int quantityDropped(Random random) {
        return 1;
    }


    @Override
    public int quantityDroppedWithBonus(int fortune, Random random) {
        if (fortune > 0) {
            int bonusFactor = Math.max(random.nextInt(fortune + 2) - 1, 0);
            return this.quantityDropped(random) * (bonusFactor + 1);
        } else {
            return this.quantityDropped(random);
        }
    }


	//掉落经验
	  public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
	        Random random = world instanceof World ? ((World) world).rand : new Random();
	        return MathHelper.getInt(random, 3, 7);
	}

	//这个方法决定了精准采集有没有效果。
	@Override
	public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
		return true;
	}
}
