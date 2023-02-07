// Program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int day = (int) (Math.random() * 7) + 1;
        System.out.println("The random day is " + day);
        if (day == 1) {
            System.out.println("The weekday is Monday");
        } else if (day == 2) {
            System.out.println("The weekday is Tuesday");
        } else if (day == 3) {
            System.out.println("The weekday is Wednesday");
        } else if (day == 4) {
            System.out.println("The weekday is Thursday");
        } else if (day == 5) {
            System.out.println("The weekday is Friday");
        } else if (day == 6) {
            System.out.println("The weekday is Saturday");
        } else {
            System.out.println("The weekday is Sunday");
        }
    }
}
