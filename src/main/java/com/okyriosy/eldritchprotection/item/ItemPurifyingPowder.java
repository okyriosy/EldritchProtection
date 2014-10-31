package com.okyriosy.eldritchprotection.item;

import com.okyriosy.eldritchprotection.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import java.util.List;


public class ItemPurifyingPowder extends ItemEldritchProtection{

    public ItemPurifyingPowder(){
        super();
        this.setUnlocalizedName("purifingPowder");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){

             par3List.add(StatCollector.translateToLocal("descr.purifyingPowder.1"));
             par3List.add(StatCollector.translateToLocal("descr.purifyingPowder.2"));

    }

}
