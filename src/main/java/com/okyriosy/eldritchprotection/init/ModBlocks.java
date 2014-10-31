package com.okyriosy.eldritchprotection.init;



import com.okyriosy.eldritchprotection.block.BlockCoarseDirt;
import com.okyriosy.eldritchprotection.block.BlockEldritchProtection;
import com.okyriosy.eldritchprotection.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

//Shamelessly copied from Pahimar's Let'sModReboot Series.

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockEldritchProtection coarseDirt = new BlockCoarseDirt();
    public static void init()
    {
        GameRegistry.registerBlock(coarseDirt, "coarseDirt");
    }
}