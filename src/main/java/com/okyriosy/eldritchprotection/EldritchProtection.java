package com.okyriosy.eldritchprotection;

import com.okyriosy.eldritchprotection.handler.ConfigurationHandler;
import com.okyriosy.eldritchprotection.init.*;
import com.okyriosy.eldritchprotection.proxy.IProxy;
import com.okyriosy.eldritchprotection.reference.Reference;
import com.okyriosy.eldritchprotection.research.ModRecipes;
import com.okyriosy.eldritchprotection.research.ModResearch;
import com.okyriosy.eldritchprotection.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;



@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION,  dependencies = Reference.DEPENDENCIES)
public class EldritchProtection {

    @Mod.Instance(Reference.MOD_ID)
    public static EldritchProtection instance;


    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        ModItems.init();
        ModBlocks.init();

//        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

        Recipe.init();
//        ThaumcraftRecipe.init();

        ModRecipes.init();

//        LogHelper.info("Initialization Complete!");

    }


    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

//       ThaumcraftResearch.init();

        ModResearch.initResearch();

//       LogHelper.info("Post Initialization Complete!");
    }

}
