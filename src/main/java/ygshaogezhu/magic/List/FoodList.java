package ygshaogezhu.magic.List;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodList {
    /*
    public static final Food cooked_oxlfmeat = (new Food.Builder())
        .fast()//快速进食
        .meat()//肉类
        .hunger(8)//饱食度  2==1
        .saturation(0.3F)//饱和度
        .alwaysEat()//饱腹时也可以进食
        .effect(() -> new EffectInstance(Effects.HUNGER, 100, 1), 1f)//效果-----效果/时间（20==1s）/效果等级/效果概率
        .build();
     */
    public static final Food wolfmeat = (new Food.Builder())
            .meat()
            .hunger(6)
            .saturation(0.2F)
            .effect(() -> new EffectInstance(Effects.HUNGER, 100, 1), 1f)
            .effect(() -> new EffectInstance(Effects.POISON, 50, 1), 1f)
            .build();
    public static final Food cooked_wolfmeat = (new Food.Builder())
            .meat()
            .hunger(8)
            .saturation(0.3F)
            .build();
    public static final Food oxlfmeat = (new Food.Builder())
            .meat()
            .hunger(6)
            .saturation(0.2F)
            .build();
    public static final Food cooked_oxlfmeat = (new Food.Builder())
            .meat()
            .hunger(8)
            .saturation(0.3F)
            .build();
}
