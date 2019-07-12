package com.AgainSad.folkways.potion;

import com.AgainSad.folkways.Folkways;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PotionBless extends Potion{

	private static final ResourceLocation res = new ResourceLocation(Folkways.MODID ,"textures/potions/potion_bless.png");

	public PotionBless() {
		super(false,266);
		this.setRegistryName(Folkways.MODID, "bless");
		this.setPotionName("potion.bless");
//		this.setIconIndex(2,2);
	}
//	 返回 false 时触发 Forge patch 后的逻辑，即调用 renderInventoryEffect 和 renderHUDEffect
	@Override
	public boolean hasStatusIcon() {
		return false;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void renderInventoryEffect(int x, int y, PotionEffect effect, Minecraft mc) {
		mc.getTextureManager().bindTexture(res);
		// x, y 为绘制的起点，u, v 为纹理的起点，w, h 为选取的纹理的宽和高，texW 和 texH 代表整张纹理的宽和高
		Gui.drawModalRectWithCustomSizedTexture(x + 6, y + 6, 0, 0, 18, 18, 18, 18);

	}


	@SideOnly(Side.CLIENT)
	@Override
	public void renderHUDEffect(int x, int y, PotionEffect effect, Minecraft mc, float alpha) {
		this.renderInventoryEffect(x-3,y-3,effect,mc);
	}
}
