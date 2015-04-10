package me.rbrickis.fluxexpansion.block.blocks;

import me.rbrickis.fluxexpansion.block.FEBaseBlock;
import me.rbrickis.fluxexpansion.creativetab.FECreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Ryan on 4/7/2015
 * <p/>
 * Project: Flux Expansion
 *
 * Essentially the same as obsidian. Crafted with 4 obsidian and 4 flux crystals surrounding a Fluxed Electrum Block.
 * Used to make the machine multiblocks, and used in some recipes
 */
public class BlockMachineCasing extends FEBaseBlock {

    public BlockMachineCasing() {
        super(Material.iron);
        setStepSound(Block.soundTypeStone);
        setHardness(50.0f);
        setResistance(2000.0F);
        setBlockName("machineCasing");
        setCreativeTab(new FECreativeTab());
    }
}
