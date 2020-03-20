package dev.bitnet.yogmod.items;

import dev.bitnet.yogmod.YogMod;
import net.minecraft.item.Item;

public class DwarfSteelIngot extends Item {
    public DwarfSteelIngot() {
        super(new Item.Properties()
                .group(YogMod.setup.itemGroup)
        );
        setRegistryName("dwarf_steel_ingot");
    }
}
