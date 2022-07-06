package com.bjmh.silitics.item;

import java.util.ArrayList;
import java.util.List;

import com.bjmh.silitics.factory.ItemFactory;

import net.minecraft.item.Item;

public enum ModItems {
    PLATES() {
        @Override
        public void generate(ItemFactory factory) {
            factory.newItemGroup("plate")
            .next("industrial_clean")
            .next("industrial_corroded")
            .next("industrial_normal")
            .next("industrial_shiny")
            .next("factory_normal")
            .next("factory_corroded")
            .next("factory_dark")
            .next("factory_shiny")
            .next("laboratory_clean")
            .next("laboratory_green")
            .next("laboratory_shiny")
            .next("stripes_black_green")
            .next("stripes_black_orange")
            .next("stripes_black_white")
            .next("stripes_black_yellow")
            .next("stripes_green_white")
            .next("stripes_red_white")
            .next("stripes_white_blue")
            .build();
        }
    };

    public static final List<Item> ITEMS = new ArrayList<>();

    public void generate(ItemFactory factory) {}

    static {
        ItemFactory factory = new ItemFactory();

        for (ModItems items : ModItems.values()) {
            items.generate(factory);
        }
    }
}
