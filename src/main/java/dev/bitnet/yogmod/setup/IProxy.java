package dev.bitnet.yogmod.setup;

import net.minecraft.world.World;

public interface IProxy {
    void init();
    World getClientWorld();
}
