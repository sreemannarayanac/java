package Quad2;
import Quad1.Quad1;

public class Quad2 implements Quad1 {
  public void findRoots(double a, double b, double c) {
    double root1, root2;
    double determinant = b*b - 4*a*c;
    if (determinant > 0) {
      root1 = (-b + Math.sqrt(determinant))/(2*a);
      root2 = (-b - Math.sqrt(determinant))/(2*a);
      System.out.format("Root1 = %.2f and Root2 = %.2f", root1, root2);
    } else if (determinant==0) {
      root1 = root2 = -b / (2*a);
      System.out.format("Root1 = Root2 = %.2f", root1);
    } else {
      double i = Math.sqrt(-determinant)/(2*a);
      double r = -b/(2*a);
      System.out.format("Root1 = %.2f+%.2fi and Root2 = %.2f-%.2fi", r, i, r, i);
    }
  }
}