package com.terraformersmc.terraform.mixin.biome.builder;

import com.google.common.collect.ImmutableList;
import com.terraformersmc.terraform.impl.biome.builder.TerraformBiomes;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.VanillaLayeredBiomeSource;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.List;

@Mixin(VanillaLayeredBiomeSource.class)
public abstract class AccessorVanillaLayeredBiomeSource {

	@Mutable
	@Final
	@Shadow
	private static List<RegistryKey<Biome>> BIOMES;

	@SuppressWarnings("UnresolvedMixinReference")
	@Inject(method = "<clinit>", at = @At("TAIL"))
	private static void modifyList(CallbackInfo info) {
		ArrayList<RegistryKey<Biome>> biomes = new ArrayList<>();
		biomes.addAll(BIOMES);
		biomes.addAll(TerraformBiomes.BIOME_KEYS);
		biomes.add(RegistryKey.of(Registry.BIOME_KEY, new Identifier("terraform", "yeet")));
		BIOMES = ImmutableList.copyOf(biomes);
		System.out.println(BIOMES);
	}
}
