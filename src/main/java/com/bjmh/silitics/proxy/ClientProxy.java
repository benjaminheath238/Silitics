package com.bjmh.silitics.proxy;

import com.bjmh.silitics.block.ModBlocks;
import com.bjmh.silitics.block.SiliticsBlock;
import com.bjmh.silitics.item.ModItems;
import com.bjmh.silitics.item.SiliticsItem;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        for (Block block : ModBlocks.BLOCKS) {
            ((SiliticsBlock) block).initModel();
        }

        for (Item item : ModItems.ITEMS) {
            ((SiliticsItem) item).initModel();
        }
    }
}