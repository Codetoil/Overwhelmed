package endurteam.overwhelmed.world.level.levelgen.placement;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import static endurteam.overwhelmed.Overwhelmed.MOD_ID;

public class OverwhelmedPlacedFeatures {
    
    public static final TagKey<Biome> GENERATES_SOIL = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "generates_soil"));
    
    public static final TagKey<Biome> GENERATES_WIDOWS = TagKey.create(Registries.BIOME,
            new ResourceLocation(MOD_ID, "generates_widows"));

    public static final ResourceKey<PlacedFeature> ORE_SOIL = ResourceKey.create(Registries.PLACED_FEATURE,
            new ResourceLocation(MOD_ID, "ore_soil"));

    public static final ResourceKey<PlacedFeature> GENERATE_WIDOW = ResourceKey.create(Registries.PLACED_FEATURE,
            new ResourceLocation(MOD_ID, "generate_widow"));
}