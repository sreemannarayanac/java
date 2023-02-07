// Program to solve quadratic equations (use if, else if and else)

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        int d = (b * b) - (4 * a * c);
        if (d > 0) {
            System.out.println("The roots are real and unequal");
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (d < 0) {
            System.out.println("The roots are imaginary");
        } else {
            System.out.println("The roots are real and equal");
            double r = -b / (2 * a);
            System.out.println("The root is " + r);
        }
    }
}
