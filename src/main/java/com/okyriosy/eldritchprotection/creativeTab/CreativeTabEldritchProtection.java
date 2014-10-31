package com.okyriosy.eldritchprotection.creativeTab;

import com.okyriosy.eldritchprotection.init.ModItems;
import com.okyriosy.eldritchprotection.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class CreativeTabEldritchProtection {

public static final CreativeTabs ELDRITCH_PROTECTION_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
    @Override
    public Item getTabIconItem() {
        return ModItems.scentedLocket;
    }


};



}
