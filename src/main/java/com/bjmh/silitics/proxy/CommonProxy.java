package com.bjmh.silitics.proxy;

import com.bjmh.silitics.block.BlockTileEntity;
import com.bjmh.silitics.block.ModBlocks;
import com.bjmh.silitics.item.ModItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
        // Place Holder
    }

    public void init(FMLInitializationEvent e) {
        // Place Holder
    }

    public void postInit(FMLPostInitializationEvent e) {
        // Place Holder
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        for (Block block : ModBlocks.BLOCKS) {
            event.getRegistry().register(block);

            if (block instanceof BlockTileEntity) {
                GameRegistry.registerTileEntity(((BlockTileEntity<?>) block).getTileEntityClass(), block.getRegistryName());
            }
        }
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        for (Item item : ModItems.ITEMS) {
            event.getRegistry().register(item);
        }

        for (Block block : ModBlocks.BLOCKS) {
            event.getRegistry().register(
                    new ItemBlock(block).setRegistryName(block.getRegistryName()));
        }
    }
}