# Create a class with a method that prints "This is parent class" and its subclass with another 
# method that prints "This is child class". Now, create an object for each of the class and 
# call
# ● method of parent class by object of parent class
# ● method of child class by object of child class
# ● method of parent class by object of child class

class Parent:
  def showP(self):
    print("Parent method is called")

class Child(Parent):
  def showC(self):
    print("Child method is called")

if __name__ == "__main__":
  print()
  
  # Creating a parent object
  p = Parent()
  p.showP() # calling parent method

  # Creating child object
  c = Child()
  c.showC() # calling child process
  c.showP() # calling parent process using child object