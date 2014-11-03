package com.okyriosy.eldritchprotection.item;


import baubles.api.BaubleType;
import com.okyriosy.eldritchprotection.EldritchProtection;
import com.okyriosy.eldritchprotection.init.ModItems;
import com.okyriosy.eldritchprotection.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import thaumcraft.common.lib.potions.PotionWarpWard;

import java.util.List;

public class ItemSanityAmulet extends ItemBaubleEldritchProtection{


    public ItemSanityAmulet(){
        super();
        this.setUnlocalizedName("sanityAmulet");

    }

    public BaubleType getBaubleType(ItemStack itemStack){
        return BaubleType.AMULET;
    }

    @Override
    public void onEquipped(ItemStack itemStack, EntityLivingBase entityLivingBase) {
        // NOOP
    }

    @Override
    public void onUnequipped(ItemStack itemStack, EntityLivingBase entityLivingBase) {
        // NOOP
    }


    //shamelessly copied from thaumic tinkerer, thanks!

    @Override
    public void onWornTick(ItemStack itemStack, EntityLivingBase entityLivingBase) {
        World par2World = entityLivingBase.worldObj;
        if (!par2World.isRemote) {
            if (entityLivingBase.ticksExisted % 20 == 0) {
                if (entityLivingBase instanceof EntityPlayer) {
                    if (!(entityLivingBase.isPotionActive(PotionWarpWard.instance.id))) {

                        entityLivingBase.addPotionEffect(new PotionEffect(PotionWarpWard.instance.id, 20, 0, true));

                    }
                }
            }
        }
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){

        par3List.add(StatCollector.translateToLocal("descr.sanityAmulet.1"));
        par3List.add(StatCollector.translateToLocal("descr.sanityAmulet.2"));
    }


}

