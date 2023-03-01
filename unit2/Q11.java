// Read the command line arguments and print the total number of arguments and its values.

import java.util.Scanner;

class Q11 {
    Scanner inp = new Scanner(System.in);
    public static void main(String args[]){
        int n = args.length;
        System.out.println("Total number of arguments: "+n);
        System.out.println("The arguments are: ");
        for (int i=0; i<n; i++) {
            System.out.println(args[i]);
        }
    }
}