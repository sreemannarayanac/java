// Create a class Student with attributes roll no, name, age and course. Initialize values 
// through parameterized constructor. If age of student is not in between 15 to 21 then
// throw an exception AgeNotWithinRangeException. If name contains numbers or special 
// symbols raise an exception NameNotValidException. Define the two exception classes

class Student {
    int rollNo;
    String name;
    int age;
    String course;

    Student(int rollNo, String name, int age, String course) throws NameNotValidException, AgeNotWithinRangeException {
        this.rollNo = rollNo;

        if (name.matches(".*\\d.*")) {
            throw new NameNotValidException("Name not valid");
        } else {
            this.name = name;
        }

        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age not within range");
        } else {
            this.age = age;
        }

        this.course = course;
    }

    // Exception classes
    static class AgeNotWithinRangeException extends Exception {
        AgeNotWithinRangeException(String msg) {
            super(msg);
        }
    }

    static class NameNotValidException extends Exception {
        NameNotValidException(String msg) {
            super(msg);
        }
    }
}

public class Q6{
    public static void main(String args[]) {
        try {
            Student s = new Student(1, "John", 20, "B.Tech");
            System.out.println("Student details:");
            System.out.println("Roll no: " + s.rollNo);
            System.out.println("Name: " + s.name);
            System.out.println("Age: " + s.age);
            System.out.println("Course: " + s.course);
        } catch (Student.NameNotValidException | Student.AgeNotWithinRangeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Testing exceptions
        try {
            Student s1 = new Student(2, "John2", 20, "B.Tech");
        } catch (Student.NameNotValidException | Student.AgeNotWithinRangeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            Student s2 = new Student(3, "John", 22, "B.Tech");
        } catch (Student.NameNotValidException | Student.AgeNotWithinRangeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}