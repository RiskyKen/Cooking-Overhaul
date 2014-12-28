package riskyken.cookingOverhaul.common.blocks;

import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

    //public static Block armourerBrain;
    
    public static void init() {
        //armourerBrain = new BlockArmourerBrain();
    }

    public static void registerTileEntities() {
        //registerTileEntity(TileEntityArmourerBrain.class, LibBlockNames.ARMOURER_BRAIN);
    }

    public static void registerTileEntity(Class<? extends TileEntity> tileEntityClass, String id) {
        GameRegistry.registerTileEntity(tileEntityClass, "te." + id);
    }
}
