/* Develop a program to demonstrate multiple inheritance through interface.*/

interface InterfaceA  {
  void methodA();
}

interface InterfaceB {
  void methodB();
}

class ClassAB implements InterfaceA, InterfaceB {
  public void methodA() {
    System.out.println("Method A");
  }
  public void methodB() {
    System.out.println("Method B");
  }
}

public class Q10 {
  public static void main (String args[]) {
    ClassAB cab = new ClassAB();
    cab.methodA();
    cab.methodB();
  }
}