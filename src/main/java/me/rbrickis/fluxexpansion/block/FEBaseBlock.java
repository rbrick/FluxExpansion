package me.rbrickis.fluxexpansion.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.rbrickis.fluxexpansion.FluxExpansion;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by Ryan on 4/6/2015
 * <p/>
 * Project: Flux Expansion
 */
public class FEBaseBlock extends Block {
    protected FEBaseBlock(Material material) {
        super(material);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", FluxExpansion.MOD_ID + ":", getUnwrappedBlockName(super.getUnlocalizedName())).toLowerCase();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        blockIcon = register.registerIcon(String.format("%s", getUnwrappedBlockName(this.getUnlocalizedName())));
    }

    public String getUnwrappedBlockName(String unlocalizedName) {
          return unlocalizedName.substring(unlocalizedName.indexOf('.') + 1).toLowerCase();

    }
}
