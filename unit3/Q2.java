// Program to multiply two matrices

import java.util.Scanner;

class Q2 {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter number of rows of matrix 1: ");
        int m = inp.nextInt();
        System.out.print("Enter number of columns of matrix 1: ");
        int n = inp.nextInt();

        int mat1[][] = new int[m][n];
        int mat2[][] = new int[n][m];

        System.out.println("\nEnter the values of integer matrix 1: ");
        for (int i=0; i<m; i++) {
            System.out.println("__Enter row " + (i+1) +" elements: __");
            for(int j=0; j<n; j++) {
                System.out.print("Col " + (j+1) + " -> ");
                mat1[i][j] = inp.nextInt();
            }
        }

        System.out.println("\nEnter the values of integer matrix 2: ");
        for (int i=0; i<n; i++) {
            System.out.println("__Enter row " + (i+1) +" elements: __");
            for(int j=0; j<m; j++) {
                System.out.print("Col " + (j+1) + " -> ");
                mat2[i][j] = inp.nextInt();
            }
        }

        // multiplication of two matrices

        int mat3[][] = new int[5][5];

        for (int i=0; i<m; i++) { // rows of mat1
            for (int j=0; j<m; j++) { // columns of mat2
                mat3[i][j] = 0; // initialize to 0
                for (int k=0; k<n; k++) { // columns of mat1
                    mat3[i][j] += mat1[i][k] * mat2[k][j]; // mat1[i][k] * mat2[k][j], here mat1[i][k] is the ith row and kth column of mat1 and mat2[k][j] is the kth row and jth column of mat2
                }
            }
        }

        // printing the result
        System.out.println("\nThe product of the two matrices is: ");
        for (int i=0; i<m; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }
    }
}