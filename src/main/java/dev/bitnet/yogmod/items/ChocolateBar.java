package dev.bitnet.yogmod.items;

import dev.bitnet.yogmod.YogMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ChocolateBar extends Item {
    public ChocolateBar() {
        super(new Item.Properties()
                .group(YogMod.setup.itemGroup)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(0.4f)
                        .effect(new EffectInstance(Effects.SPEED, 200, 2), 1)
                        .build()
                )
        );
    }
}
