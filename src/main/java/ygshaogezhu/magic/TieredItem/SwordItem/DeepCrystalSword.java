package ygshaogezhu.magic.TieredItem.SwordItem;

import net.minecraft.item.SwordItem;
import ygshaogezhu.magic.Groups.MagicGroup;
import ygshaogezhu.magic.Tier.MagicTier;

public class DeepCrystalSword extends SwordItem{

    public DeepCrystalSword() {
        super(MagicTier.DeepCrystalSword, 5, -2.4f, new Properties().group(MagicGroup.WITCHCRAFT_TOOL));
    }

}