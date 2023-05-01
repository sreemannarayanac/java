import java.util.Scanner;

public class Q11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read a string using nextLine()
    System.out.print("Enter a string: ");
    String line = scanner.nextLine();
    System.out.println("You entered: " + line);

    // Read a string using next()
    System.out.print("Enter another string: ");
    String word = scanner.next();
    System.out.println("You entered: " + word);

    // Add a CharSequence to a String
    CharSequence charSeq = " world!";
    String newString = line + charSeq;
    System.out.println("The new string is: " + newString);

    scanner.close();
  }
}
