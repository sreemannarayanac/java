// Write a program to implement the concept of dynamic method dispatch.

class Hero {
    public void display() {
        System.out.println("Hero");
    }
}

class Q8 extends Hero {
    public void display() {
        System.out.println("Spiderman");
    }
    public static void main(String args[]) {
        Hero h = new Hero();
        h.display();
        Q8 q = new Q8();
        q.display();
        h = q;
        h.display();
    }
}
