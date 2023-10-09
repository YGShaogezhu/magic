package ygshaogezhu.magic.TieredItem.ToolItem.ShovelItem;


import net.minecraft.item.IItemTier;
import net.minecraft.item.ShovelItem;
import ygshaogezhu.magic.Groups.MagicGroup;
import ygshaogezhu.magic.Tier.MagicTier;

public class BoneShovel extends ShovelItem {

    public BoneShovel(IItemTier p_i48469_1_, float p_i48469_2_, float p_i48469_3_, Properties p_i48469_4_) {
        super(MagicTier.Bone, 0, 0.0F, (new Properties().group(MagicGroup.WITCHCRAFT_TOOL)));
    }
    
}
