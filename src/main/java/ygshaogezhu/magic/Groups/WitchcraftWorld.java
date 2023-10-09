package ygshaogezhu.magic.Groups;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import ygshaogezhu.magic.List.ItemList;

public class WitchcraftWorld extends ItemGroup {

    public WitchcraftWorld( ) {
        super("witchcraft_world");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemList.BONE_BOOTS.get());
    }
}
