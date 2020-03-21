package dev.bitnet.yogmod.items;

import dev.bitnet.yogmod.YogMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CakeBatter extends Item {
    public CakeBatter() {
        super(new Item.Properties()
                .group(YogMod.setup.itemGroup)
                .food(new Food.Builder()
                        .hunger(1)
                        .saturation(0.1f)
                        .effect(new EffectInstance(Effects.HUNGER, 600, 1), 03f)
                        .build()
                )
        );
        setRegistryName("cake_batter");
    }
}
