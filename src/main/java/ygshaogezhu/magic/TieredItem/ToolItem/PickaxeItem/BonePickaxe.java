package ygshaogezhu.magic.TieredItem.ToolItem.PickaxeItem;

import net.minecraft.item.PickaxeItem;
import ygshaogezhu.magic.Groups.MagicGroup;
import ygshaogezhu.magic.Tier.MagicTier;

public class BonePickaxe extends PickaxeItem {

    public BonePickaxe() {
        super(MagicTier.Bone, 2, 3.0F, (new Properties()).group(MagicGroup.WITCHCRAFT_TOOL));
    }

}
