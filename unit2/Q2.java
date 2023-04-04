/* Program that performs arithmetic operations using methods. */ 

import java.util.Scanner;

class Operations {

  int a;
  int b;

  int addition() {
    return this.a+this.b;
  }

  int subtraction () {
    return this.a-this.b;
  }

  int multiplication () {
    return this.a*this.b;
  }

  int division () {
    return this.a/this.b;
  }
}

class Q2 {
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		
		Operations open = new Operations();
		
		do {
			char a, b;
			System.out.println("Program that performs arithmetic operations using methods");
			System.out.print("Enter a: "); a = inp.next().charAt(0);
			System.out.print("Enter b: "); b = inp.next().charAt(0);
		
			// changing them to int type to perform arithmetic operations
			open.a = (int) a; open.b = (int) b;
			System.out.println();
			System.out.print("__Operations__:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit (End operation)\nChoose operation(number): ");
			int op = inp.nextInt();
			switch(op) {
				case 1: System.out.println("Addition of "+ a + "(" + (int) a + ")" +" and "+ b + "(" + (int) a + ")" +" gives "+(char) open.addition() + " or " + open.addition()); break;
				case 2: System.out.println("Subtraction of "+ a + "(" + (int) a + ")" +" from "+ b + "(" + (int) b + ")" +" gives "+(char) open.subtraction() + " or " + open.subtraction()); break;
				case 3: System.out.println("Multiplication of "+ a + "(" + (int) a + ")" +" with "+ (int) b + "(" + b + ")" +" gives "+(char) open.multiplication() + " or " + open.multiplication()); break;
				case 4: System.out.println("Division of "+ a + "(" + (int) a + ")" +" by "+ b + "(" + (int) b + ")" +" gives "+(char) open.division() + " or " + open.division()); break;
				case 5: System.exit(0); break;
				default: System.out.println("Enter valid operation. Try again.");
			}
			System.out.println("_________________________________");
		}
		while (true);
	}
	// code includes multiple type conversions. It can be inproved, but the program is written for learning type conversions.
}
