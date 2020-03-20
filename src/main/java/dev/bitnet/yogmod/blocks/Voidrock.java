package dev.bitnet.yogmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Voidrock extends Block {
    public Voidrock() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
        setRegistryName("voidrock");
    }
}
