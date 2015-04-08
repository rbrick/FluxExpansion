package me.rbrickis.fluxexpansion.block.multiblock;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ryan on 4/7/2015
 * <p/>
 * Project: Flux Expansion
 */
public class Pattern {

    List<PatternEntry> entries = new ArrayList<PatternEntry>();

    /**
     * Add a block to the pattern
     * @param entry - the entry you wish to add
     */
    public void addEntry(PatternEntry entry) {
        entries.add(entry);
    }

    public void removeEntry(PatternEntry entry) {
        entries.remove(entry);
    }

    public void clear() {
        entries.clear();
    }
}
