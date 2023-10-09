package ygshaogezhu.magic.Groups;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import ygshaogezhu.magic.List.ItemList;

public class WitchcraftOre extends ItemGroup {

    public WitchcraftOre() {
        super("witchcraft_ore");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemList.DEEP_CRYSTALl.get());
    }
}
