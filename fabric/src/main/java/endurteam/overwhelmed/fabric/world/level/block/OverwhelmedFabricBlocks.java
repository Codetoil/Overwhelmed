package endurteam.overwhelmed.fabric.world.level.block;

import endurteam.overwhelmed.Overwhelmed;
import endurteam.overwhelmed.world.level.block.ClotBlock;
import endurteam.overwhelmed.world.level.block.GooBlock;
import endurteam.overwhelmed.world.level.block.OverwhelmedBlocks;
import endurteam.overwhelmed.world.level.block.PebbleBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

public class OverwhelmedFabricBlocks {

    public static void registerBlocks() {
        //Must register Blocks first
        OverwhelmedBlocks.SOIL = registerGenericBlock("soil", BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .strength(0.5f, 0.5f)
                .sound(SoundType.ROOTED_DIRT));
        OverwhelmedBlocks.SNAIL_SHELL_BRICKS = registerGenericBlock("snail_shell_bricks",
                BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .strength(3.0f, 12.0f)
                .requiresCorrectToolForDrops());
        OverwhelmedBlocks.SNAIL_SHELL_BRICK_STAIRS = registerGenericStairBlock
                (OverwhelmedBlocks.SNAIL_SHELL_BRICKS.defaultBlockState(),
                "snail_shell_brick_stairs", BlockBehaviour.Properties.copy(OverwhelmedBlocks.SNAIL_SHELL_BRICKS));
        OverwhelmedBlocks.SNAIL_SHELL_BRICK_SLAB = registerGenericSlabBlock("snail_shell_brick_slab",
                BlockBehaviour.Properties.copy(OverwhelmedBlocks.SNAIL_SHELL_BRICKS));
        OverwhelmedBlocks.SNAIL_SHELL_BRICK_WALL = registerGenericWallBlock("snail_shell_brick_wall",
                BlockBehaviour.Properties.copy(OverwhelmedBlocks.SNAIL_SHELL_BRICKS));
        OverwhelmedBlocks.CHISELED_SNAIL_SHELL_BRICKS = registerGenericBlock("chiseled_snail_shell_bricks",
                BlockBehaviour.Properties.of()
                        .mapColor(MapColor.COLOR_BROWN)
                        .strength(3.0f, 12.0f)
                        .requiresCorrectToolForDrops());
        OverwhelmedBlocks.GOLD_BEAD = registerGenericClotBlock("gold_bead", BlockBehaviour.Properties.of()
                .mapColor(MapColor.GOLD)
                .strength(0f, 6f)
                .noCollission()
                .sound(SoundType.STONE)
                .noOcclusion());
        OverwhelmedBlocks.ICE_CUBE = registerGenericClotBlock("ice_cube", BlockBehaviour.Properties.of()
                .mapColor(MapColor.ICE)
                .strength(0f, 6f)
                .noCollission()
                .sound(SoundType.STONE)
                .noOcclusion());
        OverwhelmedBlocks.PEBBLE = Registry.register(BuiltInRegistries.BLOCK,
                new ResourceLocation(Overwhelmed.MOD_ID, "pebble"),
                new PebbleBlock(BlockBehaviour.Properties.of()
                        .mapColor(MapColor.STONE)
                        .strength(0f, 6f)
                        .noCollission()
                        .sound(SoundType.STONE)
                        .noOcclusion()));
        OverwhelmedBlocks.FLOFF = registerGenericFlowerBlock(MobEffects.REGENERATION, 4, "floff",
                BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .pushReaction(PushReaction.DESTROY));
        OverwhelmedBlocks.PAINE = registerGenericFlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 8, "paine",
                BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .pushReaction(PushReaction.DESTROY));
        OverwhelmedBlocks.PINK_SALLOW = registerGenericFlowerBlock(MobEffects.POISON, 6, "pink_sallow",
                BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .pushReaction(PushReaction.DESTROY));
        OverwhelmedBlocks.WHITE_SALLOW = registerGenericFlowerBlock(MobEffects.WEAKNESS, 5, "white_sallow",
                BlockBehaviour.Properties.of()
                        .mapColor(MapColor.PLANT)
                        .noCollission()
                        .instabreak()
                        .sound(SoundType.GRASS)
                        .offsetType(BlockBehaviour.OffsetType.XZ)
                        .pushReaction(PushReaction.DESTROY));
        OverwhelmedBlocks.SQUIRL = registerGenericFlowerBlock(MobEffects.JUMP, 10, "squirl",
                BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .pushReaction(PushReaction.DESTROY));
        OverwhelmedBlocks.RINGOT = registerGenericFlowerBlock(MobEffects.BLINDNESS, 5, "ringot",
                BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .pushReaction(PushReaction.DESTROY));
        OverwhelmedBlocks.SNOWDROP = registerGenericFlowerBlock(MobEffects.WEAKNESS, 7, "snowdrop",
                BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .pushReaction(PushReaction.DESTROY));
        OverwhelmedBlocks.DUMBBELL = registerGenericFlowerBlock(MobEffects.FIRE_RESISTANCE, 10, "dumbbell",
                BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .pushReaction(PushReaction.DESTROY));
        OverwhelmedBlocks.WIDOW = registerGenericTallFlowerBlock("widow", BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .ignitedByLava()
                .pushReaction(PushReaction.DESTROY));
        OverwhelmedBlocks.GOO_BLOCK = Registry.register(BuiltInRegistries.BLOCK,
                new ResourceLocation(Overwhelmed.MOD_ID, "goo_block"),
                new GooBlock(BlockBehaviour.Properties.of()
                        .mapColor(MapColor.COLOR_YELLOW)
                        .friction(0.6f)
                        .friction(0.8f)
                        .sound(SoundType.HONEY_BLOCK)
                        .noOcclusion()
                        .jumpFactor(0.5f)
                        .speedFactor(0.4f)));
    }
    private static Block registerGenericBlock(String name,
                                              Block.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new Block(properties));
    }

    @SuppressWarnings("SameParameterValue")
    private static WallBlock registerGenericWallBlock(String name,
                                                      Block.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new WallBlock(properties));
    }

    @SuppressWarnings("SameParameterValue")
    private static StairBlock registerGenericStairBlock(BlockState blockState,
                                                        String name,
                                                        Block.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new StairBlock(blockState, properties));
    }

    @SuppressWarnings("SameParameterValue")
    private static SlabBlock registerGenericSlabBlock(String name,
                                                      Block.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new SlabBlock(properties));
    }

    @SuppressWarnings("SameParameterValue")
    private static FlowerBlock registerGenericFlowerBlock(MobEffect mobEffect,
                                                          int i,
                                                          String name,
                                                          BlockBehaviour.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new FlowerBlock(mobEffect, i, properties));
    }

    @SuppressWarnings("SameParameterValue")
    private static FlowerPotBlock registerGenericFlowerPotBlock(Block block,
                                                          String name,
                                                          BlockBehaviour.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new FlowerPotBlock(block, properties));
    }

    @SuppressWarnings("SameParameterValue")
    private static TallFlowerBlock registerGenericTallFlowerBlock(String name,
                                                                  Block.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new TallFlowerBlock(properties));
    }
    private static ClotBlock registerGenericClotBlock(String name,
                                                      Block.Properties properties) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Overwhelmed.MOD_ID, name),
                new ClotBlock(properties));
    }
}
