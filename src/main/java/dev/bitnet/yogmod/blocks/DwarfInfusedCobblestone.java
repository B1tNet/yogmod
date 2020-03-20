package dev.bitnet.yogmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class DwarfInfusedCobblestone extends Block {
    public DwarfInfusedCobblestone() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(6)
        );
        setRegistryName("dwarf_infused_cobblestone");
    }
}
