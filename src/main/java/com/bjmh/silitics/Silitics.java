package com.bjmh.silitics;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bjmh.silitics.proxy.CommonProxy;
import com.bjmh.silitics.world.WorldGen;

@Mod(modid = Silitics.MODID, name = Silitics.NAME, version = Silitics.VERSION)
public class Silitics {
    public static final String MODID = "silitics";
    public static final String NAME = "Silitics";
    public static final String VERSION = "1.0.0";

    public static final Logger LOGGER = LogManager.getLogger(NAME);
    public static final Random RANDOM = new Random();

    @SidedProxy(clientSide = "com.bjmh.silitics.proxy.ClientProxy", serverSide = "com.bjmh.silitics.proxy.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);

        GameRegistry.registerWorldGenerator(new WorldGen(), 3);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
