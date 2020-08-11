package com.terraformersmc.terraform.impl.biome.builder;

import com.terraformersmc.terraform.api.biome.builder.OverworldClimate;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeCreator;
import net.minecraft.world.biome.layer.SetBaseBiomesLayer;
import net.minecraft.world.biome.source.VanillaLayeredBiomeSource;

import java.util.ArrayList;
import java.util.List;

public class BiomeRegistry {
    private static List<Biome> BIOMES = new ArrayList<>();

    private static List<Integer> DRY = new ArrayList<>();
    private static List<Integer> TEMPERATE = new ArrayList<>();
    private static List<Integer> COOL = new ArrayList<>();
    private static List<Integer> SNOWY = new ArrayList<>();

    private static List<Integer> getClimateList(OverworldClimate type) {
        switch (type) {
            case DRY: return DRY;
            case TEMPERATE: return TEMPERATE;
            case COOL: return COOL;
            case SNOWY: return SNOWY;
        }
        return null;
    }

    public static Biome addOverworldBiome(Identifier id, Biome b, OverworldClimate type) {
        BIOMES.add(b);
        Registry.register(BuiltinRegistries.BIOME, id, b);
        getClimateList(type).add(BuiltinRegistries.BIOME.getRawId(b));
        return b;
    }
}
