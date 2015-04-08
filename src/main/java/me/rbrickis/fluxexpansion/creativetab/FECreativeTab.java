package me.rbrickis.fluxexpansion.creativetab;

import me.rbrickis.fluxexpansion.block.blocks.Blocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Ryan on 4/7/2015
 * <p/>
 * Project: Flux Expansion
 */
public class FECreativeTab extends CreativeTabs {

    public FECreativeTab() {
        super("Flux Expansion");
    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(Blocks.REINFORCED_FLUX_CRYSTAL_BLOCK);
    }
}
