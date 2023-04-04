// Program to find maximum and minimum value in an array of size "M", passed as argument.

import java.util.Scanner;

class Q3 {
	Scanner inp = new Scanner(System.in);

	static void minMax (int[] x) 
	{
		int min=0, max=0;
		for (int i: x) 
		{
			if (i<min) 
			{
				min = i;
			} 
			else if (i>max) 
			{
				max = i;
			}
		}
		System.out.println("\nMaximum value: "+max+"\nMinimum value: "+min);
	}
	
	public static void main (String args[]) 
	{
		int x[] = {15, 12, 5, 21, -10};
		minMax(x);
	}
}
