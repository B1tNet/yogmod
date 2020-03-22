package dev.bitnet.yogmod.items;

import dev.bitnet.yogmod.YogMod;
import net.minecraft.item.*;

public class SunflowerSeedMilk extends Item {
    public SunflowerSeedMilk() {
        super(new Item.Properties()
                .group(YogMod.setup.itemGroup)
                .maxStackSize(1)
                .containerItem(Items.MILK_BUCKET)
                .food(new Food.Builder()
                        .hunger(0)
                        .saturation(0f)
                        .build()
                )
        );
        setRegistryName("sunflower_seed_milk");
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }
}
