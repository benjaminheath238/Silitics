package com.bjmh.silitics.item;

import java.util.ArrayList;
import java.util.List;

import com.bjmh.silitics.factory.ItemFactory;

import net.minecraft.item.Item;

public enum ModItems {
    ;

    public static final List<Item> ITEMS = new ArrayList<>();

    public void generate(ItemFactory factory) {}

    static {
        ItemFactory factory = new ItemFactory();

        for (ModItems items : ModItems.values()) {
            items.generate(factory);
        }
    }
}
