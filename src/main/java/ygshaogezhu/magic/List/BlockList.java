package ygshaogezhu.magic.List;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ygshaogezhu.magic.Magic;
import ygshaogezhu.magic.TieredItem.ToolItem.Miscellaneous.MagicOreBlock;

public class BlockList {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Magic.MOD_ID);

    // 方块
    public static final RegistryObject<Block> WITCHCRAFT_TABLE = BLOCKS.register("witchcraft_table", ()-> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.AXE).harvestLevel(2).hardnessAndResistance(8).sound(SoundType.NETHER_WART)));
    public static final RegistryObject<Block> WITCHCRAFT_ALTAR = BLOCKS.register("witchcraft_altar", ()-> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(2).hardnessAndResistance(8).sound(SoundType.NETHER_WART)));
    public static final RegistryObject<Block> WITCHCRAFT_SMELTING_FURNACE = BLOCKS.register("witchcraft_smelting_furnace", ()-> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(1).hardnessAndResistance(5).sound(SoundType.SNOW)));
    public static final RegistryObject<Block> ARCANE_STONE = BLOCKS.register("arcane_stone",()-> new Block(AbstractBlock.Properties.create(Material.ROCK)).harvestLevel(2).hardnessAndResistance(8));

    //矿物
    public static final RegistryObject<Block> EARTH_CRYSTAL_ORE = BLOCKS.register("earth_crystal_ore", ()-> new MagicOreBlock(Block.Properties.from(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> FLAME_CRYSTAL_ORE = BLOCKS.register("flame_crystal_ore", ()-> new MagicOreBlock(Block.Properties.from(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block>OCEAN_CRYSTAL_ORE = BLOCKS.register("ocean_crystal_ore", ()-> new MagicOreBlock(Block.Properties.from(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> WIND_cCRYSTAL_ORE = BLOCKS.register("wind_crystal_ore", ()-> new MagicOreBlock(Block.Properties.from(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> DEEP_CRYSTAL_ORE = BLOCKS.register("deep_crystal_ore", ()-> new MagicOreBlock(Block.Properties.from(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> arcane_ingot = BLOCKS.register("arcane_ingot", ()-> new Block(AbstractBlock.Properties.create(Material.PORTAL).harvestTool(ToolType.PICKAXE).harvestLevel(3).hardnessAndResistance(8).sound(SoundType.NETHER_WART)));

    //gui方块
    public static final RegistryObject<Block> example_gui_block = BLOCKS.register("example_gui_block", ()-> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestTool(ToolType.AXE).harvestLevel(2).hardnessAndResistance(8).sound(SoundType.NETHER_WART)));

    //树木
    public static final RegistryObject<Block> MAGIC_LOG = BLOCKS.register("magic_log", () -> new RotatedPillarBlock(AbstractBlock.Properties.from(Blocks.OAK_LOG)));

}
