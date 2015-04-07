package me.rbrickis.fluxexpansion.block;

import me.rbrickis.fluxexpansion.power.IPowerable;
import me.rbrickis.fluxexpansion.power.PowerDirection;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by Ryan on 4/6/2015
 * <p/>
 * Project: Flux Expansion
 */
public abstract class AbstractPoweredTileEntity extends FEBaseTileEntity implements IPowerable {

    @Override
    public abstract void onPowerTransfer(ForgeDirection from, int amount, PowerDirection direction);

    @Override
    public abstract int getStoredEnergy();

    @Override
    public abstract int getTotalEnergy();

}
