/*Create a class with a method that prints "This is parent class" and its subclass with another 
method that prints "This is child class". Now, create an object for each of the class and 
call
● method of parent class by object of parent class
● method of child class by object of child class
● method of parent class by object of child class*/

class Parent {
  void showP() {
    System.out.println("Method of parent class called.");
  }
}

class Child extends Parent {
  void showC(){
    System.out.println("Method of child class called.");
  }
}

public class Q5 {
  public static void main(String args[]) {
    // creating parent object and calling parent function
    Parent p = new Parent();
    p.showP();

    // creating child object
    Child c = new Child();
    // calling child function
    c.showC();
    // calling parent function
    c.showP();
  }
}