package com.terraformersmc.terraform.mixin.biome.builder;

import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(Biomes.class)
public interface AccessorBiomes {

	@Invoker("register")
	static Biome terraform$register(int rawId, RegistryKey<Biome> registryKey, Biome biome) {
		throw new RuntimeException("Failed to create invoker: Biomes#register!");
	}
}
