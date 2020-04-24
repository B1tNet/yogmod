package dev.bitnet.yogmod.setup;

import dev.bitnet.yogmod.blocks.*;
import dev.bitnet.yogmod.items.*;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static dev.bitnet.yogmod.YogMod.MODID;

public class Registration {
    private static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MODID);
    private static final DeferredRegister<TileEntityType<?>> TILES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, MODID);
    private static final DeferredRegister<ContainerType<?>> CONTAINERS = new DeferredRegister<>(ForgeRegistries.CONTAINERS, MODID);
    private static final DeferredRegister<EntityType<?>> ENTITIES = new DeferredRegister<>(ForgeRegistries.ENTITIES, MODID);
    private static final DeferredRegister<ModDimension> DIMENSIONS = new DeferredRegister<>(ForgeRegistries.MOD_DIMENSIONS, MODID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        TILES.register(FMLJavaModLoadingContext.get().getModEventBus());
        CONTAINERS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
        DIMENSIONS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<DwarfEssence> DWARF_ESSENCE = ITEMS.register("dwarf_essence", DwarfEssence::new);
    public static final RegistryObject<JaffaCake> JAFFA_CAKE = ITEMS.register("jaffa_cake", JaffaCake::new);
    public static final RegistryObject<DwarfSteelIngot> DWARF_STEEL_INGOT = ITEMS.register("dwarf_steel_ingot", DwarfSteelIngot::new);
    public static final RegistryObject<Orange> ORANGE = ITEMS.register("orange", Orange::new);
    public static final RegistryObject<CakeBatter> CAKE_BATTER = ITEMS.register("cake_batter", CakeBatter::new);
    public static final RegistryObject<ChocolateBar> CHOCOLATE_BAR = ITEMS.register("chocolate_bar", ChocolateBar::new);
    public static final RegistryObject<ChocolateChunk> CHOCOLATE_CHUNK = ITEMS.register("chocolate_chunk", ChocolateChunk::new);
    public static final RegistryObject<RoastedCocoaBeans> ROASTED_COCOA_BEANS = ITEMS.register("roasted_cocoa_beans", RoastedCocoaBeans::new);
    public static final RegistryObject<SpongeCake> SPONGE_CAKE = ITEMS.register("sponge_cake", SpongeCake::new);
    public static final RegistryObject<SunflowerSeedMilk> SUNFLOWER_SEED_MILK = ITEMS.register("sunflower_seed_milk", SunflowerSeedMilk::new);
    public static final RegistryObject<Gelatin> GELATIN = ITEMS.register("gelatin", Gelatin::new);
    public static final RegistryObject<AgarAgar> AGAR_AGAR = ITEMS.register("agar_agar", AgarAgar::new);

    //Blocks
    public static final RegistryObject<DwarfishRune> DWARFISH_RUNE = BLOCKS.register("dwarfish_rune", DwarfishRune::new);
    public static final RegistryObject<DwarfInfusedCobblestone> DWARF_INFUSED_COBBLESTONE = BLOCKS.register("dwarf_infused_cobblestone", DwarfInfusedCobblestone::new);
    public static final RegistryObject<Deeprock> DEEPROCK = BLOCKS.register("deeprock", Deeprock::new);
    public static final RegistryObject<DeepCoalOre> DEEP_COAL_ORE = BLOCKS.register("deep_coal_ore", DeepCoalOre::new);
    public static final RegistryObject<DeepIronOre> DEEP_IRON_ORE = BLOCKS.register("deep_iron_ore", DeepIronOre::new);
    public static final RegistryObject<DeepGoldOre> DEEP_GOLD_ORE = BLOCKS.register("deep_gold_ore", DeepGoldOre::new);
    public static final RegistryObject<DeepLapisOre> DEEP_LAPIS_ORE = BLOCKS.register("deep_lapis_ore", DeepLapisOre::new);
    public static final RegistryObject<DeepRedstoneOre> DEEP_REDSTONE_ORE = BLOCKS.register("deep_redstone_ore", DeepRedstoneOre::new);
    public static final RegistryObject<DeepDiamondOre> DEEP_DIAMOND_ORE = BLOCKS.register("deep_diamond_ore", DeepDiamondOre::new);
    public static final RegistryObject<DeepEmeraldOre> DEEP_EMERALD_ORE = BLOCKS.register("deep_emerald_ore", DeepEmeraldOre::new);
    public static final RegistryObject<DeepDwarfSteelOre> DEEP_DWARF_STEEL_ORE = BLOCKS.register("deep_dwarf_steel_ore", DeepDwarfSteelOre::new);
    public static final RegistryObject<DwarfSteelBlock> DWARF_STEEL_BLOCK = BLOCKS.register("dwarf_steel_block", DwarfSteelBlock::new);
    public static final RegistryObject<CobbledDeeprock> COBBLED_DEEPROCK = BLOCKS.register("cobbled_deeprock", CobbledDeeprock::new);

    //BlockItems
    public static final RegistryObject<Item> DWARFISH_RUNE_ITEM  = ITEMS.register("dwarfish_rune", () -> new BlockItem(DWARFISH_RUNE.get(), new Item.Properties().group(ModSetup.itemGroup)));
    public static final RegistryObject<Item> DWARF_INFUSED_COBBLESTONE_ITEM = ITEMS.register("dwarf_infused_cobblestone", () -> new BlockItem(DWARF_INFUSED_COBBLESTONE.get(), new Item.Properties().group(ModSetup.itemGroup)));
    public static final RegistryObject<Item> DEEPROCK_ITEM = ITEMS.register("deeprock", () -> new BlockItem(DEEPROCK.get(), new Item.Properties().group(ModSetup.itemGroup)));
    public static final RegistryObject<Item> DEEP_COAL_ORE_ITEM = ITEMS.register("deep_coal_ore", () -> new BlockItem(DEEP_COAL_ORE.get(), new Item.Properties().group(ModSetup.itemGroup)));
    public static final RegistryObject<Item> DEEP_IRON_ORE_ITEM = ITEMS.register("deep_iron_ore", () -> new BlockItem(DEEP_IRON_ORE.get(), new Item.Properties().group(ModSetup.itemGroup)));
    public static final RegistryObject<Item> DEEP_GOLD_ORE_ITEM = ITEMS.register("deep_gold_ore", () -> new BlockItem(DEEP_GOLD_ORE.get(), new Item.Properties().group(ModSetup.itemGroup)));
    public static final RegistryObject<Item> DEEP_LAPIS_ORE_ITEM = ITEMS.register("deep_lapis_ore", () -> new BlockItem(DEEP_LAPIS_ORE.get(), new Item.Properties().group(ModSetup.itemGroup)));
    public static final RegistryObject<Item> DEEP_REDSTONE_ORE_ITEM = ITEMS.register("deep_redstone_ore", () -> new BlockItem(DEEP_REDSTONE_ORE.get(), new Item.Properties().group(ModSetup.itemGroup)));
    public static final RegistryObject<Item> DEEP_DIAMOND_ORE_ITEM = ITEMS.register("deep_diamond_ore", () -> new BlockItem(DEEP_DIAMOND_ORE.get(), new Item.Properties().group(ModSetup.itemGroup)));
    public static final RegistryObject<Item> DEEP_EMERALD_ORE_ITEM = ITEMS.register("deep_emerald_ore", () -> new BlockItem(DEEP_EMERALD_ORE.get(), new Item.Properties().group(ModSetup.itemGroup)));
    public static final RegistryObject<Item> DEEP_DWARF_STEEL_ORE_ITEM = ITEMS.register("deep_dwarf_steel_ore", () -> new BlockItem(DEEP_DWARF_STEEL_ORE.get(), new Item.Properties().group(ModSetup.itemGroup)));
    public static final RegistryObject<Item> DWARF_STEEL_BLOCK_ITEM = ITEMS.register("dwarf_steel_block", () -> new BlockItem(DWARF_STEEL_BLOCK.get(), new Item.Properties().group(ModSetup.itemGroup)));
    public static final RegistryObject<Item> COBBLED_DEEPROCK_ITEM = ITEMS.register("cobbled_deeprock", () -> new BlockItem(COBBLED_DEEPROCK.get(), new Item.Properties().group(ModSetup.itemGroup)));
}
