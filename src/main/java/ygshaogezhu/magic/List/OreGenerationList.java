package ygshaogezhu.magic.List;

import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGenerationList {

/*    public static void generateOres(final BiomeLoadingEvent event) {
        /////////////// 特定生物群系生成矿石///////////////
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.JUNGLE))) {
            oreGenerate(event.getGeneration(),
                    OreFeatureConfig.FillerBlockType.field_241882_a,
                    BlockList.EARTH_CRYSTAL_ORE.get().getDefaultState(),
                    6,  //矿脉最大数量（vanilla没有规定最小数量，要实现的话需要自己写一个Feature）
                    5,  //矿物生成最小y值
                    0,  //TopOffset最好设为0
                    20,//矿物生成最大y值
                    8   //每个区块内的数量
            );
        }

    }

    private static void oreGenerate(
            BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize,
            int minimalHeight, int topOffset, int maximalHeight, int countPerChunk) {
        settings.getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(new OreFeatureConfig(fillerType, state, veinSize))
                        .withPlacement(
                                Placement.RANGE.configure(new TopSolidRangeConfig(
                                        minimalHeight,
                                        topOffset, //通常为0
                                        maximalHeight)))
                        .square()
                        .func_242731_b(countPerChunk));
    }*/
}
