// Program that reads two floating point numbers and tests whether they are the same upto three decimal places

import java.util.Scanner;
import java.lang.Math;

public class Q5 {
	public static void main (String args[]) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter a: ");
		float a = inp.nextFloat();
		System.out.print("Enter b: ");
		float b = inp.nextFloat();
		if (Math.floor(a*1000)==Math.floor(b*1000)) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}
	}
}
