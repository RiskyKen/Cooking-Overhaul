package riskyken.cookingOverhaul.common.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public final class CraftingManager {

    public static boolean disableRecipes;
    
    public static void init() {
        RecipeHelper.removeRecipe(Items.wooden_hoe);
        RecipeHelper.removeRecipe(Items.iron_hoe);
        RecipeHelper.removeRecipe(Items.bread);
        RecipeHelper.removeRecipe(Items.pumpkin_pie);
        RecipeHelper.removeRecipe(Items.golden_carrot);
        RecipeHelper.removeRecipe(Items.cookie);
        RecipeHelper.removeRecipe(Items.cake);
        RecipeHelper.removeRecipe(Items.golden_apple);
        RecipeHelper.removeRecipe(Items.mushroom_stew);
        
        RecipeHelper.removeCookingRecipe(Items.baked_potato);
        RecipeHelper.removeCookingRecipe(Items.cooked_porkchop);
        RecipeHelper.removeCookingRecipe(Items.cooked_beef);
        RecipeHelper.removeCookingRecipe(Items.cooked_chicken);
        RecipeHelper.removeCookingRecipe(Items.cooked_fished);
        
        if (disableRecipes) {
            return;
        }
        ModBlockRecipes.init();
        ModItemRecipes.init();
    }

    public static void addShapelessRecipe(ItemStack result, Object[] recipe) {
        GameRegistry.addRecipe(new ShapelessOreRecipe(result, recipe));
    }

    public static void addShapedRecipe(ItemStack result, Object[] recipe) {
        GameRegistry.addRecipe(new ShapedOreRecipe(result, recipe));
    }
}
