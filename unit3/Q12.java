// Program to reverse the words in a string

import java.util.Scanner;

class Q12 {
	static String[] reveseWords (String s) {
		String words[] = s.split(" ");
		String reversed[] = new String[words.length]; 
		for (int i=0; i<words.length; i++) {
			StringBuilder temp = new StringBuilder(words[i]);
			temp = temp.reverse();
			reversed[i] = temp.toString();
		}
		return reversed;
	}
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		// original srting
		System.out.print("Original String: ");
		String s = inp.nextLine();
		// reversing string
		System.out.print("\nString after reversal: ");
		String s1[] = reveseWords(s);
		for (String i: s1) {
			System.out.print(i+" ");
		}
	}
}