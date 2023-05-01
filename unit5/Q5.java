// Develop a program to demonstrate exception handling by using THROW, MULTIPLE CATCH and FINALLY statements.

import static java.lang.System.*;
import java.util.Scanner;

public class Q5 {
    public static void main(String args[]){
        Scanner inp = new Scanner(in);
        try {
            out.print("Enter a number: ");
            int n = inp.nextInt();
            if (n < 0) {
                throw new Exception("Number cannot be negative");
            }
            out.println("Number is: " + n);
        } catch (Exception e) {
            out.println("Exception: " + e.getMessage());
        } finally {
            out.println("Finally block executed");
        }
    }
}
