package riskyken.cookingOverhaul.common.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import riskyken.cookingOverhaul.common.crafting.CraftingManager;

public class ConfigHandler {

    public static String CATEGORY_GENERAL = "general";
    
    public static Configuration config;
    
    public static void init(File file) {
        if (config == null) {
            config = new Configuration(file);
            loadConfigFile();
        }
    }

    public static void loadConfigFile() {
        CraftingManager.disableRecipes = config
                .get(CATEGORY_GENERAL, "Disable Recipes", false,
                "Disable all mod recipes. Use if you want to manually add recipes for a mod pack.")
                .getBoolean(false);
        
        if (config.hasChanged()) {
            config.save();
        }
    }
}
