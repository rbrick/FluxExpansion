package me.rbrickis.fluxexpansion.block.tileentity;

import me.rbrickis.fluxexpansion.block.FEBaseBlockContainer;
import me.rbrickis.fluxexpansion.block.FEBaseTileEntity;
import me.rbrickis.fluxexpansion.power.IPowerable;
import me.rbrickis.fluxexpansion.power.PowerDirection;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by Ryan on 4/12/2015
 * <p/>
 * Project: Flux Expansion
 */
public class TileEntityMachineSmasher extends FEBaseTileEntity implements IPowerable {

    FEBaseBlockContainer parent;

    int powerStored;

    public TileEntityMachineSmasher(FEBaseBlockContainer parent) {
         this.parent = parent;
    }

    /**
     * @param from      - The direction the power is coming from
     * @param amount    - The amount of energy flowing, either in or out.
     * @param direction - The flow of power
     */
    @Override
    public void onPowerTransfer(ForgeDirection from, int amount, PowerDirection direction) {
            // Can only be powered from the bottom
            // Should always be input, as it should not be able to output power, only "loose" power
            if (from == ForgeDirection.DOWN && direction == PowerDirection.IN) {
                powerStored += amount;

                if (powerStored > getTotalEnergy()) {
                    powerStored = getTotalEnergy();
                }
            }
    }

    /**
     * @return The energy stored within the element
     */
    @Override
    public int getStoredEnergy() {
        return powerStored;
    }

    /**
     * @return The max energy an element can store
     */
    @Override
    public int getTotalEnergy() {
        return 100000000;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
         powerStored = compound.getInteger("power");
    }

    @Override
    public void writeToNBT(NBTTagCompound compound) {
        compound.setInteger("power", powerStored);
    }
}
