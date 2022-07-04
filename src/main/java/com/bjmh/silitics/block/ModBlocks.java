package com.bjmh.silitics.block;

import java.util.ArrayList;
import java.util.List;

import com.bjmh.silitics.factory.BlockFactory;

import net.minecraft.block.Block;

public enum ModBlocks {
    ;

    public static final List<Block> BLOCKS = new ArrayList<>();

    public void generate(BlockFactory factory) {}

    static {
        BlockFactory factory = new BlockFactory();

        for (ModBlocks blocks : ModBlocks.values()) {
            blocks.generate(factory);
        }
    }
}
