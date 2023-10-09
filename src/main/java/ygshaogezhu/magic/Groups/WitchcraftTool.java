package ygshaogezhu.magic.Groups;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import ygshaogezhu.magic.List.ItemList;

public class WitchcraftTool extends ItemGroup {

    public WitchcraftTool() {
        super("witchcraft_tool");
    }


    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemList.WOLF_BLOOD.get());
    }
}
