package riskyken.cookingOverhaul.common.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabCookingOverhaul extends CreativeTabs {

    public CreativeTabCookingOverhaul(int id, String label) {
        super(id, label);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return Item.getItemFromBlock(Blocks.bedrock);
    }
}
