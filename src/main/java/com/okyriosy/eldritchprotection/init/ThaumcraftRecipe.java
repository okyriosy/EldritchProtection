



//Something went wrong here. :( using Flaxbeard's stuff now.








//package com.okyriosy.eldritchprotection.init;
//
//import com.okyriosy.eldritchprotection.reference.Reference;
//import net.minecraft.init.Blocks;
//import net.minecraft.init.Items;
//import net.minecraft.item.ItemStack;
//import thaumcraft.api.ThaumcraftApi;
//import thaumcraft.api.aspects.Aspect;
//import thaumcraft.api.aspects.AspectList;
//import thaumcraft.api.crafting.InfusionRecipe;
//import thaumcraft.api.crafting.ShapelessArcaneRecipe;
//import thaumcraft.common.config.ConfigItems;
//

//public class ThaumcraftRecipe {
//
//    public static ShapelessArcaneRecipe PURIFING_POWDER;
//    public static InfusionRecipe SCENTED_LOCKET;
//
//    public static void init() {
//
//        // Thaumcraft items
//        ItemStack salisMundus = new ItemStack(ConfigItems.itemResource, 1, 14);
//        ItemStack bathSalts = new ItemStack(ConfigItems.itemBathSalts);
//
//        //My Items
//        ItemStack scentedLocket = new ItemStack(ModItems.scentedLocket);
//        ItemStack purifingPowder = new ItemStack(ModItems.purifingPowder);
//
//        //purifing powder crafting
//
//        AspectList aLPP = new AspectList();
//        aLPP.add(Aspect.WATER, 1);
//        aLPP.add(Aspect.AIR, 1);
//
//        PURIFING_POWDER=ThaumcraftApi.addShapelessArcaneCraftingRecipe(Reference.R_SCENTED_LOCKET, purifingPowder, aLPP, bathSalts, "redstone");
//
//
//        //scented locket crafting
//
//        AspectList aLSL = new AspectList();
//        aLSL.add(Aspect.AIR, 10);
//        aLSL.add(Aspect.WATER, 10);
//        aLSL.add(Aspect.VOID, 5);
//        aLSL.add(Aspect.SOUL, 20);
//        aLSL.add(Aspect.HEAL, 15);
//
//        ItemStack[] iSSL = {new ItemStack(Blocks.soul_sand), new ItemStack(Items.gold_nugget),salisMundus, new ItemStack(Items.golden_carrot), new ItemStack(Items.redstone), new ItemStack(Items.cake)};
//
//        SCENTED_LOCKET=ThaumcraftApi.addInfusionCraftingRecipe(Reference.R_SCENTED_LOCKET, scentedLocket, 2,  aLSL, new ItemStack(Items.diamond), iSSL);
//    }
//}