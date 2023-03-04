// Illustrate the usage of 'this', 'final' and 'finalize' usinga a java program.

class Q7 {
    int price = 1000;
    final int tax = 10;
    public static void main(String args[]) {
        Q7 obj = new Q7();
        System.out.println("Price is: " + obj.price);
        System.out.println("Tax is: " + obj.tax);
        obj.price = 2000;
        // obj.tax = 20; // error: cannot assign a value to final variable tax
        System.out.println("Price is: " + obj.price);
        System.out.println("Tax is: " + obj.tax);
        obj.finalize();
        obj = null;
        System.gc();
    }
    public void finalize() {
        System.out.println("Finalize method called");
    }
}