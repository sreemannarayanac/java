# Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods 
# create another class smart telephone and demonstrate polymorphism

import abc  #abstract base class

class Telephone(metaclass=abc.ABCMeta):
  @abc.abstractmethod
  def call(self):
    pass

  @abc.abstractmethod
  def list(self):
    pass

  @abc.abstractmethod
  def disconnected(self):
    pass

class SmartTelephone(Telephone):
  def call(self):
    print("Call function called")

  def lift(self):
    print("Lift function called")

  def disconnected(self):
    print("Disconnected function called")

