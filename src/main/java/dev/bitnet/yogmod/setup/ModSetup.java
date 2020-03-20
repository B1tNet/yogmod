package dev.bitnet.yogmod.setup;

import dev.bitnet.yogmod.items.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {
    public static ItemGroup itemGroup = new ItemGroup("yogmod") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.JAFFA_CAKE);
        }
    };

    public void init() {

    }
}
