package dev.bitnet.yogmod.items;

import dev.bitnet.yogmod.YogMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class OrangeJelly extends Item {
    public OrangeJelly() {
        super(new Item.Properties()
                .group(YogMod.setup.itemGroup)
                .food(new Food.Builder()
                        .hunger(1)
                        .saturation(0.1f)
                        .fastToEat()
                        .build()
                )
        );
        setRegistryName("orange_jelly");
    }
}
