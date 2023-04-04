// Program to read and print an array of size N rows with variable number of columns. (Hint: Irregular array).

import java.util.Scanner;

public class Q4 {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        
        // Initialization of irregular array
        System.out.print("\nEnter the number of rows: ");
        int a[][] = new int[inp.nextInt()][];
        
        //! Getting the number of columns and values for each row
        for (int i=0; i<a.length; i++) {
            System.out.print("\nEnter the number of columns for row " + (i+1) + ": ");
            a[i] = new int[inp.nextInt()];
            System.out.println("__Enter the values for row " + (i+1) + "__");
            for (int j=0; j<a[i].length; j++) {
                System.out.print("Col " + (j+1) + " -> ");
                a[i][j] = inp.nextInt();
            }
        }

        //? Printing the irregular array
        System.out.println("\nJacked array/Irregular array: ");
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
