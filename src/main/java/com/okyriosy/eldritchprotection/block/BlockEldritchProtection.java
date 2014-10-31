package com.okyriosy.eldritchprotection.block;

import com.okyriosy.eldritchprotection.creativeTab.CreativeTabEldritchProtection;
import com.okyriosy.eldritchprotection.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by ss on 27/10/2014.
 */
public class BlockEldritchProtection extends Block{

    public BlockEldritchProtection(Material material){

        super(material);
        this.setCreativeTab(CreativeTabEldritchProtection.ELDRITCH_PROTECTION_TAB);
}

    public BlockEldritchProtection(){

        super(Material.rock);
        this.setCreativeTab(CreativeTabEldritchProtection.ELDRITCH_PROTECTION_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
