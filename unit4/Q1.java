/* Define a class Point with two fields x and y each of type double. Also , define a method
 distance(Point p1, Point p2) to calculate the distance between points p1 and p2 and return 
the value in double. Use Math.sqrt( ) to calculate the square root. */

import java.util.Scanner;

class Point {
  double x;
  double y;

  Point(double x, double y) {
    this.x = x;
    this.y = y;
  }
}

public class Q1 {
  public static double distance(Point p1, Point p2) {
    return (double) Math.sqrt(((p2.x - p1.x) * (p2.x - p1.x)) + ((p2.y - p1.y) * (p2.y - p1.y)));
  }

  public static void main(String args[]) {
    Scanner inp = new Scanner(System.in);
    System.out.println("\nEnter x and y coordinates of the points");
    double x, y;

    // Point 1
    System.out.println("Point 1");
    System.out.print("x: ");
    x = inp.nextDouble();
    System.out.print("y: ");
    y = inp.nextDouble();
    Point p1 = new Point(x, y);
    // Point 2
    System.out.println("Point 2");
    System.out.print("x: ");
    x = inp.nextDouble();
    System.out.print("y: ");
    y = inp.nextDouble();
    Point p2 = new Point(x, y);

    // Calculating distance
    System.out.println("\nDistance between point 1 and point 2 = " + distance(p1, p2) + "\n");
  }
}