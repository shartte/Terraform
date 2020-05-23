package com.terraformersmc.terraform.mixin;

import com.mojang.serialization.Codec;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.function.Function;

@Mixin(TrunkPlacerType.class)
public interface InvokerTrunkPlacerType {
	@Invoker
	static <P extends TrunkPlacer> TrunkPlacerType<P> callRegister(String id, Codec<P> deserializer) {
		return null;
	}
}
