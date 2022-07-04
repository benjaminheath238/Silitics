package com.bjmh.silitics.factory;

import java.util.ArrayList;
import java.util.List;

import com.bjmh.silitics.item.SiliticsItem;

import net.minecraft.item.Item;

public class ItemFactory {
    private String baseName;
    private List<Item> items;

    public ItemFactory() {
    }

    public ItemFactory newItemGroup(String baseName) {
        this.baseName = baseName;
        this.items = new ArrayList<>();
        return this;
    }

    public ItemFactory next(String name) {
        items.add(new SiliticsItem(baseName + "_" + name));
        return this;
    }

    public ItemFactory next() {
        items.add(new SiliticsItem(baseName));
        return this;
    }

    public Item[] build() {
        return items.toArray(new Item[0]);
    }
}
