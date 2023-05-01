import java.util.Scanner;

public class Q14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read a text string from the user
    System.out.print("Enter a text string: ");
    String text = scanner.nextLine();

    // Read a search string from the user
    System.out.print("Enter a search string: ");
    String search = scanner.nextLine();

    // Count the number of occurrences of the search string in the text string
    int count = 0;
    int index = text.indexOf(search);
    while (index != -1) {
      count++;
      index = text.indexOf(search, index + 1);
    }

    // Print the number of occurrences of the search string
    System.out.println("The number of occurrences of the search string is: " + count);

    scanner.close();
  }
}
