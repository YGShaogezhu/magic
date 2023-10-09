package ygshaogezhu.magic.TieredItem.ToolItem.HoeItem;


import net.minecraft.item.HoeItem;
import ygshaogezhu.magic.Groups.MagicGroup;
import ygshaogezhu.magic.Tier.MagicTier;

public class BoneHoe extends HoeItem {

    public BoneHoe() {
        super(MagicTier.Bone, 0, 0.0F, (new Properties().group(MagicGroup.WITCHCRAFT_TOOL)));
    }

}
