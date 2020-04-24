package dev.bitnet.yogmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class DwarfSteelBlock extends Block {
    public DwarfSteelBlock() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.METAL)
                .hardnessAndResistance(5, 50)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
