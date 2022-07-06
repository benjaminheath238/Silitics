package com.bjmh.silitics.item;

import com.bjmh.silitics.Silitics;
import com.bjmh.silitics.gui.SiliticsTabs;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SiliticsItem extends Item {
    public SiliticsItem(String name) {
        setUnlocalizedName(Silitics.MODID + "." + name);
        setRegistryName(Silitics.MODID + ":" + name);
        setCreativeTab(SiliticsTabs.SILITICS_GENERAL_TAB);
        ModItems.ITEMS.add(this);
    }
    
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
