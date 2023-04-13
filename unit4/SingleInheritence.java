class A {
  void display() {
    System.out.println("Display function called.");
  }
}

class B extends A {
  void call() {
    System.out.println("Call function called");
  }
}

class SingleInheritence {
  public static void main(String args[]){
    B b1 = new B();
    b1.display();
    b1.call();
  }
}