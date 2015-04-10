package me.rbrickis.fluxexpansion.proxy;

import cpw.mods.fml.common.registry.GameRegistry;
import me.rbrickis.fluxexpansion.block.blocks.Blocks;

/**
 * Created by Ryan on 4/7/2015
 * <p/>
 * Project: Flux Expansion
 */
public class FECommonProxy  {

    public void register() {
        GameRegistry.registerBlock(Blocks.MACHINE_CASING, "machineCasing");
    }
}
