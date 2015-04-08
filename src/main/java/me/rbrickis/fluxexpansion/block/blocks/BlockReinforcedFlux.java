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
 * Essentially the same as obsidian. Crafted with 4 obsidian and 4 diamonds surrounding a Flux Crystal Block
 */
public class BlockReinforcedFlux extends FEBaseBlock {

    public BlockReinforcedFlux() {
        super(Material.iron);
        setStepSound(Block.soundTypeStone);
        setHardness(50.0f);
        setResistance(2000.0F);
        setBlockName("reinforced_flux_crystal_block");
        setBlockTextureName("minecraft:redstone_block");
        setCreativeTab(new FECreativeTab());
    }
}
