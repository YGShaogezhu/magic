package ygshaogezhu.magic.Tier;


import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import ygshaogezhu.magic.List.ItemList;

import java.util.function.Supplier;

public enum MagicTier implements IItemTier {

    Bone(2, 100, 1.6F, 4.0F, 10, () -> {
        return Ingredient.fromItems(ItemList.WOLF_BLOOD.get());
    }),
    DeepCrystalSword(4, 200, 1.1F, 4.0F, 15, () -> {
        return Ingredient.fromItems(ItemList.WOLF_MEAT.get());
    });

    private final int harvestLevel; // 挖掘等级
    private final int maxUses; // 耐久值
    private final float efficiency; // 速度
    private final float attackDamage; // 伤害 = 1 + 物品攻击力
    private final int enchantability; // 附魔值
    private final LazyValue<Ingredient> repairMaterial; // 修复东西

    private MagicTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = new LazyValue<>(repairMaterialIn);
    }

    public int getMaxUses() {
        return this.maxUses;
    }

    public float getEfficiency() {
        return this.efficiency;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

}
