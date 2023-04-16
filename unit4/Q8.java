/* Write a program to find the roots of a quadratic equation using interface and packages.
● Declare an interface in package Quad1
● Declare another package Quad2 and implement the interface*/

import Quad1.Quad1;
import Quad2.Quad2;

public class Q8 {
    public static void main(String[] args) {
        Quad1 quad = new Quad2();
        quad.findRoots(1.0, -3.0, 2.0);
        System.out.println();
    }
}