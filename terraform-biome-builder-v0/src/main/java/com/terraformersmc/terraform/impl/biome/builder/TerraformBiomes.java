package com.terraformersmc.terraform.impl.biome.builder;

import com.terraformersmc.terraform.mixin.biome.builder.AccessorBiomes;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

import java.util.ArrayList;

public class TerraformBiomes {

    public static ArrayList<RegistryKey<Biome>> BIOME_KEYS = new ArrayList<>();

    public static Biome addOverworldBiome(Identifier id, Biome biome) {
        BIOME_KEYS.add(RegistryKey.of(Registry.BIOME_KEY, id));
        return AccessorBiomes.terraform$register(256, RegistryKey.of(Registry.BIOME_KEY, id), biome);
    }
}
