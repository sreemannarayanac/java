import java.util.Scanner;

public class Q13 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read a string from the user
    System.out.print("Enter a string: ");
    String str = scanner.nextLine();

    // Replace all vowels with '$' symbol
    String replacedStr = str.replaceAll("[aeiouAEIOU]", "\\$");

    // Print the replaced string
    System.out.println("The replaced string is: " + replacedStr);

    scanner.close();
  }
}
