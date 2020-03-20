package dev.bitnet.yogmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class DwarfishRune extends Block {
    public DwarfishRune() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(2)
        );
        setRegistryName("dwarfish_rune");
    }
}
