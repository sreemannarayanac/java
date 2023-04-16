# Define a class Point with two fields x and y each of type double. Also , define a method
# distance(Point p1, Point p2) to calculate the distance between points p1 and p2 and return 
# the value in double. Use Math.sqrt( ) to calculate the square root.

class Point:
  x: float = None
  y: float = None

  def __init__(self, x, y):
    self.x = x
    self.y = y

def distance(p1: Point, p2: Point):
  return ((p1.x-p2.x)**2+(p1.y-p2.y)**2)**(1/2)

if __name__ == "__main__":
  print("Enter x and y coordinates of the points")
  
  print("\nPoint 1")
  x = float(input("x: "))
  y = float(input("y: "))
  p1 = Point(x, y)
  
  print("\nPoint 2")
  x = float(input("x: "))
  y = float(input("y: "))
  p2 = Point(x, y)

  print("\nDistance between point 1 and point 2 = ", distance(p1, p2))