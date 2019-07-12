package com.AgainSad.folkways.item;

import com.AgainSad.folkways.creativetab.CreativeTabsFolkways;
import com.AgainSad.folkways.potion.PotionLoader;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;


public class ItemDumpling extends ItemFood {

    public ItemDumpling(){
        super(4,0.6F,false);
        this.setAlwaysEdible();
        this.setRegistryName("dumpling");
        this.setUnlocalizedName("dumpling");
        this.setCreativeTab(CreativeTabsFolkways.tabFolkways);
        this.setPotionEffect(new PotionEffect(PotionLoader.bless,1000,0),0.5F);

    }

//    @Override
//    public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player){
//        if(!worldIn.isRemote){
//            player.addPotionEffect(new PotionEffect(PotionHealth));
//
//
//        }
//    }


}
