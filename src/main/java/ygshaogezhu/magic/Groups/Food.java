package ygshaogezhu.magic.Groups;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import ygshaogezhu.magic.List.ItemList;

public class Food extends ItemGroup {

    public Food() {
        super("food");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemList.BONE_BOOTS.get());
    }
}
