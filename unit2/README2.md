# Introduction to Classes Objects and Methods
## Part 2  
## Table of Contents
- [Contolling Access to Class Members](#contolling-access-to-class-members)
- [Passing objects to methods](#passing-objects-to-methods)
- [Passing arguments](#passing-arguments)
- [Returning Objects](#returning-objects)
- [Method Overloading](#method-overloading)
- [Overloading Constructors](#overloading-constructors)
- [Understanding `static`](#understanding-static)
- [Variable-Length Arguments](#variable-length-arguments)  

---
## Contolling Access to Class Members
- Access modifiers are used to control the access to classes, variables, methods, and constructors.
- There are four access modifiers in Java:
    - `public` - The code is accessible for all classes
    - `protected` - The code is accessible in the same package and subclasses.
    - `default` - The code is only accessible in the same package. This is used when you don't specify a modifier.
    - `private` - The code is only accessible within the declared class.
- **default** - The code is only accessible in the same package. This is used when you don't specify a modifier.
- **private** - The code is only accessible within the declared class.
- **public** - The code is accessible for all classes
- **protected** - The code is accessible in the same package and subclasses.  

---
## Passing objects to methods
- You can pass objects as parameters to methods.
- When an object is passed as a parameter, the parameter's value is the reference to the object.
```java
// example of passing objects to methods
class Student{
    int rollno;
    String name;
}
class Example {
    void change(Student s){
        s.rollno = 100;
        s.name = "John";
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.rollno = 10;
        s1.name = "Raj"; 
        // Values of S1 before change are 10 and Raj
        Example e = new Example();
        e.change(s1); // Passing object as parameter and changing the values
        System.out.println(s1.rollno + " " + s1.name); //prints 100 John
    }
}
```
- In the example above, the `change()` method changes the values of the object's attributes. This is because the object is passed by reference.
---

## Passing arguments
- A method can take parameters. Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.
- The following example has a method that takes a name as a parameter. When the method is called, we pass along a first name, which is used inside the method to print the full name:
```java
class Student{
    int rollno;
    String name;
    void setName(String name){
        this.name = name;
    }
}
public class Main{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setName("John"); // Passing argument to set name of student
        System.out.println(s1.name); // prints John
    }
}
```
- There are two ways to pass arguments to a method:
    - **Pass by value** - The method receives a copy of the value.
    - **Pass by reference** - The method receives a reference to the variable.
- Example of pass by reference and pass by value in a single code snippet:
```java
class Student{
    int rollno;
    String name;
    void setName(String name){
        this.name = name;
    }
}
class Example{
    void change(Student s){ // pass by reference
        s.rollno = 100;
        s.name = "John";
    }
    void change(int rollno){ // pass by value
        rollno = 100;
    }
    public static void main(String args[]){
        Student s1 = new Student();
        s1.rollno = 10;
        s1.name = "Raj";
        Example e = new Example();
        e.change(s1); // pass by reference
        e.change(s1.rollno); // pass by value
    }
}
```  

---
## Returning Objects
- You can return an object from a method.
- When an object is returned, the return value is the reference to the object.
```java
class Student{
    int rollno;
    String name;
    void setName(String name){
        this.name = name;
    }
}
class Example{
    Student getStudent(){
        Student s = new Student();
        s.rollno = 10;
        s.name = "John";
        return s;
    }
    public static void main(String args[]){
        Student s1 = new Student();
        Example e = new Example();
        s1 = e.getStudent();
        System.out.println(s1.rollno + " " + s1.name); // prints 10 John
    }
}
```  

---
## Method Overloading
- Method overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different.
- The conditions are that each method must have a different argument list (number of parameters or type of parameters or both).
- The following example has two methods with the same name, but different parameters:
```java
class Student{
    int rollno;
    String name;
    void setName(String name){
        this.name = name;
    }
    void setName(int rollno){
        this.rollno = rollno;
    }
}
```

---
## Constructor Overloading
- Constructor overloading is a feature that allows a class to have more than one constructor having different argument lists.
- The conditions are that each constructor must have a different argument list (number of parameters or type of parameters or both).
- The following example has two constructors with the same name, but different parameters:
```java
class Student{
    int rollno;
    String name;
    Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    Student(String name){
        this.name = name;
    }
}
```  
- This allows you to create objects with different initializations.  
---
## Understanding `static`
- The `static` keyword in Java is used for memory management mainly. We can apply `static` keyword with variables, methods, blocks and nested class.
- The static keyword belongs to the class than an instance of the class.
- It is loaded into memory when the program starts, and it is shared by all the instances of the class.
- Static methods can be called without creating an object of the class.
- Static methods can access only static data. And can change the value of static data.
- Example of static method:
```java
class Example{
    static void myMethod(){
        System.out.println("Static method called");
    }
    void myMethod2(){
        System.out.println("Non static method called");
    }
    public static void main(String args[]){
        myMethod(); // calling static method
        Example e = new Example();
        e.myMethod2(); // calling non static method
    }
}
```  

---
## Variable-Length Arguments
- The variable-length argument is a feature that allows you to pass a variable number of arguments to a method.
- The variable-length argument must be the last parameter in the argument list.
- The variable-length argument is declared using the ellipsis (...) notation.
- The following example has a method that takes a variable number of integer arguments:
```java
class Cricket{
    int runs;
    void setRuns(int ...runs){
        // sum all the values of the argument list
        int sum = 0;
        for(int i : runs){
            sum += i;
        }
        this.runs = sum;
    }
}
```
- In the above example, the `setRuns()` method takes a variable number of integer arguments. The method sums all the values of the argument list and stores the result in the `runs` attribute.  

---
_**End of Part 2 - End of Unit 2**_