package endurteam.overwhelmed.forge.client;

import endurteam.overwhelmed.client.OverwhelmedClient;
import endurteam.overwhelmed.client.particle.SleepySparkleParticle;
import endurteam.overwhelmed.registry.ParticleTypeRegistry;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@OnlyIn(Dist.CLIENT)
public class OverwhelmedForgeClient {
    public static void initClient(IEventBus modEventBus) {
        OverwhelmedClient.initClient();
        modEventBus.register(OverwhelmedForgeClient.class);
    }

    @SubscribeEvent
    public static void registerParticleEvent(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet((ParticleType<SimpleParticleType>) ParticleTypeRegistry.sleepySparkle.get(),
                SleepySparkleParticle.Provider::new);
    }
}