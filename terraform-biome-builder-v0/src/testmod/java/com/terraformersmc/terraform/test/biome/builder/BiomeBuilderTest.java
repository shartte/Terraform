package com.terraformersmc.terraform.test.biome.builder;

import com.terraformersmc.terraform.impl.biome.builder.TerraformBiomes;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.DefaultBiomeCreator;

@SuppressWarnings("unused")
public class BiomeBuilderTest implements ModInitializer {

    @Override
    public void onInitialize() {

        TerraformBiomes.addOverworldBiome(new Identifier("terraform", "yeet"), DefaultBiomeCreator.createPlains(false));

        System.out.println("Hey grrl hey!");
    }
}
