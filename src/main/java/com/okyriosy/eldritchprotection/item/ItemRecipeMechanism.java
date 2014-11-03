package com.okyriosy.eldritchprotection.item;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import java.util.List;

public class ItemRecipeMechanism extends ItemEldritchProtection{

    public ItemRecipeMechanism(){
        super();
        this.setUnlocalizedName("recipeMechanism");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){

        par3List.add(StatCollector.translateToLocal("descr.recipeMechanism.1"));
//        par3List.add(StatCollector.translateToLocal("descr.recipeMechanism.2"));

    }

}
