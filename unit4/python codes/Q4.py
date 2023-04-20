# Create a class named 'Shape' with a method to print "This is This is shape". Then create 
# two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a 
# method to print "This I rectangular shape" and "This is circular shape" respectively. Create 
# a subclass 'Square' of 'Rectangle having a method to print "Square is a rectangle". Now 
# call the method of 'Shape' and 'Rectangle' clas by the object of 'Square' class.

class Shape:
  def shape(self):
    print("This is a shape")

class Rectangle(Shape):
  def rectangle(self):
    print("This is a rectangle")

class Circle(Shape):
  def circle(self):
    print("This is a circle")

class Square(Rectangle):
  def square(self):
    print("This is a square")

if __name__ == "__main__":
  s = Square()
  print()
  s.square()
  s.rectangle()
  s.shape()