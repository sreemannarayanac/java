# Arrays and Strings
## Part 1 (Arrays)
## Table of Contents
- [1D Arrays](#1d-arrays)
- [Multidimensional Arrays](#multidimensional-arrays)
- [Irregular Arrays](#irregular-arrays)  
- [Multi-dimensional Arrays v/s Jagged Arrays](#multidimensional-arrays-vs-jagged-arrays)
- [Array References](#array-references)
- [Using the Length Member](#using-the-length-member)
- [.Arrays Class of java.util package](#arrays-class-of-javautil-package)
- [Array Lists](#array-lists)
- [Array Lists v/s Arrays](#array-lists-vs-arrays)
- [Vector Class](#vector-class)
---
## 1D Arrays
- An array is a collection of similar type of elements which are stored in contiguous memory locations.
- The elements of an array are accessed using an index.
- Example:
```java
int[] arr = new int[5];
```  
---
## Multidimensional Arrays
- A multidimensional array is an array of arrays.
- These arrays are also known as **matrices**.
- Example:
```java
int[][] arr = new int[3][3];
```  
- The above code creates a 3x3 matrix.  

---
## Irregular Arrays
- An array of arrays is known as a **jagged array** or **irregular array**.
- This is an array of arrays of different sizes.
- This is useful when we don't know the size of the array in advance.
- Example:
```java
int[][] arr = new int[3][];
arr[0] = new int[3];
arr[1] = new int[4];
arr[2] = new int[2];
```
- The above code creates a jagged array of size 3. And each row has different number of columns.  

---
## Multi-dimensional Arrays v/s Jagged Arrays 
| Multi-dimensional Arrays | Jagged Arrays |
| --- | --- |
| - A multi-dimensional array is an array of arrays. | - An array of arrays is known as a jagged array or irregular array. |
| - These arrays are also known as **matrices**. | - This is an array of arrays of different sizes. |
|- Speed is faster than jagged arrays. | - Speed is slower than multi-dimensional arrays. |
|- It is easy to implement. | - It is difficult to implement. |
|- It is easy to traverse. | - It is difficult to traverse. |  

---
## Array References
- Array References are used to refer to the array elements.
- It is similar to pointers in C/C++. 
- It is used to access the array elements.
- Example:
```java
int[] arr = new int[5];
arr[0] = 10;
arr[1] = 20;
arr[2] = 30;
arr[3] = 40;
arr[4] = 50;
```
- The above code creates an array of size 5 and assigns values to the array elements.
- We can also use array references to access the array elements.
- Example:
```java
System.out.print("Element 1 is "+arr[0]);
System.out.print("Element 2 is "+arr[1]);
System.out.print("Element 3 is "+arr[2]);
System.out.print("Element 4 is "+arr[3]);
System.out.print("Element 5 is "+arr[4]);
```  
---
## Using the Length Member
- The length member of an array is used to get the size of the array.
- Example:
```java
int[] arr = new int[5];
System.out.println("Size of the array is "+arr.length);
```
- The above code creates an array of size 5 and prints the size of the array.  

---
## .Arrays Class of java.util package
- The java.util.Arrays class provides methods to perform operations on arrays.
- Some of them are: 
    - `sort()`
    - `binarySearch()`
    - `fill()`
    - `equals()`
    - `toString()`
    - `copyOf()`
- Example:
```java
int[] arr = new int[5];
arr[0] = 10;
arr[1] = 20;
arr[2] = 30;
arr[3] = 40;
arr[4] = 50;
System.out.println("Array elements are: "+Arrays.toString(arr));
```
- The above code creates an array of size 5 and prints the array elements as a string. The output is:  
```java
Array elements are: [10, 20, 30, 40, 50]
```  

---
## Array Lists
- An array list is a dynamic array.
- It is similar to an array but it can grow or shrink in size.
- It is a part of the java.util package.
- Example:
```java
ArrayList<Integer> arr = new ArrayList<Integer>();
```
- The above code creates an array list of type Integer.
- Example of an array of grades:
```java
ArrayList<Integer> grades = new ArrayList<Integer>();
grades.add(10);
grades.add(20);
grades.add(30);
```
- The above code creates an array list of type Integer and adds elements to it.
- To remove an element from the array list, we use the `remove()` method.
- Example:
```java
grades.remove(1);
```
- The above code removes the element at index 1 from the array list.  

---
## Array Lists v/s Arrays
| Arrays | Array Lists |
| --- | --- |
| - Arrays are fixed in size. | - Array lists are dynamic in size. |
| - Arrays are faster than array lists. | - Array lists are slower than arrays. |
| - Not suitable for frequent insertions and deletions. | - Suitable for frequent insertions and deletions. |
| - Dynamic memory allocation is not possible. | - Dynamic memory allocation is possible. |
| - Similar to C/C++ arrays. | - Similar to C++ vectors. |  

---
## Vector Class
- The Vector class is similar to the array list class.
- It is also a part of the java.util package.
- Example:
```java
Vector<Integer> vec = new Vector<Integer>();
```
- The above code creates a vector of type Integer.
- Main benefits of using the Vector class are:
    - It is synchronized.
    - It is thread safe.
    - It is legacy class.
- Differences between the Vector class and the Array List class:
    - Vector is synchronized whereas Array List is not.
    - Vector is thread safe whereas Array List is not.
    - Vector is legacy class whereas Array List is not.
- It is used when we want to use the legacy class. 
- Legacy class is a class that is present in the older versions of Java. This helps in backward compatibility which means that the code written in the older versions of Java can be used in the newer versions of Java. This enables the developers to use the older code in the newer versions of Java.  

---
_**End of Unit 3 Part 1 (Arrays)**_