package dev.bitnet.yogmod.items;

import dev.bitnet.yogmod.YogMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class SpongeCake extends Item {
    public SpongeCake() {
        super(new Item.Properties()
                .group(YogMod.setup.itemGroup)
                .food(new Food.Builder()
                        .hunger(3)
                        .saturation(0.3f)
                        .build()
                )
        );
    }
}
