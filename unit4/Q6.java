/*Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods 
create another class smart telephone and demonstrate polymorphism*/

abstract class Telephone {
  abstract void call();
  abstract void lift();
  abstract void disconnected();
}

class SmartTelephone extends Telephone {
  void call() {
    System.out.println("call function implemented");
  }
  void lift() {
    System.out.println("lift function implemented");
  }
  void disconnected() {
    System.out.println("disconnected function implemented");
  }
}

class Q6 {
  public static void main (String args[]) {
    Telephone t = new SmartTelephone();
    t.call();
    t.lift();
    t.disconnected();
  }
}