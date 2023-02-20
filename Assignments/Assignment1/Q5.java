import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the lower limit of the range: ");
        int lower = input.nextInt();

        System.out.print("Enter the upper limit of the range: ");
        int upper = input.nextInt();

        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are: ");

        for (int i = lower; i <= upper; i++) {
            int sum = 0;
            int temp = i;
            int digits = String.valueOf(i).length();

            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (i == sum) {
                System.out.print(i + " ");
            }
        }
    }
}