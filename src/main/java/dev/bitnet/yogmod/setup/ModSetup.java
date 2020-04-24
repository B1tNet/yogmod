package dev.bitnet.yogmod.setup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {
    public static ItemGroup itemGroup = new ItemGroup("yogmod") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Registration.JAFFA_CAKE.get());
        }
    };

    public void init() {

    }
}
