package ygshaogezhu.magic.TieredItem.ToolItem.Miscellaneous;

import net.minecraft.block.OreBlock;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class MagicOreBlock extends OreBlock {

    public MagicOreBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected int getExperience (Random random) {
        return MathHelper.nextInt(random, 2, 6);
    }


}
