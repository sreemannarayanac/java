import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Choose the operation: ");
            System.out.println("1. Factorial of a given number");
            System.out.println("2. Finding even or odd");
            System.out.println("3. Multiplication table of the given number");
            System.out.println("4. Exit");
            System.out.print("Enter choice (number) here: ");

            int choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter a number to find its factorial: ");
                int num = input.nextInt();
                int fact = 1;

                for (int i = 1; i <= num; i++) {
                    fact *= i;
                }

                System.out.println("Factorial of " + num + " is " + fact);
            } else if (choice == 2) {
                System.out.print("Enter a number to check if it's even or odd: ");
                int num = input.nextInt();

                if (num % 2 == 0) {
                    System.out.println(num + " is even");
                } else {
                    System.out.println(num + " is odd");
                }
            } else if (choice == 3) {
                System.out.print("Enter a number to print its multiplication table: ");
                int num = input.nextInt();

                for (int i = 1; i <= 10; i++) {
                    System.out.println(num + " x " + i + " = " + (num*i));
                }
            } else if (choice == 4) {
                System.out.print("Exiting program...");
                break;
            } else {
                System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        }
    }
}
