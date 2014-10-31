package com.okyriosy.eldritchprotection.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by ss on 28/10/2014.
 */
public class BlockCoarseDirt extends BlockEldritchProtection{
    public BlockCoarseDirt()
    {
        super(Material.ground);
        this.setBlockName("coarseDirt");
//        this.setBlockTextureName("dirt");
        this.setHardness(0.6F);
        this.setStepSound(soundTypeGravel);
        this.setHarvestLevel("shovel", 0);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon("dirt");
    }

}
