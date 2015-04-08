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
@Mod(modid = "flux_expansion", name = "Flux Expansion", version = "0.0.1")
public class FluxExpansion {

    @Mod.Instance("flux_expansion")
    public static FluxExpansion instance;

    @SidedProxy(clientSide = "me.rbrickis.fluxexpansion.proxy.FEClientProxy", serverSide = "me.rbrickis.fluxexpansion.proxy.FECommonProxy")
    public static FECommonProxy proxy;


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
