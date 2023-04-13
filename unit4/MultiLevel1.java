class A {
  int balance;
  A (int balance) {
    this.balance = balance;
  }
  void display(){
    System.out.println("Display function called. Balance: " + balance);
  }
}

class B extends A {
  int year;
  B (int balance, int year) {
    super(balance);
    this.year = year;
  }
  void show() {
    System.out.println("Show function called. Year: "+year);
  }
}

class C extends B {
  String type;
  C (int balance, int year, String type) {
    super(balance, year);
    this.type = type;
  }
  void gun() {
    System.out.println("American function called. Type: "+type);
  }
}

class MultiLevel1 {
  public static void main(String args[]) {
    C c1 = new C(12000, 1990, "Pistol");
    c1.display();
    c1.show();
    c1.gun();
  }
}