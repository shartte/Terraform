package com.terraformersmc.terraform.impl.biome.builder;

import com.terraformersmc.terraform.mixin.biome.builder.AccessorBiomes;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public class TerraformBiomes {

    public static Biome addOverworldBiome(Identifier id, Biome biome) {
        return AccessorBiomes.terraform$register(256, RegistryKey.of(Registry.BIOME_KEY, id), biome);
    }
}
