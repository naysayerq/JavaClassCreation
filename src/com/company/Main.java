/*
 * Classname Main
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

public class Main {

    public static void main(String[] args) {

        // TESTING
        // Creating object of Cube

        Cube myCube = new Cube(5);

        myCube.setSide(4);

        System.out.println(myCube.toString());

    }
}
