package endurteam.overwhelmed.registry;

import dev.architectury.registry.registries.RegistrySupplier;
import endurteam.overwhelmed.Overwhelmed;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.resources.ResourceLocation;

public class ParticleTypeRegistry {
    public static RegistrySupplier<ParticleType<?>> sleepySparkle;

    public static void registerParticleTypes() {
        sleepySparkle = Overwhelmed.PARTICLE_TYPES.register(
                new ResourceLocation(Overwhelmed.MOD_ID, "sleepy_sparkle"), () ->
                new SimpleParticleType(false));

        Overwhelmed.PARTICLE_TYPES.register();
    }
}