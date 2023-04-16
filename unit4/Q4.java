/*Create a class named 'Shape' with a method to print "This is This is shape". Then create 
two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a 
method to print "This I rectangular shape" and "This is circular shape" respectively. Create 
a subclass 'Square' of 'Rectangle having a method to print "Square is a rectangle". Now 
call the method of 'Shape' and 'Rectangle' clas by the object of 'Square' class.*/

class Shape {
  void shape_() {
    System.out.println("This is shape");
  }
}

class Rectangle extends Shape{
  void rectangle_() {
    System.out.println("This is rectangle");
  }
}

class Circle extends Shape{
  void circle_() {
    System.out.println("This is circle");
  }
}

class Square extends Rectangle {
  void square_() {
    System.out.println("Square is a Rectangle");
  }
}

public class Q4 {
  public static void main(String args[]) {  
    Square s =  new Square();
    s.rectangle_();
    s.shape_();
  }
}