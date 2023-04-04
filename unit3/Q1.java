// Program for sorting a given list of names in ascending order

import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        System.out.println("Enter the names: ");
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + " ");
            names[i] = sc.next(); // read a name, one at a time
        }
        for (int i = 0; i < n; i++) { // loop for n-1 passes
            for (int j = i + 1; j < n; j++) { // loop for n-i-1 comparisons
                if (names[i].compareTo(names[j]) > 0) { // compare names
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("\nThe sorted names are: ");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + " " + names[i]);
        }
    }
}