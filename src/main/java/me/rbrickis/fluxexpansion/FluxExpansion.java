package me.rbrickis.fluxexpansion;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import me.rbrickis.fluxexpansion.proxy.FECommonProxy;

/**
 * Created by Ryan on 4/6/2015
 * <p/>
 * Project: Flux Expansion
 */
@Mod(modid = FluxExpansion.MOD_ID, name = FluxExpansion.MOD_NAME, version = FluxExpansion.MOD_VERSION)
public class FluxExpansion {

    @Mod.Instance("flux_expansion")
    public static FluxExpansion instance;

    @SidedProxy(clientSide = "me.rbrickis.fluxexpansion.proxy.FEClientProxy", serverSide = "me.rbrickis.fluxexpansion.proxy.FECommonProxy")
    public static FECommonProxy proxy;

    public static final String MOD_ID = "flux_expansion";
    public static final String MOD_NAME = "Flux Expansion";
    public static final String MOD_VERSION = "0.0.1";

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {
        proxy.register();

    }

    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {

    }


    @Mod.EventHandler
    public void onPostInit(FMLPostInitializationEvent event) {

    }

}
