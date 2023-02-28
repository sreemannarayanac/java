// Program to implement a Book class that stores the details of a book such as its code, title and price (Use constructor to initialize the object)
import java.util.Scanner;

class Book {
	Scanner inp = new Scanner(System.in);
	String code;
	String title;
	double price;
	boolean status; // available (true) else (false)
	
	Book () {
		System.out.println("__________Enter book details__________");
		System.out.print("Enter Code: "); code = inp.nextLine();
		System.out.print("Enter Title: "); title = inp.nextLine();
		System.out.print("Enter Price: "); price = inp.nextDouble();
		status = true;
	}
	
	void getDetails() {
		System.out.println("__________Information of the book__________");
		System.out.println("Code: "+code);
		System.out.println("Title of the book: "+title);
		System.out.println("Price: "+price);
	}

	void getStatus() {
		if (status == true) {
			System.out.println("The book is presently not available to lend");
		} else {
			System.out.println("The book is presently available");
		}
	}
	
	void changeStatus() {
		System.out.println("__________Change Status__________");
		System.out.print("Present Status: ");
		if (status == true) {
			System.out.print("available.");
		} else {
			System.out.print("not available.");
		}
		System.out.print("\nDo you want to change the status? Enter [Y] to change: ");
		char choice = inp.nextLine().charAt(0);
		if (choice == 'Y' || choice == 'y') {
			if (status == true) {
				status = false;
			} else {
				status = true;
			}
		}
	}
}

class Q5 {
	public static void main (String args[]) {
		Scanner inp = new Scanner(System.in);
		Book b1 = new Book();
		b1.getDetails();
		b1.getStatus();
		b1.changeStatus();
		b1.getStatus();
	}
}
