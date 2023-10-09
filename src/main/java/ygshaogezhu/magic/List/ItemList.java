package ygshaogezhu.magic.List;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ygshaogezhu.magic.Armor.MagicArmorMaterial;
import ygshaogezhu.magic.Groups.MagicGroup;
import ygshaogezhu.magic.Magic;
import ygshaogezhu.magic.TieredItem.SwordItem.BoneSword;
import ygshaogezhu.magic.TieredItem.SwordItem.DeepCrystalSword;
import ygshaogezhu.magic.TieredItem.ToolItem.Axeitem.BoneAxe;
import ygshaogezhu.magic.TieredItem.ToolItem.HoeItem.BoneHoe;
import ygshaogezhu.magic.TieredItem.ToolItem.PickaxeItem.BonePickaxe;

public class ItemList {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Magic.MOD_ID);

    public static final RegistryObject<Item> WOLF_BLOOD = ITEMS.register("wolf_blood", ()-> new Item(new Item.Properties().group(MagicGroup.WITCHCRAFT_MATERIAL)));
    public static final RegistryObject<Item> WOLF_BONE = ITEMS.register("wolfbone", ()-> new Item(new Item.Properties().group(MagicGroup.WITCHCRAFT_MATERIAL)));
    public static final RegistryObject<Item> WOLF_HEART = ITEMS.register("wolfheart", ()-> new Item(new Item.Properties().group(MagicGroup.WITCHCRAFT_MATERIAL)));
    public static final RegistryObject<Item> WOLF_SKIN = ITEMS.register("wolfskin", ()-> new Item(new Item.Properties().group(MagicGroup.WITCHCRAFT_MATERIAL)));
    public static final RegistryObject<Item> WOLF_TAIL = ITEMS.register("wolftail", ()-> new Item(new Item.Properties().group(MagicGroup.WITCHCRAFT_MATERIAL)));
    public static final RegistryObject<Item> OX_BONE = ITEMS.register("oxbone", ()-> new Item(new Item.Properties().group(MagicGroup.WITCHCRAFT_MATERIAL)));
    public static final RegistryObject<Item> OX_HEART = ITEMS.register("oxheart", ()-> new Item(new Item.Properties().group(MagicGroup.WITCHCRAFT_MATERIAL)));
    public static final RegistryObject<Item> COWHIDE = ITEMS.register("cowhide", ()-> new Item(new Item.Properties().group(MagicGroup.WITCHCRAFT_MATERIAL)));
    public static final RegistryObject<Item> OX_TAIL = ITEMS.register("oxtail", ()-> new Item(new Item.Properties().group(MagicGroup.WITCHCRAFT_MATERIAL)));
    public static final RegistryObject<Item> SHEEP_BLOOD = ITEMS.register("sheepblood", ()-> new Item(new Item.Properties().group(MagicGroup.WITCHCRAFT_MATERIAL)));
    public static final RegistryObject<Item> SHEEP_BONE = ITEMS.register("sheepbone", ()-> new Item(new Item.Properties().group(MagicGroup.WITCHCRAFT_MATERIAL)));
    public static final RegistryObject<Item> SHEEP_HEART = ITEMS.register("sheepheart", ()-> new Item(new Item.Properties().group(MagicGroup.WITCHCRAFT_MATERIAL)));
    public static final RegistryObject<Item> SHEEP_SKIN = ITEMS.register("sheepskin", ()-> new Item(new Item.Properties().group(MagicGroup.WITCHCRAFT_MATERIAL)));
    public static final RegistryObject<Item> SHEEP_TAIL = ITEMS.register("sheeptail", ()-> new Item(new Item.Properties().group(MagicGroup.WITCHCRAFT_MATERIAL)));
    public static final RegistryObject<Item> DEEP_CRYSTALl = ITEMS.register("deep_crystal", ()-> new Item(new Item.Properties().group(MagicGroup.WITCHCRAFT_CRYSTAL)));
    public static final RegistryObject<Item> FLAME_CRYSTALl = ITEMS.register("flame_crystal", ()-> new Item(new Item.Properties().group(MagicGroup.WITCHCRAFT_CRYSTAL)));
    public static final RegistryObject<Item> OCEAN_CRYSTALl = ITEMS.register("ocean_crystal", ()-> new Item(new Item.Properties().group(MagicGroup.WITCHCRAFT_CRYSTAL)));
    public static final RegistryObject<Item> WIND_CRYSTALl = ITEMS.register("wind_crystal", ()-> new Item(new Item.Properties().group(MagicGroup.WITCHCRAFT_CRYSTAL)));
    public static final RegistryObject<Item> WATER_CRYSTALl = ITEMS.register("water_crystal", ()-> new Item(new Item.Properties().group(MagicGroup.WITCHCRAFT_CRYSTAL)));

    // 武器
    public static final RegistryObject<Item> BONE_SWORD = ITEMS.register("bone_sword", BoneSword::new);
    public static final RegistryObject<Item> DEEP_CRYSTAL_SWORD = ITEMS.register("deep_crystal_sword", DeepCrystalSword::new);

    // 工具
    public static final RegistryObject<Item> BONE_PICKAXEe = ITEMS.register("bone_pickaxe", BonePickaxe::new);
    public static final RegistryObject<Item> BONE_AXE = ITEMS.register("bone_axe", BoneAxe::new);
    public static final RegistryObject<Item> BONE_HOE = ITEMS.register("bone_hoe", BoneHoe::new);

    // 头盔
    public static final RegistryObject<Item> BONE_HELMET = ITEMS.register("bone_helmet", () -> new ArmorItem(MagicArmorMaterial.Bone, EquipmentSlotType.HEAD, (new Item.Properties()).group(MagicGroup.WITCHCRAFT_ARMOR)));

    // 胸甲
    public static final RegistryObject<Item> BONE_CHESTPLATE = ITEMS.register("bone_chestplate", () -> new ArmorItem(MagicArmorMaterial.Bone, EquipmentSlotType.CHEST, (new Item.Properties()).group(MagicGroup.WITCHCRAFT_ARMOR)));

    // 护腿
    public static final RegistryObject<Item> BONE_LEGGINGS = ITEMS.register("bone_leggings", () -> new ArmorItem(MagicArmorMaterial.Bone, EquipmentSlotType.LEGS, (new Item.Properties()).group(MagicGroup.WITCHCRAFT_ARMOR)));

    // 鞋子
    public static final RegistryObject<Item> BONE_BOOTS = ITEMS.register("bone_boots", () -> new ArmorItem(MagicArmorMaterial.Bone, EquipmentSlotType.FEET, (new Item.Properties()).group(MagicGroup.WITCHCRAFT_ARMOR)));

    // 食物
    public static final RegistryObject<Item> WOLF_MEAT = ITEMS.register( "wolf_meat", ()-> new Item(new Item.Properties().group(MagicGroup.WITCHCRAFT_FOOD).food(FoodList.wolfmeat)));
    public static final RegistryObject<Item> COOKED_WOLF_MEAT = ITEMS.register( "cooked_wolf_meat", ()-> new Item(new Item.Properties().group(MagicGroup.WITCHCRAFT_FOOD).food(FoodList.cooked_wolfmeat)));

    // 方块
    public static final RegistryObject<Item> WITCHCRAFT_TABLE = ITEMS.register("witchcraft_table", ()-> new BlockItem(BlockList.WITCHCRAFT_TABLE.get(), new Item.Properties().group(MagicGroup.WITCHCRAFT_WORLD)));
    public static final RegistryObject<Item> WITCHCRAFT_ALTAR = ITEMS.register("witchcraft_altar", ()-> new BlockItem(BlockList.WITCHCRAFT_ALTAR.get(), new Item.Properties().group(MagicGroup.WITCHCRAFT_WORLD)));
    public static final RegistryObject<Item> WITCHCRAFT_SMELTING_FURNACE = ITEMS.register("witchcraft_smelting_furnace", ()-> new BlockItem(BlockList.WITCHCRAFT_SMELTING_FURNACE.get(), new Item.Properties().group(MagicGroup.WITCHCRAFT_WORLD)));

    // 矿石
    public static final RegistryObject<Item> EARTH_CRYSTAL_ORE = ITEMS.register("earth_crystal_ore", ()-> new BlockItem(BlockList.EARTH_CRYSTAL_ORE.get(), new Item.Properties().group(MagicGroup.WITCHCRAFT_ORE)));
    public static final RegistryObject<Item> FLAME_CRYSTAL_ORE = ITEMS.register("flame_crystal_ore", ()-> new BlockItem(BlockList.FLAME_CRYSTAL_ORE.get(), new Item.Properties().group(MagicGroup.WITCHCRAFT_ORE)));
    public static final RegistryObject<Item> OCEAN_CRYSTAL_ORE = ITEMS.register("ocean_crystal_ore", ()-> new BlockItem(BlockList.OCEAN_CRYSTAL_ORE.get(), new Item.Properties().group(MagicGroup.WITCHCRAFT_ORE)));
    public static final RegistryObject<Item> WIND_cCRYSTAL_ORE = ITEMS.register("wind_crystal_ore", ()-> new BlockItem(BlockList.WIND_cCRYSTAL_ORE.get(), new Item.Properties().group(MagicGroup.WITCHCRAFT_ORE)));
    public static final RegistryObject<Item> DEEP_CRYSTAL_ORE = ITEMS.register("deep_crystal_ore", ()-> new BlockItem(BlockList.DEEP_CRYSTAL_ORE.get(), new Item.Properties().group(MagicGroup.WITCHCRAFT_ORE)));

    // 流体


}
