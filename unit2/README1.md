# Introduction to Classes Objects and Methods
## Part 1
## What are classes?
- A class is a blueprint for creating objects.
- A class is a user-defined data type.
- A class is a collection of variables and methods.
- A class is a template for creating objects.
## What are objects?
- An object is an instance of a class.
- An object is a real world entity.
- An object is a collection of data and methods.
## Object creation
- An object is created using the `new` keyword.
```java
class Student{
    int rollno;
    String name;
}
public class Main{
    public static void main(String[] args){
        Student s1 = new Student(); // Object creation
        Student s2 = new Student();
    }
}
```
---
## Reference variables and assignment
- A reference variable is a variable that refers to an object.
- A reference variable is declared to be of a specific type that cannot be changed.
```java
// example of reference variable
class Student{
    int rollno;
    String name;
}
public class Main{
    public static void main(String[] args){
        Student s1 = new Student(); // Object creation
        Student s2 = new Student();
        s1 = s2; // s1 is now referring to s2
    }
}
```
- **Assignment**: Create a class `Student` with variables `rollno` and `name`. Create two objects of the class `Student` and assign the values to the variables of the objects.
---
## Methods
A method is a collection of statements that perform a specific task. A method is a block of code which only runs when it is called. You can pass data, known as parameters, into a method. Methods are used to perform certain actions, and they are also known as functions. Why use methods? To reuse code: define the code once, and use it many times.

---
## Returning a value
A method can return a value. The return type of a method must be the same as the data type of the value the method returns. To return a value, use the return keyword followed by a return value:
```java
class Student{
    int rollno;
    String name;
    int getRollno(){
        return rollno;
    }
}
public class Main{
    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println(s1.getRollno());
    }
}
```
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
        s1.setName("John");
        System.out.println(s1.name);
    }
}
```
---
## Constructors
- A constructor is a special method that is used to initialize objects.
- The constructor is called when an object of a class is created.
- It can be used to set initial values for object attributes:
```java
class Student{
    int rollno;
    String name;
    Student(){
        this.rollno = 1000;
        this.name = "Spiderman";
    }
}
public class Main{
    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println(s1.rollno); // prints 1000
        System.out.println(s1.name); // prints Spiderman
    }
}
```
### Parameterised constructors
- A constructor can take parameters. This is called a parameterized constructor.
- A constructor can have any number of parameters.
```java
class Student{
    int rollno;
    String name;
    Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
}
public class Main{
    public static void main(String[] args){
        Student s1 = new Student(1, "John");
        System.out.println(s1.rollno); // prints 1
        System.out.println(s1.name); // prints John
    }
}
```
---
## `new` Keyword
- The `new` keyword is used to create an object.
- The `new` keyword is also used to allocate memory at runtime.
- The `new` keyword is used to call a constructor.
```java
class Student{
    int rollno;
    String name;
}
public class Main{
    public static void main(String[] args){
        Student s1 = new Student(); // Object creation
        Student s2 = new Student();
    }
}
```
## `this` keyword
- The `this` keyword refers to the current object.
- The `this` keyword can be used to refer to the current instance of the class.
- The `this` keyword can be used to invoke the current class method (implicitly).
```java
class Student{
    int rollno;
    String name;
    Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
}
public class Main{
    public static void main(String[] args){
        Student s1 = new Student(1, "John");
        System.out.println(s1.rollno); // prints 1
        System.out.println(s1.name); // prints John
    }
}
```
## `finalize()` method
- The `finalize()` method is called by the garbage collector on an object when garbage collection determines that there are no more references to the object.
```java
class Student{
    int rollno;
    String name;
    public void finalize(){
        System.out.println("Object is garbage collected");
    }
}
public class Main{
    public static void main(String[] args){
        Student s1 = new Student();
        s1 = null;
        System.gc();
    }
}
```
---
## Wrapper Classes
- Wrapper classes are used to convert primitive data types into objects.
- Wrapper classes are immutable.
```java
// example of wrapper classes
int a = 10;
Integer A = Integer.valueOf(a); // converting int into Integer
Integer B = a; // autoboxing, now compiler will write Integer.valueOf(a) internally
System.out.println(a + " " + A + " " + B);
```
## Autoboxing
Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes.
```java
// example of autoboxing
Integer a = 10; // now compiler will write Integer.valueOf(a) internally
```
## Unboxing
Unboxing is the reverse process of autoboxing. Unboxing is the automatic conversion that the Java compiler makes between the wrapper classes and their corresponding primitive types.
```java
// example of unboxing
Integer a = new Integer(3);
int b = a; // now compiler will write a.intValue() internally which converts Integer to int
```
---
## I/O Command line arguments
Command line arguments are passed to the main() method of a program. The main() method is the starting point of any Java program. The main() method is declared as follows:
```java
public static void main(String[] args)
```
```bash
javac Main.java xyz open abc
```
## Scanner and Buffered Reader Classes
- The Scanner class is used to get user input, and it is found in the java.util package.
- The BufferedReader class is used to read text from a character-based input stream.
```java
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = sc.nextInt();
        String s = br.readLine();
        System.out.println(a + " " + s);
    }
}
```
---
_**End of the document**_