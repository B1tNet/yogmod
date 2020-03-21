package dev.bitnet.yogmod;

import dev.bitnet.yogmod.blocks.*;
import dev.bitnet.yogmod.items.DwarfEssence;
import dev.bitnet.yogmod.items.DwarfSteelIngot;
import dev.bitnet.yogmod.items.JaffaCake;
import dev.bitnet.yogmod.setup.ClientProxy;
import dev.bitnet.yogmod.setup.IProxy;
import dev.bitnet.yogmod.setup.ModSetup;
import dev.bitnet.yogmod.setup.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("yogmod")
public class YogMod {

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public static ModSetup setup = new ModSetup();

    private static final Logger LOGGER = LogManager.getLogger();

    public YogMod() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        proxy.getClientWorld();
        setup.init();
        proxy.init();
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        //Register items
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            event.getRegistry().register(new DwarfEssence());
            event.getRegistry().register(new JaffaCake());
            event.getRegistry().register(new DwarfSteelIngot());
        }

        //Register the blocks
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new DwarfishRune());
            event.getRegistry().register(new DwarfInfusedCobblestone());
            event.getRegistry().register(new Voidrock());
            event.getRegistry().register(new VoidCobblestone());
            event.getRegistry().register(new VoidCoalOre());
            event.getRegistry().register(new VoidIronOre());
            event.getRegistry().register(new VoidGoldOre());
            event.getRegistry().register(new VoidLapisOre());
            event.getRegistry().register(new VoidRedstoneOre());
            event.getRegistry().register(new VoidDiamondOre());
            event.getRegistry().register(new VoidEmeraldOre());
            event.getRegistry().register(new VoidDwarfSteelOre());
        }

        //Register BlockItem
        @SubscribeEvent
        public static void onBlockItemsRegistry(final RegistryEvent.Register<Item> event) {
            event.getRegistry().register(new BlockItem(ModBlocks.DWARFISH_RUNE, new Item.Properties().group(setup.itemGroup)).setRegistryName("dwarfish_rune"));
            event.getRegistry().register(new BlockItem(ModBlocks.DWARF_INFUSED_COBBLESTONE, new Item.Properties().group(setup.itemGroup)).setRegistryName("dwarf_infused_cobblestone"));
            event.getRegistry().register(new BlockItem(ModBlocks.VOIDROCK, new Item.Properties().group(setup.itemGroup)).setRegistryName("voidrock"));
            event.getRegistry().register(new BlockItem(ModBlocks.VOID_COBBLESTONE, new Item.Properties().group(setup.itemGroup)).setRegistryName("void_cobblestone"));
            event.getRegistry().register(new BlockItem(ModBlocks.VOID_COAL_ORE, new Item.Properties().group(setup.itemGroup)).setRegistryName("void_coal_ore"));
            event.getRegistry().register(new BlockItem(ModBlocks.VOID_IRON_ORE, new Item.Properties().group(setup.itemGroup)).setRegistryName("void_iron_ore"));
            event.getRegistry().register(new BlockItem(ModBlocks.VOID_GOLD_ORE, new Item.Properties().group(setup.itemGroup)).setRegistryName("void_gold_ore"));
            event.getRegistry().register(new BlockItem(ModBlocks.VOID_LAPIS_ORE, new Item.Properties().group(setup.itemGroup)).setRegistryName("void_lapis_ore"));
            event.getRegistry().register(new BlockItem(ModBlocks.VOID_REDSTONE_ORE, new Item.Properties().group(setup.itemGroup)).setRegistryName("void_redstone_ore"));
            event.getRegistry().register(new BlockItem(ModBlocks.VOID_DIAMOND_ORE, new Item.Properties().group(setup.itemGroup)).setRegistryName("void_diamond_ore"));
            event.getRegistry().register(new BlockItem(ModBlocks.VOID_EMERALD_ORE, new Item.Properties().group(setup.itemGroup)).setRegistryName("void_emerald_ore"));
            event.getRegistry().register(new BlockItem(ModBlocks.VOID_DWARF_STEEL_ORE, new Item.Properties().group(setup.itemGroup)).setRegistryName("void_dwarf_steel_ore"));
        }
    }
}
