/* rogram to read two numbers and perform the arithmetic operations using methods. */

import java.util.Scanner;

class Operations {

  double a;
  double b;

  double addition() {
    return this.a+this.b;
  }

  double subtraction () {
    return this.a-this.b;
  }

  double multiplication () {
    return this.a*this.b;
  }

  double division () {
    return this.a+this.b;
  }
}


public class Q1 {
  public static void main (String args[]) {
    
    Scanner inp = new Scanner(System.in);
    Operations open = new Operations();

    do {
      System.out.print("Enter a: ");
      open.a = inp.nextDouble();
      System.out.print("Enter b: ");
      open.b = inp.nextDouble();
      System.out.println();
      System.out.print("__Operations__:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit (End operation)\nChoose operation(number): ");
      int op = inp.nextInt();
      switch(op) {
        case 1: System.out.println("Addition of "+open.a+" and "+open.b+" gives "+open.addition()); break;
        case 2: System.out.println("Subtraction of "+open.b+" from "+open.a+" gives "+open.subtraction()); break;
        case 3: System.out.println("Multiplication of "+open.a+" with "+open.b+" gives "+open.multiplication()); break;
        case 4: System.out.println("Division of "+open.a+" by "+open.b+" gives "+open.division()); break;
        case 5: System.exit(0); break;
        default: System.out.println("Enter valid operation. Try again.");
      }
      System.out.println("_________________________________");
    }
    while (true);
  }
}