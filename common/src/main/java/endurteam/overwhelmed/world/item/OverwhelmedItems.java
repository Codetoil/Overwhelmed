package endurteam.overwhelmed.world.item;

import dev.architectury.registry.registries.RegistrySupplier;
import endurteam.overwhelmed.world.entity.OverwhelmedEntityTypes;
import endurteam.overwhelmed.world.food.OverwhelmedFoods;
import endurteam.overwhelmed.world.level.block.OverwhelmedBlocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import endurteam.overwhelmed.Overwhelmed;
import net.minecraft.world.level.block.Block;

import static endurteam.overwhelmed.world.item.OverwhelmedCreativeTabs.overwhelmedTab;

public class OverwhelmedItems {
    public static RegistrySupplier<DoubleHighBlockItem> widowBlockItem;
    public static RegistrySupplier<BlockItem> soilBlockItem;
    public static RegistrySupplier<BlockItem> snailShellBricksBlockItem;
    public static RegistrySupplier<BlockItem> snailShellBrickWallBlockItem;
    public static RegistrySupplier<BlockItem> snailShellBrickSlabBlockItem;
    public static RegistrySupplier<BlockItem> snailShellBrickStairsBlockItem;
    public static RegistrySupplier<BlockItem> chiseledSnailShellBricksBlockItem;
    public static RegistrySupplier<BlockItem> gooBlockBlockItem;
    public static RegistrySupplier<PebbleBlockItem> pebbleBlockItem;
    public static RegistrySupplier<BlockItem> iceCubeBlockItem;
    public static RegistrySupplier<BlockItem> goldBeadBlockItem;
    public static RegistrySupplier<Item> snailShellItem;
    public static RegistrySupplier<MultiSpawnEggItem> snailSpawnEggItem;
    public static RegistrySupplier<MultiSpawnEggItem> butterflySpawnEggItem;
    public static RegistrySupplier<Item> gooBallItem;
    public static RegistrySupplier<Item> gooSoupItem;

    public static void registerItems() {
        snailShellItem = registerGenericItem("snail_shell", 64, Rarity.COMMON);
        gooBallItem = registerGenericItem("goo_ball", 64, Rarity.COMMON);
        gooSoupItem = Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID, "goo_soup"), () ->
                new BowlFoodItem(new Item.Properties()
                        .stacksTo(1)
                        .rarity(Rarity.COMMON)
                        .food(OverwhelmedFoods.GOO_SOUP)
                        .arch$tab(overwhelmedTab)));

        snailSpawnEggItem = Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID,
                "snail_spawn_egg"), () -> new MultiSpawnEggItem(new Item.Properties()
                        .arch$tab(overwhelmedTab), (random) -> {
                            switch (random.nextIntBetweenInclusive(1, 5)) {
                                case 1 -> {
                                    return OverwhelmedEntityTypes.gardenSnailEntityType.get();
                                }
                                case 2 -> {
                                    return OverwhelmedEntityTypes.limestoneSnailEntityType.get();
                                }
                                case 3 -> {
                                    return OverwhelmedEntityTypes.romanSnailEntityType.get();
                                }
                                case 4 -> {
                                    return OverwhelmedEntityTypes.glassSnailEntityType.get();
                                }
                                case 5 -> {
                                    return OverwhelmedEntityTypes.liverwortSnailEntityType.get();
                                }
                            }
                            throw new IncompatibleClassChangeError();
                        }
                )
        );
        butterflySpawnEggItem = Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID,
                        "butterfly_spawn_egg"), () -> new MultiSpawnEggItem(new Item.Properties()
                        .arch$tab(overwhelmedTab), (random) -> {
                    switch (random.nextIntBetweenInclusive(1, 6)) {
                        case 1 -> {
                            return OverwhelmedEntityTypes.sleepyButterflyEntityType.get();
                        }
                        case 2 -> {
                            return OverwhelmedEntityTypes.cabbageButterflyEntityType.get();
                        }
                        case 3 -> {
                            return OverwhelmedEntityTypes.morphoButterflyEntityType.get();
                        }
                        case 4 -> {
                            return OverwhelmedEntityTypes.cherryButterflyEntityType.get();
                        }
                        case 5 -> {
                            return OverwhelmedEntityTypes.monarchButterflyEntityType.get();
                        }
                        case 6 -> {
                            return OverwhelmedEntityTypes.furButterflyEntityType.get();
                        }
                    }
                    throw new IncompatibleClassChangeError();
                }
                )
        );
        soilBlockItem = registerGenericBlockItem("soil", OverwhelmedBlocks.soil);
        snailShellBricksBlockItem = registerGenericBlockItem("snail_shell_bricks",
                OverwhelmedBlocks.snailShellBricks);
        snailShellBrickStairsBlockItem = registerGenericBlockItem(
                "snail_shell_brick_stairs",
                OverwhelmedBlocks.snailShellBrickStairs);
        snailShellBrickSlabBlockItem = registerGenericBlockItem(
                "snail_shell_brick_slab",
                OverwhelmedBlocks.snailShellBrickSlab);
        snailShellBrickWallBlockItem = registerGenericBlockItem(
                "snail_shell_brick_wall",
                OverwhelmedBlocks.snailShellBrickWall);
        chiseledSnailShellBricksBlockItem = registerGenericBlockItem(
                "chiseled_snail_shell_bricks",
                OverwhelmedBlocks.chiseledSnailShellBricks);
        gooBlockBlockItem = registerGenericBlockItem("goo_block",
                OverwhelmedBlocks.gooBlock);
        widowBlockItem = Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID, "widow"),
                () -> new DoubleHighBlockItem(OverwhelmedBlocks.widow.get(),
                new Item.Properties().arch$tab(OverwhelmedCreativeTabs.overwhelmedTab)));
        pebbleBlockItem = Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID, "pebble"),
                () -> new PebbleBlockItem(OverwhelmedBlocks.pebble.get(),
                new Item.Properties().arch$tab(OverwhelmedCreativeTabs.overwhelmedTab)));
        iceCubeBlockItem  = registerGenericBlockItem("ice_cube",
                OverwhelmedBlocks.iceCube);
        goldBeadBlockItem = registerGenericBlockItem("gold_bead",
                OverwhelmedBlocks.goldBead);

        Overwhelmed.ITEMS.register();
    }
    private static RegistrySupplier<Item> registerGenericItem(String name, int stackSize, Rarity rarity) {
        return Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), () ->
                new Item(new Item.Properties()
                        .stacksTo(stackSize)
                        .rarity(rarity)
                        .arch$tab(overwhelmedTab)));
    }

    private static RegistrySupplier<BlockItem> registerGenericBlockItem(String name,
                                                                        RegistrySupplier<? extends Block>
                                                                                blockSupplier) {
        return Overwhelmed.ITEMS.register(new ResourceLocation(Overwhelmed.MOD_ID, name), () ->
                new BlockItem(blockSupplier.get(), new Item.Properties()
                        .arch$tab(OverwhelmedCreativeTabs.overwhelmedTab)));
    }
}
