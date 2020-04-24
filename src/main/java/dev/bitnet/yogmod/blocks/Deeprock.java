package dev.bitnet.yogmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Deeprock extends Block {
    public Deeprock() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(25, 1200)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
