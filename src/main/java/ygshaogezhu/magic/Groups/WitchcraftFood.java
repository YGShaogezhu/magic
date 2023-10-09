package ygshaogezhu.magic.Groups;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import ygshaogezhu.magic.List.ItemList;

public class WitchcraftFood extends ItemGroup {

    public WitchcraftFood() {
        super("witchcraft_food");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemList.WOLF_BLOOD.get());
    }
}
