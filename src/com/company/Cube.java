/*
 * Classname Cube
 *
 * Version 1.0
 *
 * Copyright Skryp Andriy
 *
 *  1. Constructor.
 *  2. Getters/Setters.
 *  3. 5 methods.
 *  4. Override toString() method
 *  5. Override hash() and equals() methods.
 *
 */

package com.company;

import java.util.Objects;

public class Cube {

    // Parameters

    private int side;

    // 1. Create constructor:

    // Constructor FULL

    public Cube(int side) {
        this.side = side;
    }

    // Constructor EMPTY

    public Cube() {
    }

    // 2. Getters & Setters:

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    // 3. Creating five methods:

    // First - Area

    public int getArea() {
        return (this.getSide() * this.getSide());
    }

    // Seconds - Volume

    public int getVolume() {
        return (this.getSide() * this.getSide() * this.getSide());
    }

    // Third - Diagonal

    public double getDiagonal() {
        return (Math.sqrt(2) * this.getSide());
    }

    // Fourth - Angle between faces of a cube

    public double getAngleBetweenFaces() {
        return (Math.PI / 2);
    }

    // Fifth - Radius of the described sphere

    public double getRadiusOfTheDescribedSphere() {
        return ((Math.sqrt(3) / 2) * this.getSide());
    }

    // 4. toString() method:

    public String toString() {
        return "Cube" +
                "\nside = " + side +
                "\narea = " + getArea() +
                "\nvolume = " + getVolume() +
                "\ndiagonal = " + getDiagonal() +
                "\nangle between faces of a cube = "
                + getAngleBetweenFaces() +
                "\nradius of the described sphere = "
                + getRadiusOfTheDescribedSphere();
    }

    // 5. hash() and equals() methods:

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return getSide() == cube.getSide();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSide());
    }

}