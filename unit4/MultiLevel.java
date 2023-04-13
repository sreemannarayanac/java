class A {
  void display(){
    System.out.println("Display function called");
  }
}

class B extends A {
  void show() {
    System.out.println("Show function called");
  }
}

class C extends B {
  void gun() {
    System.out.println("American function called");
  }
}

class MultiLevel {
  public static void main(String args[]) {
    C c1 = new C();
    c1.display();
    c1.show();
    c1.gun();
  }
}