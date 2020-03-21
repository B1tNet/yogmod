package dev.bitnet.yogmod.items;

import dev.bitnet.yogmod.YogMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Orange extends Item {
    public Orange() {
        super(new Item.Properties()
                .group(YogMod.setup.itemGroup)
                .food(new Food.Builder().saturation(0.2f).hunger(2).build())
        );
        setRegistryName("orange");
    }
}
