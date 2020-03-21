package dev.bitnet.yogmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class VoidCoalOre extends Block {
    public VoidCoalOre() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(5, 1200)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(3)
                .sound(SoundType.STONE)
        );
        setRegistryName("void_coal_ore");
    }
}
