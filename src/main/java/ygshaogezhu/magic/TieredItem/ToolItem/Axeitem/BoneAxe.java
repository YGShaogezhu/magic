package ygshaogezhu.magic.TieredItem.ToolItem.Axeitem;


import net.minecraft.item.AxeItem;
import ygshaogezhu.magic.Groups.MagicGroup;
import ygshaogezhu.magic.Tier.MagicTier;

public class BoneAxe extends AxeItem {

    public BoneAxe() {
        super(MagicTier.Bone, 0, 0F, (new Properties().group(MagicGroup.WITCHCRAFT_TOOL)));
    }
    
}
