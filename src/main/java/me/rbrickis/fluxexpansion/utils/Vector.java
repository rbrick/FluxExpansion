package me.rbrickis.fluxexpansion.utils;

/**
 * Created by Ryan on 4/7/2015
 * <p/>
 * Project: Flux Expansion
 */
public class Vector {

    int x, y, z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Vector add(Vector vector) {
        int nx = this.getX() + vector.getX();
        int ny = this.getY() + vector.getY();
        int nz = this.getZ() + vector.getZ();
        return new Vector(nx, ny, nz);
    }


    public Vector subtract(Vector vector) {
        int nx = this.getX() - vector.getX();
        int ny = this.getY() - vector.getY();
        int nz = this.getZ() - vector.getZ();
        return new Vector(nx, ny, nz);
    }

    public Vector multiply(Vector vector) {
        int nx = this.getX() * vector.getX();
        int ny = this.getY() * vector.getY();
        int nz = this.getZ() * vector.getZ();
        return new Vector(nx, ny, nz);
    }
}
