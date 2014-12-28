package riskyken.cookingOverhaul;

import net.minecraft.creativetab.CreativeTabs;
import riskyken.cookingOverhaul.common.blocks.ModBlocks;
import riskyken.cookingOverhaul.common.config.ConfigHandler;
import riskyken.cookingOverhaul.common.crafting.CraftingManager;
import riskyken.cookingOverhaul.common.creativetab.CreativeTabCookingOverhaul;
import riskyken.cookingOverhaul.common.items.ModItems;
import riskyken.cookingOverhaul.common.lib.LibModInfo;
import riskyken.cookingOverhaul.proxies.CommonProxy;
import riskyken.cookingOverhaul.utils.ModLogger;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LibModInfo.ID, name = LibModInfo.NAME, version = LibModInfo.VERSION)
public class CookingOverhaul {
    
    @Mod.Instance(LibModInfo.ID)
    public static CookingOverhaul instance;
    
    @SidedProxy(clientSide = LibModInfo.PROXY_CLIENT_CLASS, serverSide = LibModInfo.PROXY_COMMNON_CLASS)
    public static CommonProxy proxy;
    
    public static CreativeTabCookingOverhaul tabCookingOverhaul = new CreativeTabCookingOverhaul(CreativeTabs.getNextID(), LibModInfo.ID.toLowerCase());
    
    @Mod.EventHandler
    public void perInit(FMLPreInitializationEvent event) {
        ModLogger.info("Loading " + LibModInfo.NAME + " " + LibModInfo.VERSION);
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        ModItems.init();
        ModBlocks.init();
        proxy.preInit();
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {
        CraftingManager.init();
        ModBlocks.registerTileEntities();
        //new GuiHandler();
        //PacketHandler.init();
        proxy.init();
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }
}
