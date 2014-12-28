package riskyken.cookingOverhaul.common.crafting;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import riskyken.cookingOverhaul.utils.ModLogger;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;

public final class RecipeHelper {

    
    public static void removeRecipe(Item item) {
        List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
        for (int i = 0; i < recipes.size(); i++) {
            IRecipe recipe = recipes.get(i);
            ItemStack resultStack = recipe.getRecipeOutput();
            if (resultStack != null) {
                if (item == resultStack.getItem()) {
                    recipes.remove(i);
                    i--;
                }
            }
        }
    }
    
    public static void removeCookingRecipe(Item item) {
        Map<ItemStack, ItemStack> recipes = FurnaceRecipes.smelting().getSmeltingList();
        Iterator iterator = recipes.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry value = (Map.Entry)iterator.next();
            if (value.getValue() instanceof ItemStack) {
                ItemStack resultStack = (ItemStack) value.getValue();
                if (resultStack.getItem() == item) {
                    iterator.remove();
                    ModLogger.info("Removing recipe for: " + item);
                }
            }
        }
    }
    
}
