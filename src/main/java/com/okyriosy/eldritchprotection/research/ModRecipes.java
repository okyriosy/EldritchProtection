package com.okyriosy.eldritchprotection.research;


//Shamelessly copied from Flaxbeard's Thaumic Exploration.

import java.util.List;

import com.okyriosy.eldritchprotection.init.ModItems;
import com.okyriosy.eldritchprotection.reference.Reference;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.crafting.InfusionEnchantmentRecipe;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.api.crafting.ShapelessArcaneRecipe;
import thaumcraft.common.config.ConfigItems;
import thaumcraft.common.config.ConfigResearch;
import cpw.mods.fml.common.registry.GameRegistry;



public final class ModRecipes {



    public static void init() {
        initCraftingRecipes();
        initArcaneRecipes();
        initInfusionRecipes();
        initCrucibleRecipes();


    }



	private static void initInfusionRecipes() {

        ItemStack result = new ItemStack(ModItems.scentedLocket);
        result.setItemDamage(Reference.SCENTED_LOCKET_CHARGES);

        registerResearchItemI(Reference.R_SCENTED_LOCKET, result, 3,
                new AspectList().add(Aspect.AIR, 10).add(Aspect.WATER, 10).add(Aspect.VOID, 5).add(Aspect.SOUL, 20).add(Aspect.HEAL, 15).add(Aspect.MECHANISM, 5),
                new ItemStack(Items.diamond), new ItemStack(Blocks.soul_sand), new ItemStack(Items.gold_nugget),
                new ItemStack(Items.redstone), new ItemStack(Items.golden_carrot),
                new ItemStack(ConfigItems.itemResource, 1, 14), new ItemStack(Items.cake));
    }


	private static void initArcaneRecipes() {


        registerResearchItemShapeless(Reference.R_PURIFING_POWDER, Reference.R_SCENTED_LOCKET, new ItemStack(ModItems.purifingPowder), new AspectList().add(Aspect.AIR, 1).add(Aspect.WATER, 1),
                new ItemStack(Items.redstone),
                new ItemStack(ConfigItems.itemBathSalts));


//
//        registerResearchItem("DREAMCATCHER", "DREAMCATCHER", new ItemStack(ThaumicExploration.charmNoTaint), new AspectList().add(Aspect.ORDER, 15).add(Aspect.ENTROPY, 15),
//                "GPG", "PSP", "FPF",
//                'G', new ItemStack(ConfigItems.itemResource,1, 11),
//                'P', new ItemStack(ConfigBlocks.blockWoodenDevice,1,6),
//                'S', new ItemStack(ConfigItems.itemResource,1, 12),
//                'F', new ItemStack(Items.feather));
//
//        registerResearchItem("DREAMCATCHER2", "DREAMCATCHER", new ItemStack(ThaumicExploration.charmNoTaint), new AspectList().add(Aspect.ORDER, 15).add(Aspect.ENTROPY, 15),
//                "GPG", "PSP", "FPF",
//                'G', "gooTaint",
//                'P', new ItemStack(ConfigBlocks.blockWoodenDevice,1,6),
//                'S', new ItemStack(ConfigItems.itemResource,1, 12),
//                'F', "tendrilTaint");
//

	}

	private static void initCraftingRecipes() {
//		for (int i=0;i<16;i++) {
//			GameRegistry.addRecipe(new ItemStack(ThaumicExploration.blankSeal, 1, i), " X ", "XZX", " X ", 'X', new ItemStack(ConfigItems.itemResource,1,4), 'Z', new ItemStack(Items.dye,1,i));
//		}
//
//		registerCraftingRecipe("BLANKSEAL", new ItemStack(ThaumicExploration.blankSeal, 1, 32767), " X ", "XZX", " X ", 'X', new ItemStack(ConfigItems.itemResource,1,4), 'Z', new ItemStack(Items.dye,1,32767));
		
	}

	private static void initCrucibleRecipes() {
//		registerCrucibleRecipe("FLESHCURE","FLESHCURE", new ItemStack(Items.leather,2), new ItemStack(Items.rotten_flesh), new AspectList().add(Aspect.FLESH, 2).add(Aspect.CLOTH, 1));
//		for (int i = 0; i<16; i++) {
//			registerCrucibleRecipe("CHESTSEAL","CHESTSEAL", new ItemStack(ThaumicExploration.chestSeal,1,i), new ItemStack(ThaumicExploration.blankSeal,1,i),
//					new AspectList().add(Aspect.ELDRITCH, 6).add(Aspect.EXCHANGE,4).add(Aspect.VOID, 4).add(Aspect.TRAP, 4).add(Aspect.TRAVEL, 6));
//		}
//

	}

	
	private static void registerResearchItem(String name, String research, ItemStack output, AspectList aspects, Object... stuff) {
	        ShapedArcaneRecipe recipe = ThaumcraftApi.addArcaneCraftingRecipe(research, output, aspects, stuff);
	        ConfigResearch.recipes.put(name, recipe);
	}
	
	
	private static void registerCraftingRecipe(String name, ItemStack output, Object... stuff) {
	        GameRegistry.addRecipe(output, stuff);
	        List<IRecipe> recipeList = CraftingManager.getInstance().getRecipeList();
	        if(name != null && name.length() != 0)
	                ConfigResearch.recipes.put(name, recipeList.get(recipeList.size() - 1));
	}
	

	
	private static void registerCrucibleRecipe(String name, String research, ItemStack output, ItemStack input, AspectList aspects) {
	        CrucibleRecipe recipe = ThaumcraftApi.addCrucibleRecipe(name, output, input, aspects);
	        ConfigResearch.recipes.put(research, recipe);
	}
	
	private static void registerResearchItemI(String name, Object output, int instability, AspectList aspects, ItemStack input, ItemStack... stuff) {
         InfusionRecipe recipe = ThaumcraftApi.addInfusionCraftingRecipe(name, output, instability, aspects, input, stuff);
         ConfigResearch.recipes.put(name, recipe);
	}
	
	private static void registerResearchItemShapeless(String name, String research, ItemStack output, AspectList aspects, Object... stuff) {
        ShapelessArcaneRecipe recipe = ThaumcraftApi.addShapelessArcaneCraftingRecipe(research, output, aspects, stuff);
        ConfigResearch.recipes.put(name, recipe);
	}
	
	private static void registerResearchItemI(String name, String research, Object output, int instability, AspectList aspects, ItemStack input, ItemStack... stuff) {
        InfusionRecipe recipe = ThaumcraftApi.addInfusionCraftingRecipe(name, output, instability, aspects, input, stuff);
        ConfigResearch.recipes.put(research, recipe);
	}
	
	private static void registerResearchItemIUI(String research, String name, Object output, int instability, AspectList aspects, ItemStack input, ItemStack... stuff) {
        InfusionRecipe recipe = ThaumcraftApi.addInfusionCraftingRecipe(name, output, instability, aspects, input, stuff);
        ConfigResearch.recipes.put(research, recipe);
	}
	
	private static void registerResearchItemIE(String name, String research, Enchantment output, int instability, AspectList aspects, ItemStack... stuff) {
		InfusionEnchantmentRecipe recipe = ThaumcraftApi.addInfusionEnchantmentRecipe(name, output, instability, aspects, stuff);
        ConfigResearch.recipes.put(research, recipe);
	}
	
	private static void registerResearchItemIU(String research, String name,Object[] objects, int instability, AspectList aspects, ItemStack input, ItemStack... stuff) {
		InfusionRecipe recipe = ThaumcraftApi.addInfusionCraftingRecipe(name, objects, instability, aspects, input, stuff);	
        ConfigResearch.recipes.put(research, recipe);
	}

	private static void registerResearchItemC(String string, List<Object> asList) {
		ConfigResearch.recipes.put(string, asList);
		
	}
}
