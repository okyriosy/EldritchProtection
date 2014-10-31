


//Something went wrong here. :( using Flaxbeard's stuff now.




//package com.okyriosy.eldritchprotection.init;
//
//import com.okyriosy.eldritchprotection.reference.Reference;
//import net.minecraft.item.ItemStack;
//import net.minecraft.util.ResourceLocation;
//import thaumcraft.api.aspects.Aspect;
//import thaumcraft.api.aspects.AspectList;
//import thaumcraft.api.research.ResearchCategories;
//import thaumcraft.api.research.ResearchItem;
//import thaumcraft.api.research.ResearchPage;
//

//public class ThaumcraftResearch {
//
//    public static void init(){
//
//        //creating the intro item
//
//        //creating the pages for the intro item
//        ResearchPage introPage1 = new ResearchPage("re.intropage.1");
//
//        //creating the aspects needed for the research
//
//        AspectList aLIntro = new AspectList();
//        aLIntro.add(Aspect.TAINT, 1);
//        aLIntro.add(Aspect.SOUL, 1);
//        aLIntro.add(Aspect.HEAL, 1);
//
//        //creating the intro item
//        ResearchItem intro = new ResearchItem(Reference.R_INTRO, Reference.EP_CATEG, aLIntro, 0, 0, 2, new ResourceLocation(Reference.MOD_ID, "textures/research/intro.png"));
//        intro.setPages(introPage1);
//        // and registering it
//        intro.registerResearchItem();
////        ResearchCategories.addResearch(intro);
//
//
//        //creating the scentedlocket item
//
//        //creating the pages for the intro item
//        ResearchPage slPage1 = new ResearchPage("re.slpage.1");
//        ResearchPage slPage2 = new ResearchPage(ThaumcraftRecipe.SCENTED_LOCKET);
//        ResearchPage slPage3 = new ResearchPage(ThaumcraftRecipe.PURIFING_POWDER);
//
//        //creating the aspects needed for the research
//
//        AspectList aLScentedLocket = new AspectList();
//        aLScentedLocket.add(Aspect.WATER, 1);
//        aLScentedLocket.add(Aspect.AIR, 3);
//        aLScentedLocket.add(Aspect.HEAL, 2);
//        aLScentedLocket.add(Aspect.SOUL, 2);
//
//        //creating the scented locket item
//        ResearchItem slResearch = new ResearchItem(Reference.R_SCENTED_LOCKET, Reference.EP_CATEG, aLScentedLocket, 1, 1, 2, new ItemStack(ModItems.scentedLocket));
//        slResearch.setPages(slPage1, slPage2, slPage3);
//        slResearch.setParents(Reference.R_INTRO);
//        //and registering it
//        slResearch.registerResearchItem();
////        ResearchCategories.addResearch(slResearch);
//
//
//
//
//        //creating the research category (that is - my own tab)
//        ResearchCategories.registerCategory(Reference.EP_CATEG,new ResourceLocation(Reference.MOD_ID, "textures/items/scentedLocket.png"),new ResourceLocation( "thaumcraft", "textures/gui/gui_researchback.png" ) );
//
//    }
//
//
//
//}
