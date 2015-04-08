package me.rbrickis.fluxexpansion.block.multiblock;

import me.rbrickis.fluxexpansion.utils.Vector;
import net.minecraft.block.Block;

/**
 * Created by Ryan on 4/7/2015
 * <p/>
 * Project: Flux Expansion
 */
public class PatternEntry {

    Vector relLocation;
    Block type;

    public PatternEntry(Vector relLocation, Block type) {
        this.relLocation = relLocation;
        this.type = type;
    }

    public Block getType() {
        return type;
    }

    public Vector getRelLocation() {
        return relLocation;
    }
}
