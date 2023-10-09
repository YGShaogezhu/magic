package ygshaogezhu.magic.TieredItem.SwordItem;


import net.minecraft.item.SwordItem;
import ygshaogezhu.magic.Groups.MagicGroup;
import ygshaogezhu.magic.Tier.MagicTier;

public class BoneSword extends SwordItem {

    public BoneSword() {
        super(MagicTier.Bone, 10, -2.4f, new Properties().group(MagicGroup.WITCHCRAFT_TOOL));
    }

    }

