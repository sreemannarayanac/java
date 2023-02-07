// Program to input 5 numbers from keyboard and find their sum and average

import java.util.Scanner;

public class Q8 {
	public static void main (String args[]) {
		Scanner inp = new Scanner(System.in);
		int sum=0;
		for (int i=1; i<6; i++) {
			System.out.print("Enter number "+ i + ": ");
			sum+=inp.nextInt();
			System.out.println();
		}
		System.out.println("Sum = "+sum);
		float avg = sum/5;
		System.out.println("Average = "+avg);
	}
}
