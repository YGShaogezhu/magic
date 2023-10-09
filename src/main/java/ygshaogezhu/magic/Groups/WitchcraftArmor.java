package ygshaogezhu.magic.Groups;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import ygshaogezhu.magic.List.ItemList;

public class WitchcraftArmor extends ItemGroup {
    public WitchcraftArmor() {
        super("witchcraft_armor");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemList.BONE_BOOTS.get());
    }
}
