package com.bjmh.silitics.block;

import java.util.ArrayList;
import java.util.List;

import com.bjmh.silitics.factory.BlockFactory;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public enum ModBlocks {
    STRIPES() {
        @Override
        public void generate(BlockFactory factory) {
            factory.newBlockGroup("stripes", 2.5F, 10F, 0F, Material.IRON, false)
            .next("black_green")
            .next("black_orange")
            .next("black_white")
            .next("black_yellow")
            .next("green_white")
            .next("red_white")
            .next("white_blue")
            .next("black_green_plate")
            .next("black_orange_plate")
            .next("black_white_plate")
            .next("black_yellow_plate")
            .next("green_white_plate")
            .next("red_white_plate")
            .next("white_blue_plate")
            .build();
        }
    },
    
    INDUSTRIAL_CLEAN() {
        @Override
        public void generate(BlockFactory factory) {
            factory.newBlockGroup("industrial_clean", 4F, 15F, 0F, Material.IRON, false)
            .next()
            .next("plate_large")
            .next("panel_large")
            .next("bracing_p4")
            .next("bracing_p8")
            .next("ring_p8")
            .build();
        }
    },
    
    INDUSTRIAL_SHINY() {
        @Override
        public void generate(BlockFactory factory) {
            factory.newBlockGroup("industrial_shiny", 4F, 18F, 0F, Material.IRON, false)
            .next()
            .next("plate_large")
            .next("panel_large")
            .next("bracing_p4")
            .next("bracing_p8")
            .next("ring_p8")
            .build();
        }
    },
    
    INDUSTRIAL_NORMAL() {
        @Override
        public void generate(BlockFactory factory) {
            factory.newBlockGroup("industrial_normal", 4F, 15F, 0F, Material.IRON, false)
            .next()
            .next("plate_large")
            .next("panel_large")
            .next("bracing_p4")
            .next("bracing_p8")
            .next("ring_p8")
            .build();
        }
    },
    
    INDUSTRIAL_CORRODED() {
        @Override
        public void generate(BlockFactory factory) {
            factory.newBlockGroup("industrial_corroded", 15F, 8F, 0F, Material.IRON, false)
            .next()
            .next("plate_large")
            .next("panel_large")
            .next("bracing_p4")
            .next("bracing_p8")
            .next("ring_p8")
            .build();
        }
    };

    public static final List<Block> BLOCKS = new ArrayList<>();

    public void generate(BlockFactory factory) {}

    static {
        BlockFactory factory = new BlockFactory();

        for (ModBlocks blocks : ModBlocks.values()) {
            blocks.generate(factory);
        }
    }
}
