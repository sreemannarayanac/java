/* Create a class named 'Member' having the following members: Name, Age, Phone 
number, Address, Salary. It also has a method named 'printSalary' which prints the salary 
of the members. Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 
'Employee' and 'Manager' classes have data members 'specialization' and 'department' 
respectively. Now, assign name, age, phone number, address and salary to an employee 
and a manager by making an object of both of these classes and print the same.*/

class Member {
  String name;
  int age;
  long phone;
  String address;
  double salary;

  Member(String name, int age, long phone, String address, double salary) {
    this.name = name;
    this.age = age;
    this.phone = phone;
    this.address = address;
    this.salary = salary;
  }
  
  void printSalary(){
    System.out.println("\nSalary of "+this.name+" = "+this.salary);
  }
}

class Employee extends Member{
  String specialization;
  String department;

  Employee(String name, int age, long phone, String address, double salary, String specialization, String department) {
    super(name, age, phone, address, salary);
    this.specialization = specialization;
    this.department = department;
  }

  void printDetails() {
    System.out.println("_______Employee Data_______");
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("Phone number: "+phone);
    System.out.println("Address: "+address);
    System.out.println("Salary: "+salary);
    System.out.println("Specialization: "+specialization);
    System.out.println("Department: "+department+"\n");
  }
}

class Manager extends Member{
  String specialization;
  String department;

  Manager(String name, int age, long phone, String address, double salary, String specialization, String department) {
    super(name, age, phone, address, salary);
    this.specialization = specialization;
    this.department = department;
  }

  void printDetails() {
    System.out.println("_______Manager Data_______");
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("Phone number: "+phone);
    System.out.println("Address: "+address);
    System.out.println("Salary: "+salary);
    System.out.println("Specialization: "+specialization);
    System.out.println("Department: "+department+"\n");
  }
}

public class Q3 {
  public static void main(String args[]){
    // creating an employee
    Employee e = new Employee("Prerna", 27, 1010100110, "Italy", 57500.7526, "Analytics", "Operations");

    // creating a manager
    Manager m = new Manager("Vikramaditya", 29, 323223323, "France", 75700.88749, "AI ML", "Tech");

    // Printing details
    e.printDetails();
    m.printDetails();

    // printing salaries
    e.printSalary();
    m.printSalary();
  }
}