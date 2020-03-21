package dev.bitnet.yogmod.items;

import dev.bitnet.yogmod.YogMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ChocolateChunk extends Item {
    public ChocolateChunk() {
        super(new Properties()
                .group(YogMod.setup.itemGroup)
                .food(new Food.Builder()
                        .hunger(1)
                        .saturation(0.1f)
                        .effect(new EffectInstance(Effects.SPEED, 80, 1), 1)
                        .build()
                )
        );
        setRegistryName("chocolate_chunk");
    }
}
