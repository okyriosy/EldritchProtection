package com.okyriosy.eldritchprotection.item;

import baubles.api.BaubleType;
import com.okyriosy.eldritchprotection.EldritchProtection;
import com.okyriosy.eldritchprotection.init.ModItems;
import com.okyriosy.eldritchprotection.proxy.ClientProxy;
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



public class ItemScentedLocket extends ItemBaubleEldritchProtection{


    public ItemScentedLocket(){
        super();
        this.setUnlocalizedName("scentedLocket");
        this.setMaxDamage(Reference.SCENTED_LOCKET_CHARGES);
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
                        if (!(itemStack.getItemDamage() == Reference.SCENTED_LOCKET_CHARGES)){
                            entityLivingBase.addPotionEffect(new PotionEffect(PotionWarpWard.instance.id, 25*60*20, 0, true));
                            itemStack.damageItem(1, entityLivingBase);
                        }
                    }
                }
            }
        }
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {

        if(entityPlayer.capabilities.isCreativeMode)
        {
         EldritchProtection.proxy.printMessageToPlayer("Nope it won't recharge w/ rightclick in creative, and it will stay that way, sorry");
         return itemStack;
        }

        if (itemStack.getItemDamage() > 0 &&  itemStack.getItemDamage() <= Reference.SCENTED_LOCKET_CHARGES)
            if (!world.isRemote)
            if (entityPlayer.inventory.hasItem(ModItems.purifingPowder))
            {

                entityPlayer.inventory.consumeInventoryItem(ModItems.purifingPowder);
                itemStack.setItemDamage(itemStack.getItemDamage()-1);

            }

        return itemStack;
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){
        if ((par1ItemStack.getItemDamage() == Reference.SCENTED_LOCKET_CHARGES)) {
            par3List.add(StatCollector.translateToLocal("descr.scentedLocket.empty.1"));
            par3List.add(StatCollector.translateToLocal("descr.scentedLocket.empty.2"));
        }
        else{
            par3List.add(StatCollector.translateToLocal("descr.scentedLocket.notEmpty") + " " + (Reference.SCENTED_LOCKET_CHARGES - par1ItemStack.getItemDamage()));
        }

    }


}


