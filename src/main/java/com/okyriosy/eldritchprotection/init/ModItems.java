package com.okyriosy.eldritchprotection.init;



import com.okyriosy.eldritchprotection.item.*;
import com.okyriosy.eldritchprotection.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

//Shamelessly copied from Pahimar's Let'sModReboot Series.

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final ItemEldritchProtection scentedLocket = new ItemScentedLocket();
    public static final ItemEldritchProtection purifingPowder = new ItemPurifyingPowder();
    public static final ItemEldritchProtection recipeMechanism = new ItemRecipeMechanism();
    public static final ItemEldritchProtection sanityAmulet = new ItemSanityAmulet();

    public static void init(){
        GameRegistry.registerItem(scentedLocket, "scentedLocket");
        GameRegistry.registerItem(purifingPowder, "purifingPowder");
//        GameRegistry.registerItem(recipeMechanism, "recipeMechanism");
//        GameRegistry.registerItem(sanityAmulet, "sanityAmulet");
    }
}
