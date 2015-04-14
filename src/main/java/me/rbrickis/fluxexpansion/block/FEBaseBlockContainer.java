package me.rbrickis.fluxexpansion.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Ryan on 4/12/2015
 * <p/>
 * Project: Flux Expansion
 */
public class FEBaseBlockContainer extends BlockContainer {

    protected FEBaseBlockContainer(Material material) {
        super(material);
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     *
     * @param world - World in which to place the TileEntity
     * @param metadata
     */
    @Override
    public TileEntity createNewTileEntity(World world, int metadata) {
        return null;
    }
}
