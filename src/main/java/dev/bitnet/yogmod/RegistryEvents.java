package dev.bitnet.yogmod;

import dev.bitnet.yogmod.blocks.*;
import dev.bitnet.yogmod.items.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {
    //Register items
    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new DwarfEssence());
        event.getRegistry().register(new JaffaCake());
        event.getRegistry().register(new DwarfSteelIngot());
        event.getRegistry().register(new Orange());
        event.getRegistry().register(new CakeBatter());
        event.getRegistry().register(new ChocolateBar());
        event.getRegistry().register(new ChocolateChunk());
    }

    //Register the blocks
    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new DwarfishRune());
        event.getRegistry().register(new DwarfInfusedCobblestone());
        event.getRegistry().register(new Deeprock());
        event.getRegistry().register(new CobbledDeeprock());
        event.getRegistry().register(new DeepCoalOre());
        event.getRegistry().register(new DeepIronOre());
        event.getRegistry().register(new DeepGoldOre());
        event.getRegistry().register(new DeepLapisOre());
        event.getRegistry().register(new DeepRedstoneOre());
        event.getRegistry().register(new DeepDiamondOre());
        event.getRegistry().register(new DeepEmeraldOre());
        event.getRegistry().register(new DeepDwarfSteelOre());
        event.getRegistry().register(new DwarfSteelBlock());
    }

    //Register BlockItem
    @SubscribeEvent
    public static void onBlockItemsRegistry(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new BlockItem(ModBlocks.DWARFISH_RUNE, new Item.Properties().group(YogMod.setup.itemGroup)).setRegistryName("dwarfish_rune"));
        event.getRegistry().register(new BlockItem(ModBlocks.DWARF_INFUSED_COBBLESTONE, new Item.Properties().group(YogMod.setup.itemGroup)).setRegistryName("dwarf_infused_cobblestone"));
        event.getRegistry().register(new BlockItem(ModBlocks.DEEPROCK, new Item.Properties().group(YogMod.setup.itemGroup)).setRegistryName("deeprock"));
        event.getRegistry().register(new BlockItem(ModBlocks.COBBLED_DEEPROCK, new Item.Properties().group(YogMod.setup.itemGroup)).setRegistryName("cobbled_deeprock"));
        event.getRegistry().register(new BlockItem(ModBlocks.DEEP_COAL_ORE, new Item.Properties().group(YogMod.setup.itemGroup)).setRegistryName("deep_coal_ore"));
        event.getRegistry().register(new BlockItem(ModBlocks.DEEP_IRON_ORE, new Item.Properties().group(YogMod.setup.itemGroup)).setRegistryName("deep_iron_ore"));
        event.getRegistry().register(new BlockItem(ModBlocks.DEEP_GOLD_ORE, new Item.Properties().group(YogMod.setup.itemGroup)).setRegistryName("deep_gold_ore"));
        event.getRegistry().register(new BlockItem(ModBlocks.DEEP_LAPIS_ORE, new Item.Properties().group(YogMod.setup.itemGroup)).setRegistryName("deep_lapis_ore"));
        event.getRegistry().register(new BlockItem(ModBlocks.DEEP_REDSTONE_ORE, new Item.Properties().group(YogMod.setup.itemGroup)).setRegistryName("deep_redstone_ore"));
        event.getRegistry().register(new BlockItem(ModBlocks.DEEP_DIAMOND_ORE, new Item.Properties().group(YogMod.setup.itemGroup)).setRegistryName("deep_diamond_ore"));
        event.getRegistry().register(new BlockItem(ModBlocks.DEEP_EMERALD_ORE, new Item.Properties().group(YogMod.setup.itemGroup)).setRegistryName("deep_emerald_ore"));
        event.getRegistry().register(new BlockItem(ModBlocks.DEEP_DWARF_STEEL_ORE, new Item.Properties().group(YogMod.setup.itemGroup)).setRegistryName("deep_dwarf_steel_ore"));
        event.getRegistry().register(new BlockItem(ModBlocks.DWARF_STEEL_BLOCK, new Item.Properties().group(YogMod.setup.itemGroup)).setRegistryName("dwarf_steel_block"));
    }
}
