package me.rbrickis.fluxexpansion.power;

import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by Ryan on 4/6/2015
 * <p/>
 * Project: Flux Expansion
 *
 * This interface represents an element that can hold and receive power e.g. a block or an item.
 */
public interface IPowerable {

    /**
     * @param from      - The direction the power is coming from
     * @param amount    - The amount of energy flowing, either in or out.
     * @param direction - The flow of power
     */
    void onPowerTransfer(ForgeDirection from, int amount, PowerDirection direction);

    /**
     * @return The energy stored within the element
     */
    int getStoredEnergy();

    /**
     * @return The max energy an element can store
     */
    int getTotalEnergy();

}
