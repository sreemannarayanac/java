// Program to implement all String methods on a Input string

import java.util.Scanner;

class Q9 {
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = inp.nextLine();
		// Sample string
		String s1 = "Hello";
		// methods
		System.out.println("Length of string: "+s.length());
		System.out.println("Char at position 4 [.charAt(4)]: " + s.charAt(4));
		System.out.println("Substring of String s from pos 4 [.substring(4)]: " + s.substring(4));
		System.out.println("Substring of String s from pos 4 to 8 [.substring(4, 8)]: " + s.substring(4, 8));
		System.out.println("String equals method [.equals(stringObj)] : "+ s.equals(s1));
		System.out.println("String.startsWith method: s.startsWith(''A''): " + s.startsWith("A"));
		System.out.println("String.startsWith method: s.endsWith('A'): "+ s.endsWith("a");
		System.out.println("");
		System.out.println();
		System.out.println();
		System.out.println();
	}
}