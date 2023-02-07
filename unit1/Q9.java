// Program in java to display the multiplication table of a given integer

import java.util.Scanner;

public class Q9 {
	public static void main (String args[]) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = inp.nextInt();
		System.out.println("Table of "+num+": ");
		for (int i=1; i<11; i++) {
			System.out.println(num+" x "+i+" = "+num*i);
		}
	}
}
