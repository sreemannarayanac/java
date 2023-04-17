class Shape:
  x: float = None
  y: float = None
  z: float = None

  def __init__(self, length, bredth=None, height=None):
    if bredth==None or height == None:
      self.x, self.y, self.z = length, length, length
    else:
      self.x = length
      self.y = bredth
      self.z = height

class Test1(Shape):
  _id: int = None

  def __init__(self, _id, x, y=None, z=None):
    super().__init__(x, y, z)
    self._id = _id

  def calculate(self):
    if self.x == self.y and self.y == self.z:
      print("Volume of cube = ", self.x**3)
    else:
      print("Volume of cuboid = ", self.x*self.y*self.z)

if __name__ == "__main__":
  t1 = Test1(1, 5.5)
  t2 = Test1(2, 3, 3, 3)
  print(t1.x)
  t1.calculate()
  t2.calculate()