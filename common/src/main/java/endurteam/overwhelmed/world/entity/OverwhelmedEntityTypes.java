/**
 *  Overwhelmed, a Minecraft overhauling and adding new features to the Overworld's surface!<br>
 *  Copyright (C) 2023  Endurteam<br>
 *  <br>
 *  This program is free software: you can redistribute it and/or modify<br>
 *  it under the terms of the GNU General Public License as published by<br>
 *  the Free Software Foundation, either version 3 of the License, or<br>
 *  any later version.<br>
 *  <br>
 *  This program is distributed in the hope that it will be useful,<br>
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of<br>
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the<br>
 *  GNU General Public License for more details.<br>
 *  <br>
 *  You should have received a copy of the GNU General Public License with<br>
 *  the Minecraft Linking Exception<br>
 *  along with this program.  If not, see <https://www.gnu.org/licenses/> and<br>
 *  <https://gist.github.com/triphora/588f353802a3b0ea649e4fc85f75e583/>
 */

package endurteam.overwhelmed.world.entity;

import dev.architectury.registry.level.entity.EntityAttributeRegistry;
import dev.architectury.registry.registries.RegistrySupplier;
import endurteam.overwhelmed.world.entity.animal.ButterflyEntity;
import endurteam.overwhelmed.world.entity.projectile.PaperBulletEntity;
import endurteam.overwhelmed.world.entity.projectile.ThrownPebbleEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import endurteam.overwhelmed.Overwhelmed;
import endurteam.overwhelmed.world.entity.animal.SnailEntity;

import static endurteam.overwhelmed.Overwhelmed.MOD_ID;

public class OverwhelmedEntityTypes {
    public static RegistrySupplier<EntityType<SnailEntity>> gardenSnailEntityType;
    public static RegistrySupplier<EntityType<SnailEntity>> garySnailEntityType;
    public static RegistrySupplier<EntityType<SnailEntity>> limestoneSnailEntityType;
    public static RegistrySupplier<EntityType<SnailEntity>> romanSnailEntityType;
    public static RegistrySupplier<EntityType<SnailEntity>> glassSnailEntityType;
    public static RegistrySupplier<EntityType<SnailEntity>> liverwortSnailEntityType;

    public static RegistrySupplier<EntityType<ButterflyEntity>> cherryButterflyEntityType;
    public static RegistrySupplier<EntityType<ButterflyEntity>> cabbageButterflyEntityType;
    public static RegistrySupplier<EntityType<ButterflyEntity>> morphoButterflyEntityType;
    public static RegistrySupplier<EntityType<ButterflyEntity>> sleepyButterflyEntityType;
    public static RegistrySupplier<EntityType<ButterflyEntity>> monarchButterflyEntityType;
    public static RegistrySupplier<EntityType<ButterflyEntity>> furButterflyEntityType;

    public static RegistrySupplier<EntityType<ThrownPebbleEntity>> thrownPebbleEntityType;
    public static RegistrySupplier<EntityType<PaperBulletEntity>> paperBulletEntityType;

    public static final TagKey<Biome> SPAWNS_GARDEN_SNAILS = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "spawns_garden_snails"));
    public static final TagKey<Biome> SPAWNS_LIMESTONE_SNAILS = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "spawns_limestone_snails"));
    public static final TagKey<Biome> SPAWNS_ROMAN_SNAILS = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "spawns_roman_snails"));
    public static final TagKey<Biome> SPAWNS_GLASS_SNAILS = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "spawns_glass_snails"));
    public static final TagKey<Biome> SPAWNS_LIVERWORT_SNAILS = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "spawns_liverwort_snails"));
    public static final TagKey<Biome> SPAWNS_SLEEPY_BUTTERFLIES = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "spawns_sleepy_butterflies"));
    public static final TagKey<Biome> SPAWNS_CABBAGE_BUTTERFLIES = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "spawns_cabbage_butterflies"));
    public static final TagKey<Biome> SPAWNS_MORPHO_BUTTERFLIES = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "spawns_morpho_butterflies"));
    public static final TagKey<Biome> SPAWNS_CHERRY_BUTTERFLIES = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "spawns_cherry_butterflies"));
    public static final TagKey<Biome> SPAWNS_MONARCH_BUTTERFLIES = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "spawns_monarch_butterflies"));
    public static final TagKey<Biome> SPAWNS_FUR_BUTTERFLIES = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "spawns_fur_butterflies"));

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
        glassSnailEntityType = Overwhelmed.ENTITY_TYPES.register(
                new ResourceLocation(MOD_ID, "glass_snail"), () ->
                        EntityType.Builder.of(SnailEntity::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("glass_snail"));
        liverwortSnailEntityType = Overwhelmed.ENTITY_TYPES.register(
                new ResourceLocation(MOD_ID, "liverwort_snail"), () ->
                        EntityType.Builder.of(SnailEntity::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("liverwort_snail"));
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
        monarchButterflyEntityType = Overwhelmed.ENTITY_TYPES.register(
                new ResourceLocation(MOD_ID, "monarch_butterfly"), () ->
                        EntityType.Builder.of(ButterflyEntity::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("monarch_butterfly"));
        furButterflyEntityType = Overwhelmed.ENTITY_TYPES.register(
                new ResourceLocation(MOD_ID, "fur_butterfly"), () ->
                        EntityType.Builder.of(ButterflyEntity::new, MobCategory.CREATURE)
                                .sized(0.6f, 0.4f)
                                .clientTrackingRange(8)
                                .build("fur_butterfly"));
        thrownPebbleEntityType = Overwhelmed.ENTITY_TYPES.register(
                new ResourceLocation(MOD_ID, "thrown_pebble"), () ->
                        EntityType.Builder.<ThrownPebbleEntity>of(ThrownPebbleEntity::new, MobCategory.MISC)
                                .sized(0.2f, 0.2f)
                                .clientTrackingRange(4)
                                .build("thrown_pebble")
        );
        paperBulletEntityType = Overwhelmed.ENTITY_TYPES.register(
                new ResourceLocation(MOD_ID, "paper_bullet"), () ->
                        EntityType.Builder.<PaperBulletEntity>of(PaperBulletEntity::new, MobCategory.MISC)
                                .sized(0.2f, 0.2f)
                                .clientTrackingRange(4)
                                .build("paper_bullet")
        );
        Overwhelmed.ENTITY_TYPES.register();

        EntityAttributeRegistry.register(gardenSnailEntityType, SnailEntity::createAttributes);
        EntityAttributeRegistry.register(garySnailEntityType, SnailEntity::createAttributes);
        EntityAttributeRegistry.register(limestoneSnailEntityType, SnailEntity::createAttributes);
        EntityAttributeRegistry.register(romanSnailEntityType, SnailEntity::createAttributes);
        EntityAttributeRegistry.register(glassSnailEntityType, SnailEntity::createAttributes);
        EntityAttributeRegistry.register(liverwortSnailEntityType, SnailEntity::createAttributes);
        EntityAttributeRegistry.register(sleepyButterflyEntityType, ButterflyEntity::createAttributes);
        EntityAttributeRegistry.register(cabbageButterflyEntityType, ButterflyEntity::createAttributes);
        EntityAttributeRegistry.register(morphoButterflyEntityType, ButterflyEntity::createAttributes);
        EntityAttributeRegistry.register(cherryButterflyEntityType, ButterflyEntity::createAttributes);
        EntityAttributeRegistry.register(monarchButterflyEntityType, ButterflyEntity::createAttributes);
        EntityAttributeRegistry.register(furButterflyEntityType, ButterflyEntity::createAttributes);
    }
}