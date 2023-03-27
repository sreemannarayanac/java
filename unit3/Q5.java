// Program that copies elements of one array to another using lenght member

import java.util.Scanner;

public class Q5 {
    public static void main (String args[]){
        Scanner inp = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[a.length];
        
        System.out.println("Enter 10 values: ");
        for (int i=0; i<a.length; i++) {
            a[i] = inp.nextInt();
        }

        for (int i=0; i<a.length; i++) {
            b[i] = a[i];
        }
        
        System.out.println("Array a: ");
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.println("\nArray b: ");
        for (int i=0; i<b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
