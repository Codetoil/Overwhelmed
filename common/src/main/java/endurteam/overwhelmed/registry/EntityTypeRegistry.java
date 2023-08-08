package endurteam.overwhelmed.registry;

import dev.architectury.registry.level.entity.EntityAttributeRegistry;
import dev.architectury.registry.registries.RegistrySupplier;
import endurteam.overwhelmed.world.entity.animal.ButterflyEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import endurteam.overwhelmed.Overwhelmed;
import endurteam.overwhelmed.world.entity.animal.SnailEntity;

import static endurteam.overwhelmed.Overwhelmed.MOD_ID;

public class EntityTypeRegistry {
    public static RegistrySupplier<EntityType<SnailEntity>> gardenSnailEntityType;
    public static RegistrySupplier<EntityType<SnailEntity>> garySnailEntityType;
    public static RegistrySupplier<EntityType<SnailEntity>> limestoneSnailEntityType;
    public static RegistrySupplier<EntityType<SnailEntity>> romanSnailEntityType;

    public static RegistrySupplier<EntityType<ButterflyEntity>> cherryButterflyEntityType;
    public static RegistrySupplier<EntityType<ButterflyEntity>> cabbageButterflyEntityType;
    public static RegistrySupplier<EntityType<ButterflyEntity>> morphoButterflyEntityType;
    public static RegistrySupplier<EntityType<ButterflyEntity>> sleepyButterflyEntityType;

    public static final TagKey<Biome> SPAWNS_GARDEN_SNAILS = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "spawns_garden_snails"));
    public static final TagKey<Biome> SPAWNS_LIMESTONE_SNAILS = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "spawns_limestone_snails"));
    public static final TagKey<Biome> SPAWNS_ROMAN_SNAILS = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "spawns_roman_snails"));
    public static final TagKey<Biome> SPAWNS_SLEEPY_BUTTERFLIES = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "spawns_sleepy_butterflies"));
    public static final TagKey<Biome> SPAWNS_CABBAGE_BUTTERFLIES = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "spawns_cabbage_butterflies"));
    public static final TagKey<Biome> SPAWNS_MORPHO_BUTTERFLIES = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "spawns_morpho_butterflies"));
    public static final TagKey<Biome> SPAWNS_CHERRY_BUTTERFLIES = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "spawns_chery_butterflies"));
    public static void registerEntities() {
        gardenSnailEntityType = Overwhelmed.ENTITY_TYPES.register(
                new ResourceLocation(MOD_ID, "garden_snail"), () ->
                EntityType.Builder.of(SnailEntity::new, MobCategory.CREATURE)
                        .sized(0.6f, 0.4f)
                        .clientTrackingRange(8)
                        .build("garden_snail"));
        garySnailEntityType = Overwhelmed.ENTITY_TYPES.register(
                new ResourceLocation(MOD_ID, "gary_snail"), () ->
                EntityType.Builder.of(SnailEntity::new, MobCategory.CREATURE)
                        .sized(0.6f, 0.4f)
                        .clientTrackingRange(8)
                        .build("gary_snail"));
        limestoneSnailEntityType = Overwhelmed.ENTITY_TYPES.register(
                new ResourceLocation(MOD_ID, "limestone_snail"), () ->
                EntityType.Builder.of(SnailEntity::new, MobCategory.CREATURE)
                        .sized(0.6f, 0.4f)
                        .clientTrackingRange(8)
                        .build("limestone_snail"));
        romanSnailEntityType = Overwhelmed.ENTITY_TYPES.register(
                new ResourceLocation(MOD_ID, "roman_snail"), () ->
                EntityType.Builder.of(SnailEntity::new, MobCategory.CREATURE)
                        .sized(0.6f, 0.4f)
                        .clientTrackingRange(8)
                        .build("roman_snail"));
        sleepyButterflyEntityType = Overwhelmed.ENTITY_TYPES.register(
                new ResourceLocation(MOD_ID, "sleepy_butterfly"), () ->
                        EntityType.Builder.of(ButterflyEntity::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("sleepy_butterfly"));
        cabbageButterflyEntityType = Overwhelmed.ENTITY_TYPES.register(
                new ResourceLocation(MOD_ID, "cabbage_butterfly"), () ->
                EntityType.Builder.of(ButterflyEntity::new, MobCategory.CREATURE)
                        .sized(0.6f, 0.4f)
                        .clientTrackingRange(8)
                        .build("cabbage_butterfly"));
        morphoButterflyEntityType = Overwhelmed.ENTITY_TYPES.register(
                new ResourceLocation(MOD_ID, "morpho_butterfly"), () ->
                EntityType.Builder.of(ButterflyEntity::new, MobCategory.CREATURE)
                        .sized(0.6f, 0.4f)
                        .clientTrackingRange(8)
                        .build("morpho_butterfly"));
        cherryButterflyEntityType = Overwhelmed.ENTITY_TYPES.register(
                new ResourceLocation(MOD_ID, "cherry_butterfly"), () ->
                        EntityType.Builder.of(ButterflyEntity::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("cherry_butterfly"));

        Overwhelmed.ENTITY_TYPES.register();

        EntityAttributeRegistry.register(gardenSnailEntityType, SnailEntity::createAttributes);
        EntityAttributeRegistry.register(garySnailEntityType, SnailEntity::createAttributes);
        EntityAttributeRegistry.register(limestoneSnailEntityType, SnailEntity::createAttributes);
        EntityAttributeRegistry.register(romanSnailEntityType, SnailEntity::createAttributes);
        EntityAttributeRegistry.register(sleepyButterflyEntityType, ButterflyEntity::createAttributes);
        EntityAttributeRegistry.register(cabbageButterflyEntityType, ButterflyEntity::createAttributes);
        EntityAttributeRegistry.register(morphoButterflyEntityType, ButterflyEntity::createAttributes);
        EntityAttributeRegistry.register(cherryButterflyEntityType, ButterflyEntity::createAttributes);

    }
}