package ygshaogezhu.magic.Groups;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import ygshaogezhu.magic.List.ItemList;

public class WitchcraftCrystal extends ItemGroup {

    public WitchcraftCrystal() {
        super("witchcraft_crystal");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemList.BONE_AXE.get());
    }
}
