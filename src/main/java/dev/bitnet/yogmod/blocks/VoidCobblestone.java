package dev.bitnet.yogmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class VoidCobblestone extends Block {
    public VoidCobblestone() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(2)
                .hardnessAndResistance(3)
        );
        setRegistryName("void_cobblestone");
    }
}
