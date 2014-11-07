package com.okyriosy.eldritchprotection.init;



import com.okyriosy.eldritchprotection.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;


public class Recipe {

    public static void init(){





        ItemStack helper1 = new ItemStack(ModItems.scentedLocket);
        ItemStack helper2 = new ItemStack(ModItems.scentedLocket);
        ItemStack stackOhPowder = new ItemStack(ModItems.purifingPowder);

        for (int i=0; i< Reference.SCENTED_LOCKET_CHARGES; i++){

            helper1.setItemDamage(Reference.SCENTED_LOCKET_CHARGES -i-1);
            helper2.setItemDamage(Reference.SCENTED_LOCKET_CHARGES -i);
            GameRegistry.addRecipe(new ShapelessOreRecipe(helper1, helper2, (stackOhPowder)));
        }
    }

}
