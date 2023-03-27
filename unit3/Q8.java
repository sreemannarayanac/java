// Program that reverses the elements and stores it in the same array

import java.util.Scanner;

public class Q8 {
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
        System.out.println("\nArray elements(before reversing): ");
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }

        // reverse the array
        int temp;
        for (int i=0; i<a.length/2; i++) {
            temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }

        // print array elements
        System.out.println("\n\nArray elements(after reversing): ");
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
