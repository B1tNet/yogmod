package dev.bitnet.yogmod.items;

import dev.bitnet.yogmod.YogMod;
import net.minecraft.item.Item;

public class AgarAgar extends Item {
    public AgarAgar() {
        super(new Properties()
                .group(YogMod.setup.itemGroup)
        );
        setRegistryName("agar_agar");
    }
}
