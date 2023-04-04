// Differentiate between static and non static methods in java

import java.util.*;

class Q6 {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        int n = inp.nextInt();

        // calling a static method
        System.out.println("Square of " + n + "(using static method) is " + square(n));
        // calling a non static method
        System.out.println("Square of " + n + "(using non static method) is " + new Q6().square2(n)+"\n");
    }

    // Static meth
    static int square(int n) {
        return n * n;
    }

    // Non static method
    int square2(int n) {
        return n * n;
    }
}