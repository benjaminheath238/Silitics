package com.bjmh.silitics.block;

import com.bjmh.silitics.Silitics;
import com.bjmh.silitics.gui.SiliticsTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockBase extends Block {

    public BlockBase(Material materialIn, String name, float hardness, float resistance, float light) {
        super(materialIn);
        setUnlocalizedName(Silitics.MODID + "." + name);
        setRegistryName(Silitics.MODID + ":" + name);
        setCreativeTab(SiliticsTabs.SILITICS_GENERAL_TAB);
        setHardness(hardness);
        setResistance(resistance);
        setLightLevel(light);
        ModBlocks.BLOCKS.add(this);
    }

    public BlockBase(Material materialIn, String name) {
        this(materialIn, name, 1.5F, 10F, 0F);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0,
                new ModelResourceLocation(getRegistryName(), "inventory"));
    }
    
}
