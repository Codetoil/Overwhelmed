package endurteam.overwhelmed.neoforge.particles;

import endurteam.overwhelmed.Overwhelmed;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.registries.RegisterEvent;

import static endurteam.overwhelmed.core.particles.OverwhelmedParticleTypes.LIVERWORT_SPORE;

public class OverwhelmedNeoForgeParticleTypes {

    public static void registerParticleTypes(RegisterEvent.RegisterHelper<ParticleType<?>> helper) {

        helper.register(new ResourceLocation(Overwhelmed.MOD_ID, "liverwort_spore"),
                LIVERWORT_SPORE = new SimpleParticleType(false));

    }
}
