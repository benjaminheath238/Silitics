package com.bjmh.silitics.gui;

import com.bjmh.silitics.item.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SiliticsTabs extends CreativeTabs {
    public static final SiliticsTabs SILITICS_GENERAL_TAB = new SiliticsTabs("silitics_general_tab", ModItems.ITEMS.get(0));

    protected final ItemStack icon;

    public SiliticsTabs(String label, Item icon) {
        super(label);
        this.icon = new ItemStack(icon);
    }

    @Override
    public ItemStack getTabIconItem() {
        return icon;
    }
    
}
