/*Design a vehicle class hierarchy in Java, and develop a program to demonstrate Polymorphism*/

abstract class Vehicle {
    public abstract void move();
}

class Car extends Vehicle {
    public void move() {
        System.out.println("Car is moving");
    }
}

class Bike extends Vehicle {
    public void move() {
        System.out.println("Bike is moving");
    }
}

public class Q7 {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Bike();

        vehicle1.move();
        vehicle2.move();
    }
}