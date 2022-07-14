package com.bjmh.silitics.block;

import javax.annotation.Nullable;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public abstract class BlockTileEntity<T extends TileEntity> extends BlockBase {
    public BlockTileEntity(Material materialIn, String name, float hardness, float resistance, float light) {
        super(materialIn, name, hardness, resistance, light);
    }

    public BlockTileEntity(Material materialIn, String name) {
        this(materialIn, name, 1.5F, 10F, 0F);
    }

    public abstract Class<T> getTileEntityClass();

    @SuppressWarnings("unchecked")
    public T getTileEntity(IBlockAccess world, BlockPos pos) {
        return (T)world.getTileEntity(pos);
    }

    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }

    @Override
    @Nullable
    public abstract T createTileEntity(World world, IBlockState state);
}
