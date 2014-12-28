package riskyken.cookingOverhaul.proxies;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    
    @Override
    public void preInit() {
    }
    
    @Override
    public void init() {
        initRenderers();
        registerKeyBindings();
    }
    
    public void initRenderers() {
    }
    
    public void registerKeyBindings() {
    }
    
    @Override
    public void postInit() {
    }
}
