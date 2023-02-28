/* Program that creates a class account that stores a variable balance. The class has
methods to start account, to deposit money, to withdraw money and to tell the current
balance amount. */

import java.util.Scanner;

class Account {
	private String ac_no;
	private String ac_holder_name;
	private double balance;
	private boolean savings;

	Scanner inp = new Scanner(System.in);
	
	void startAccount() {
		System.out.println("\n__________Enter details to start new account__________\n");
		System.out.print("Account number: ");
		ac_no = inp.nextLine();
		System.out.print("Account holder name: ");
		ac_holder_name = inp.nextLine();
		System.out.print("Is it a savings account(true or false): ");
		savings = inp.nextBoolean();

		balance = 0;
	}
	
	void deposit() {
		System.out.println("\n__________Deposit to your account: "+ ac_no +"__________");
		System.out.println("Current balance: "+balance);
		System.out.print("Enter amount to deposit: ");
		balance += inp.nextDouble();
		System.out.println("Amount successfully deposited. Balance = "+balance);
	}
	
	void withdraw() {
		System.out.println("\n__________Withdraw from your account: "+ ac_no +"__________");
		System.out.println("Current balance: "+balance);
		System.out.print("Enter amount to withdraw: ");
		double amt = inp.nextDouble();
		if (amt<=balance) {
			balance -= amt;
			System.out.println("Amount successfully withdrawn. Balance = "+balance);
		} else {
			System.out.println("Amount entered exceeded the balance.\n!!!Try again!!!");

		}
	}
	
	void printBalance() {
		System.out.println("\n__________Hello "+ ac_holder_name +"__________");
		System.out.println("Current balance: "+balance);
	}
	
	String getAcNum() {
		return ac_no;
	}
	
	String getAcHolderName() {
		return ac_holder_name;
	}
}

class Q4 {	
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		System.out.println("___________Welcome to GITAM Bank___________");
		System.out.print("Enter [Y] to start a bank account: ");
		char choice = inp.nextLine().charAt(0);
		Account acc = new Account();
		if (choice == 'Y' || choice == 'y') {
			acc.startAccount();
		}
		System.out.println("Welcome "+acc.getAcHolderName());
		while (true) {
			System.out.print("\nOperations\n1. Deposit Money\n2. Withdraw Money\n3. Show Balance\n4. Exit\nChoose the operation (number): ");
			int choice1 = inp.nextInt();
			switch(choice1) {
				case 1: acc.deposit(); break;
				case 2: acc.withdraw(); break;
				case 3: acc.printBalance(); break;
				case 4: System.exit(0);
				default: System.out.println("Enter valid operation number\n!!!Try again!!!\n");
			}
		}
	}
}
