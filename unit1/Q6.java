// Program that takes a year from user and print whether that year is leap year or not.

import java.util.Scanner;

public class Q6 {
	public static void main (String args[]) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = inp.nextInt();
		if (year%4==0) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not a leap Year");
		}
	}
}
