// How to pass variable length arguments in java, illustrate with an example.

class Q9 {
    
    void sum(int... a) {
        int sum = 0;
        // using enhanced for loop
        for (int i : a) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        Q9 obj = new Q9();
        obj.sum(1, 2, 3, 4, 5);
        obj.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}
