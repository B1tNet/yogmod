package dev.bitnet.yogmod.items;

import dev.bitnet.yogmod.YogMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class JaffaCake extends Item {
    public JaffaCake() {
        super(new Item.Properties()
                .group(YogMod.setup.itemGroup)
                .food(new Food.Builder().hunger(3).saturation(0.8f).build())
        );
        setRegistryName("jaffa_cake");
    }
}
