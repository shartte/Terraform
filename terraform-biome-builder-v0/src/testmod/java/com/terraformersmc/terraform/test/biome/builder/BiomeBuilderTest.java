package com.terraformersmc.terraform.test.biome.builder;

import com.terraformersmc.terraform.api.biome.builder.OverworldClimate;
import com.terraformersmc.terraform.impl.biome.builder.BiomeRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.DefaultBiomeCreator;

@SuppressWarnings("unused")
public class BiomeBuilderTest implements ModInitializer {
    @Override
    public void onInitialize() {

        BiomeRegistry.addOverworldBiome(new Identifier("yeet"), DefaultBiomeCreator.createBasaltDeltas(), OverworldClimate.COOL);

        System.out.println("Hey grrl hey!");
    }
}
