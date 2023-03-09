public class AutoboxingUnboxing
{
	public static void main(String[] args) {
		System.out.println("__________Example program for autoboxing and unboxing__________");
	    Integer a = Integer.valueOf(2); // explicitly converting int to Integer
	    Integer aa = 2; // using autoboxing
	    System.out.println("\n__________example of autoboxing__________\nvalue of a (explicit conversion): "+a+"\nvalue of a (autoboxing): "+aa);
	    
	    int b = a.intValue(); // explicitly converting Integer to int
	    int bb = a;
	    System.out.println("\n__________example of unboxing__________\nvalue of b (explicit conversion): "+b+"\nvalue of b (unboxing): "+bb);
	}
}
