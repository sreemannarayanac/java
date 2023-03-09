# Java Programming Fundamentals
## What is Java?
Java is a programming language and computing platform first released by Sun Microsystems in 1995. There are lots of applications and websites that will not work unless you have Java installed, and more are created every day. Java is fast, secure, and reliable. From laptops to datacenters, game consoles to scientific supercomputers, cell phones to the Internet, Java is everywhere!
## What is Object Oriented Programming?  
Object-oriented programming (OOP) is a programming language model organized around objects rather than "actions" and data rather than logic. Object-oriented programming aims to implement real-world entities like inheritance, hiding, polymorphism etc in programming. The main aim of OOP is to bind together the data and the functions that operate on them so that no other part of the code can access this data except that function.  
## What are key attributes of Object Oriented Programming?
- **Abstraction**: Abstraction is the process of hiding the implementation details and showing only functionality to the user. In other words, the user will have the information on what the object does instead of how it does it.
- **Inheritence**: Inheritance is a way to form new classes using classes that have already been defined. The newly formed classes are called derived classes, the classes that we derive from are called base classes. Important properties of inheritance are: It provides reusability of a code. It is transitive in nature, which means that if class B inherits from another class A, then all the subclasses of B would automatically inherit from class A.
- **Polymorphism**: Polymorphism is the ability of a message to be displayed in more than one form. Polymorphism is considered as one of the important features of Object Oriented Programming. Polymorphism is used to perform a single action in different ways. Polymorphism is derived from two Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. Thus, polymorphism means many forms.
- **Encapsulation**: Encapsulation is the mechanism that binds together code and the data it manipulates, and keeps both safe from outside interference and misuse. To prevent accidental or unauthorized access to data, encapsulation is used. Encapsulation is used to hide the values or state of a structured data object inside a class, preventing unauthorized parties' direct access to them.
---
## What is Java Development Kit?
Java Development Kit (JDK) is a software development environment used for developing Java applications and applets. It contains the complete implementation of the Java Platform, Standard Edition, and also additional tools and libraries.
### JDK Components
- **Java Compiler**: The Java compiler is a program that converts Java source code into Java bytecode. The Java compiler is a part of the Java Development Kit (JDK). The Java compiler is also known as the Java Virtual Machine (JVM).
- **Java Runtime Environment**: The Java Runtime Environment (JRE) is a set of software tools that allows users to run Java applications. The JRE consists of the Java Virtual Machine (JVM), Java platform core classes, and supporting Java platform libraries.
- **Java Virtual Machine**: The Java Virtual Machine (JVM) is a specification that provides a runtime environment in which Java bytecode can be executed. The JVM is a crucial component of the Java platform. The JVM is a specification, not an implementation. The JVM is a specification that provides a runtime environment in which Java bytecode can be executed. The JVM is a crucial component of the Java platform. The JVM is a specification, not an implementation.
---
## What are Keywords, identifiers, literals, and comments?
- **Keywords**: Keywords are the reserved words in Java. We cannot use a keyword as an identifier, it should be a unique name. There are 50 keywords in Java.
- **Identifiers**: An identifier is a name used to identify a class, method, variable, or any other user-defined item. An identifier starts with a letter A to Z or a to z or an underscore (_) followed by zero or more letters, underscores, and digits (0 to 9).
- **Literals**: Literals are the source code representation of fixed values. Literals can appear in Java programs in several forms. A literal can be a decimal integer, octal integer, hexadecimal integer, floating-point number, character, string, Boolean, or null.
- **Comments**: Comments are used to explain Java code, and to make it more readable. Comments can be used to prevent execution when testing alternative code. Comments are ignored by the Java compiler.
---
## What are the java class libraries?
Java class libraries are a set of prewritten classes that are used to perform common tasks. These classes are part of the Java API. The Java API is a collection of prewritten classes that are used to perform common tasks. The Java API is divided into several packages.  
Some examples of java class libraries are: java.io, java.util, java.lang, etc.

---
## Scope and lifetime of variables
- **Scope**: The scope of a variable is the region of the program where the variable is defined. The scope of a variable determines the visibility of the variable within the program. The scope of a variable can be either local or global.
- **Lifetime**: The lifetime of a variable is the period during which the variable exists in the memory. The lifetime of a variable starts when the variable is created and ends when the variable is destroyed.

---
## Operators
- **Arithmetic Operators**: Arithmetic operators are used in mathematical expressions in the same way that they are used in algebra. The arithmetic operators are: +, -, *, /, %, ++, --.
- **Relational Operators**: Relational operators are used to compare two values. The result of a relational operator is either true or false. The relational operators are: ==, !=, >, <, >=, <=.
- **Logical Operators**: Logical operators are used to determine the logic between variables or values. The logical operators are: &&, ||, !.
- **Bitwise Operators**: Bitwise operators are used to perform bit-by-bit operations on the operands. The bitwise operators are: &, |, ^, ~, <<, >>.
- **Assignment Operators**: Assignment operators are used in Java to assign values to variables. The assignment operators are: =, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=.

---
## Type conversion and casting
- **Type Conversion**: Type conversion is the conversion of one data type to another data type. Type conversion is also known as type casting. Type conversion is done automatically in Java. For example, converting an int to a long.
- **Type Casting**: Type casting is the conversion of one data type to another data type. Type casting is also known as type conversion. Type casting is done manually in Java. For example, converting an int to a long.
```java
// example program of type conversion
public class TypeConversion {
    public static void main(String[] args) {
        int i = 100;
        long l = i;
        float f = l;
        System.out.println("Int value "+i);
        System.out.println("Long value "+l);
        System.out.println("Float value "+f);
    }
}
```
---
## Program control structures
- **if**: The if statement is used to test the condition. It executes the if block if the condition is true.
    ```java
    if (condition) {
        // if block
    }
    ```
- **if-else**: The if-else statement is used to test the condition. It executes the if block if the condition is true. If the condition is false, it executes the else block.
    ```java
    if (condition) {
        // if block
    } else {
        // else block
    }
    ```
- **if-else-if**: The if-else-if statement is used to test the condition. It executes the if block if the condition is true. If the condition is false, it executes the next else if block. If all the conditions are false, it executes the else block.
    ```java
    if (condition1) {
        // if block
    } else if (condition2) {
        // else if block
    } else if (condition3) {
        // else if block
    } else {
        // else block
    }
    ```
- **switch**: The switch statement is used to test the equality of a variable against multiple values. It executes the code block associated with the first matching case.
    ```java
    switch (expression) {
        case value1:
            // code block
            break;
        case value2:
            // code block
            break;
        default:
            // code block
    }
    ```
- **while**: The while loop is used to iterate a part of the program several times. If the number of iteration is not fixed, it is recommended to use while loop.
    ```java
    while (condition) {
        // code block to be executed
    }
    ```
- **do-while**: The do-while loop is used to iterate a part of the program several times. If the number of iteration is not fixed and you must have to execute the loop at least once, it is recommended to use do-while loop.
    ```java
    do {
        // code block to be executed
    } while (condition);
    ```
- **for**: The for loop is used to iterate a part of the program for a limited number of times. If the number of iteration is fixed, it is recommended to use for loop.
    ```java
    for (initialization; condition; increment/decrement) {
        // code block to be executed
    }
    ```
- **break**: The break statement is used to break the loop or switch statement. It breaks the current flow of the program at specified condition.
    ```java
    for (int i = 0; i < 10; i++) {
        if (i == 4) {
            break;
        }
        System.out.println(i);
    }
    ```
- **continue**: The continue statement is used to continue the loop. It continues the current flow of the program and skips the remaining code at specified condition.
    ```java
    for (int i = 0; i < 10; i++) {
        if (i == 4) {
            continue;
        }
        System.out.println(i);
    }
    ```
- **Enhanced for**: The enhanced for loop is used to traverse array or collection in Java. It is easier to use than the normal for loop.
    ```java
    for (type variableName : arrayName) {
        // code block to be executed
    }
    ```
---
_**End of Unit 1**_