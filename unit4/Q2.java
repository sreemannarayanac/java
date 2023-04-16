/*A class Shape is defined with two overloading constructors in it. Another class Test1 is 
partially defined which inherits the class Shape. The class Test1 should include two 
overloading constructors as appropriate for some object instantiation. You should define 
the constructors using the super class constructors. Also, override the method calculate() 
in Test1 to calculate the volume of a Shape.*/

class Shape {
  double x=0;
  double y=0;
  double z=0;

  // Constructor 1 - cube
  Shape(double edge){
    x = y = z = edge;
  }

  // Constructor 2 - cuboid
  Shape(double length, double bredth, double height) {
    x = length;
    y = bredth;
    z = height;
  }
}

class Test1 extends Shape{
  int id=-1;

  // Constructor 1 - cube
  Test1(double edge, int id) {
    super(edge);
    this.id = id;
  }

  // Consttructor 2 - cuboid
  Test1(double l, double b, double h, int id) {
    super(l, b, h);
    this.id = id;
  }

  // Method 1 - cube
  void calculate(double x) {
    System.out.println("Volume of the cube "+this.id+" = "+(x*x*x));
  }

  // Method 2 - cuboid
  void calculate(double x,double y,double z) {
    System.out.println("Volume of the cuboid "+this.id+" = "+ (x*y*z));
  }
}

class Q2 {
  public static void main (String args[]) {
    // creating a cube
    Test1 s1 = new Test1(5.0, 1);

    // creating a cuboid
    Test1 s2 = new Test1(5.0, 3.0, 2.0, 3);

    // calculating volume of cube
    s1.calculate(5);

    // calculating volume of cuboid
    s2.calculate(5, 5, 2);
  }
}