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

    LABORATORY_CLEAN() {
        @Override
        public void generate(BlockFactory factory) {
            factory.newBlockGroup("laboratory_clean", 3F, 10F, 0F, Material.IRON, false)
            .next()
            .next(PLATE_LARGE)
            .next(PANEL_LARGE)
            .next(BRACING_P4)
            .next(BRACING_P8)
            .next(RING_P8)
            .build();
        }
    },

    LABORATORY_GREEN() {
        @Override
        public void generate(BlockFactory factory) {
            factory.newBlockGroup("laboratory_green", 3F, 10F, 0F, Material.IRON, false)
            .next()
            .next(PLATE_LARGE)
            .next(PANEL_LARGE)
            .next(BRACING_P4)
            .next(BRACING_P8)
            .next(RING_P8)
            .build();
        }
    },

    LABORATORY_SHINY() {
        @Override
        public void generate(BlockFactory factory) {
            factory.newBlockGroup("laboratory_shiny", 3F, 10F, 0F, Material.IRON, false)
            .next()
            .next(PLATE_LARGE)
            .next(PANEL_LARGE)
            .next(BRACING_P4)
            .next(BRACING_P8)
            .next(RING_P8)
            .build();
        }
    },
    
    INDUSTRIAL_CLEAN() {
        @Override
        public void generate(BlockFactory factory) {
            factory.newBlockGroup("industrial_clean", 4F, 15F, 0F, Material.IRON, false)
            .next()
            .next(PLATE_LARGE)
            .next(PANEL_LARGE)
            .next(BRACING_P4)
            .next(BRACING_P8)
            .next(RING_P8)
            .build();
        }
    },
    
    INDUSTRIAL_SHINY() {
        @Override
        public void generate(BlockFactory factory) {
            factory.newBlockGroup("industrial_shiny", 4F, 18F, 0F, Material.IRON, false)
            .next()
            .next(PLATE_LARGE)
            .next(PANEL_LARGE)
            .next(BRACING_P4)
            .next(BRACING_P8)
            .next(RING_P8)
            .build();
        }
    },
    
    INDUSTRIAL_NORMAL() {
        @Override
        public void generate(BlockFactory factory) {
            factory.newBlockGroup("industrial_normal", 4F, 15F, 0F, Material.IRON, false)
            .next()
            .next(PLATE_LARGE)
            .next(PANEL_LARGE)
            .next(BRACING_P4)
            .next(BRACING_P8)
            .next(RING_P8)
            .build();
        }
    },
    
    INDUSTRIAL_CORRODED() {
        @Override
        public void generate(BlockFactory factory) {
            factory.newBlockGroup("industrial_corroded", 15F, 8F, 0F, Material.IRON, false)
            .next()
            .next(PLATE_LARGE)
            .next(PANEL_LARGE)
            .next(BRACING_P4)
            .next(BRACING_P8)
            .next(RING_P8)
            .build();
        }
    },

    CONCRETE() {
        @Override
        public void generate(BlockFactory factory) {
            factory.newBlockGroup("concrete", 10F, 50F, 0F, Material.ROCK, false)
            .next("blue")
            .next("cyan")
            .next("dark")
            .next("green")
            .next("light")
            .next("lime")
            .next("magenta")
            .next("orange")
            .next("red")
            .next("white")
            .next("yellow")
            .build();
        }
    },
    
    FACTORY_NORMAL() {
        @Override
        public void generate(BlockFactory factory) {
            factory.newBlockGroup("factory_normal", 5F, 17F, 0F, Material.IRON, false)
            .next()
            .next(PLATE_LARGE)
            .next(PANEL_LARGE)
            .next(BRACING_P4)
            .next(BRACING_P8)
            .next(RING_P8)
            .build();
        }
    },
    
    FACTORY_SHINY() {
        @Override
        public void generate(BlockFactory factory) {
            factory.newBlockGroup("factory_shiny", 6F, 20F, 0F, Material.IRON, false)
            .next()
            .next(PLATE_LARGE)
            .next(PANEL_LARGE)
            .next(BRACING_P4)
            .next(BRACING_P8)
            .next(RING_P8)
            .build();
        }
    },
    
    FACTORY_DARK() {
        @Override
        public void generate(BlockFactory factory) {
            factory.newBlockGroup("factory_dark", 5F, 17F, 0F, Material.IRON, false)
            .next()
            .next(PLATE_LARGE)
            .next(PANEL_LARGE)
            .next(BRACING_P4)
            .next(BRACING_P8)
            .next(RING_P8)
            .build();
        }
    },
    
    FACTORY_CORRODED() {
        @Override
        public void generate(BlockFactory factory) {
            factory.newBlockGroup("factory_corroded", 20F, 10F, 0F, Material.IRON, false)
            .next()
            .next(PLATE_LARGE)
            .next(PANEL_LARGE)
            .next(BRACING_P4)
            .next(BRACING_P8)
            .next(RING_P8)
            .build();
        }
    };

    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final String PLATE_LARGE = "plate_large";    
    public static final String PANEL_LARGE = "panel_large";    
    public static final String BRACING_P4 = "bracing_p4";
    public static final String BRACING_P8 = "bracing_p8";
    public static final String RING_P8 = "ring_p8";    

    public void generate(BlockFactory factory) {}

    static {
        BlockFactory factory = new BlockFactory();

        for (ModBlocks blocks : ModBlocks.values()) {
            blocks.generate(factory);
        }
    }
}
