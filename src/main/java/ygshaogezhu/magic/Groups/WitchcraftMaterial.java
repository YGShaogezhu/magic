package ygshaogezhu.magic.Groups;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import ygshaogezhu.magic.List.ItemList;

public class WitchcraftMaterial extends ItemGroup {

    public WitchcraftMaterial() {
        super("witchcraft_material");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemList.BONE_BOOTS.get());
    }
}
