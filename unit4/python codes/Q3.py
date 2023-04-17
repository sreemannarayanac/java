# Create a class named 'Member' having the following members: Name, Age, Phone 
# number, Address, Salary. It also has a method named 'printSalary' which prints the salary 
# of the members. Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 
# 'Employee' and 'Manager' classes have data members 'specialization' and 'department' 
# respectively. Now, assign name, age, phone number, address and salary to an employee 
# and a manager by making an object of both of these classes and print the same.

class Member:
  name: str = None
  age: int = None
  phone: int = None
  address: str = None
  salary: float = None

  def __init__(self, name, age, phone, address, salary):
    self.name = name
    self.age = age
    self.phone = phone
    self.address = address
    self.salary = salary
  
  def printSalary(self):
    print(f"\nSalary of {self.name} = {self.salary}")

class Employee(Member):
  type: str = "Employee"
  specialization: str = None
  department: str = None

  def __init__(self, name, age, phone, address, salary, specialization, department):
    super().__init__(name, age, phone, address, salary)
    self.specialization = specialization
    self.department = department

  def printDetails(self):
    print(f"\n___Employee Data___\nName: {self.name}\nAge: {self.age}\nPhone Number: {self.phone}\nAddress: {self.address}\nSalary: {self.salary}\nSpecialization: {self.specialization}\nDepartment: {self.department}")

class Manager(Member):
  type: str = "Manager"
  specialization: str = None
  department: str = None

  def __init__(self, name, age, phone, address, salary, specialization, department):
    super().__init__(name, age, phone, address, salary)
    self.specialization = specialization
    self.department = department

  def printDetails(self):
    print(f"\n___Manager Data___\nName: {self.name}\nAge: {self.age}\nPhone Number: {self.phone}\nAddress: {self.address}\nSalary: {self.salary}\nSpecialization: {self.specialization}\nDepartment: {self.department}")

if __name__ == "__main__":
  e = Employee("Prerna", 27, 1010100110, "Italy", 57500.7526, "Analytics", "Operations")
  m = Manager("Vikramaditya", 29, 323223323, "France", 75700.88749, "AI ML", "Tech")

  e.printDetails()
  m.printDetails()

  e.printSalary()
  m.printSalary()