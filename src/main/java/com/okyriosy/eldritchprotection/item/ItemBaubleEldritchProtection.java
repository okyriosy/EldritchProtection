package com.okyriosy.eldritchprotection.item;

import baubles.api.IBauble;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import thaumcraft.api.IRunicArmor;


public abstract class ItemBaubleEldritchProtection extends ItemEldritchProtection implements IBauble, IRunicArmor {


    public ItemBaubleEldritchProtection() {
        super();
        setMaxStackSize(1);
    };

    public boolean canUnequip(ItemStack itemStack, EntityLivingBase entityLivingBase) {
        return true;
    }

    public boolean canEquip(ItemStack stack, EntityLivingBase player) {
        return true;
    }

    public int getRunicCharge(ItemStack itemstack) {return 0;}
}

