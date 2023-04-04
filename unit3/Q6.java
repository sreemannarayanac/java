// Program to find an element from an sorted array using binary search

import java.util.Scanner;
import java.util.Arrays; // for sorting

public class Q6 {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);

        int a[] = new int[10];
        
        for (int i=0; i<a.length; i++) {
            System.out.print("Enter value for a[" + i + "]: ");
            a[i] = inp.nextInt();
        }

        // sort the array
        Arrays.sort(a); // this is a static method of Arrays class which sorts the array using quick sort algorithm

        // print sorted array
        System.out.println("\nSorted array: ");
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.print("\n\nEnter the key to be searched: ");
        int key = inp.nextInt();
        
        int mid=0, low, high, flag = 0;
        low = 0;
        high = a.length - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (key == a[mid]) {
                flag = 1;
                break;
            } else if (key < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (flag == 1) {
            System.out.println("\nKey found at index " + mid);
        } else {
            System.out.println("\nKey not found");
        }
    }
}
