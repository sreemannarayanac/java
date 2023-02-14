/* Design a class that overload a method compare() to return the greater of two as follows:
void compare(int, int)
void compare(char, char)
void compare(String, String) */

import java.lang.*;

public class Main {
	
	static void compare(int a, int b) {
    		if (a > b) 
		{
        		System.out.println(a);
    		} 
		else 
		{
       			System.out.println(b);
    		}
	}

	
	static void compare(char a, char b) {
		double x = (double) a;
		double y = (double) b;
    		if (x > y) 
		{
        		System.out.println(a);
    		} 
		else 
		{
       			System.out.println(b);
    		}
	}
	
	
	static void compare(String a, String b) {
    		if (a.compareTo(b) > 0)
		{
        		System.out.println(a);
    		} 
		else if (a.compareTo(b) < 0)
		{
       			System.out.println(b);
    		}
		else
		{
			System.out.println("Equal");
		}
	}
	
	public static void main (String args[]) {
		compare(123, 345);
		compare("2", "1");
		compare("123", "345");
	}
}
