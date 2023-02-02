// Program to find the maximum of three numbers (use if, else if and else)

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("The maximum is " + a);
        } else if (b > a && b > c) {
            System.out.println("The maximum is " + b);
        } else {
            System.out.println("The maximum is " + c);
        }
    }
}