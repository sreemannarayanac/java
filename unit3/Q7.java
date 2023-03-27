// Program to delete duplicate elements from an array of size 5

import java.util.Scanner;


public class Q7 {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        
        // declare and initialize array
        int a[] = new int[5];
        // read array elements
        for (int i=0; i<a.length; i++) {
            System.out.print("Enter value for a[" + i + "]: ");
            a[i] = inp.nextInt();
        }

        // print array elements
        System.out.println("\nArray elements: ");
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }

        // delete duplicate elements
        for (int i=0; i<a.length; i++) {
            for (int j=i+1; j<a.length; j++) {
                if (a[i] == a[j]) {
                    a[j] = 0;
                }
            }
        }

        // print array elements
        System.out.println("\n\nArray elements after deleting duplicates: ");
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
