// Program to display the pattern like right angle triangle 

import java.io.*;
import java.util.*;
import java.lang.*;

public class Q10 {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		for (int i=1; i<=num; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
