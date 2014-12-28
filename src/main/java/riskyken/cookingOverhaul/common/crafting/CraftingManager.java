package riskyken.cookingOverhaul.common.crafting;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public final class CraftingManager {

    public static boolean disableRecipes;
    
    public static void init() {
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
