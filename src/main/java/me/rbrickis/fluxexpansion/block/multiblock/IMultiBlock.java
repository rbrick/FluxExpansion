package me.rbrickis.fluxexpansion.block.multiblock;

import net.minecraft.block.Block;

import java.util.List;

/**
 * Created by Ryan on 4/6/2015
 * <p/>
 * Project: Flux Expansion
 */
public interface IMultiBlock {

    /**
     * @return - The blocks with in the Multiblock structure
     */
    List<Block> getBlocks();

}
