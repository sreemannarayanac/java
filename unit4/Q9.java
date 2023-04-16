/*Write a Program to generate Fibonacci Series by using Constructor to initialize the Data Members.*/

class Fibonacci {
  int n1 = 0;
  int n2 = 1;
  int n3;

  public Fibonacci(int count) {
    System.out.print(n1 + " " + n2);
    for (int i = 2; i < count; ++i) {
      n3 = n1 + n2;
      System.out.print(" " + n3);
      n1 = n2;
      n2 = n3;
    }
    System.out.println();
  }
}

public class Q9 {
  public static void main(String args[]) {
    Fibonacci f = new Fibonacci(5);
    Fibonacci f1 = new Fibonacci(10);
  }
}