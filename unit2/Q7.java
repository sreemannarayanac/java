// Illustrate the usage of 'this', 'final' and 'finalize' usinga a java program.

class Main {
    int price = 1000;
    final int tax = 10;
    void getPrice(int price){
        System.out.println("Price passed as argument: "+price);
        System.out.println("Price passed of Object: "+this.price);
    }
    public static void main(String args[]) {
        Main obj = new Main();
        System.out.println("Price is: " + obj.price);
        System.out.println("Tax is: " + obj.tax);
        obj.price = 2000;
        // obj.tax = 20; // error: cannot assign a value to final variable tax
        System.out.println("Price is: " + obj.price);
        System.out.println("Tax is: " + obj.tax);
        System.out.println("");
        obj.getPrice(13435);
        obj.finalize();
        obj = null;
        System.gc();
    }
    public void finalize() {
        System.out.println("Finalize method called");
    }
}
