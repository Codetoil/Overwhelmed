package endurteam.overwhelmed.fabric.client;

import endurteam.overwhelmed.client.OverwhelmedClient;
import endurteam.overwhelmed.client.particle.SleepySparkleParticle;
import endurteam.overwhelmed.core.particles.OverwhelmedParticleTypes;
import endurteam.overwhelmed.world.level.block.OverwhelmedBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;

@Environment(EnvType.CLIENT)
public class OverwhelmedFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        OverwhelmedClient.initClient();
        BlockRenderLayerMap.INSTANCE.putBlock(OverwhelmedBlocks.widow.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(OverwhelmedBlocks.gooBlock.get(), RenderType.translucent());
        ParticleFactoryRegistry.getInstance().register((ParticleType<SimpleParticleType>) OverwhelmedParticleTypes
                .sleepySparkle.get(), SleepySparkleParticle.Provider::new);
    }
}
