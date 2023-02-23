/* Program that creates a class account that stores a variable balance. The class has
methods to start account, to deposit money, to withdraw money and to tell the current
balance amount. */

import java.util.Scanner;

class Account {
	String ac_no;
	String ac_holder_name;
	double balance;
	bool savings;

	Scanner inp = new Scanner(System.in);
	
	void startAccount() {
		System.out.println("\n__________Enter details to start new account__________\n");
		System.out.print("Account number: ");
		ac_no = inp.nextLine();
		System.out.print("Account holder name: ");
		ac_holder_name = inp.nextLine();
		System.out.print("Is it a savings account(true or false): ");
		savings = inp.nextBool();

		balance = 0;
	}
	
	void deposit(double amt) {
		System.out.println("\n__________Deposit to your account: "+ ac_no +"__________");
		System.out.println("Current balance: "+balance);
		System.out.print("Enter amount to deposit: ");
		balance += inp.nextDouble();
		System.out.println("Amount successfully deposited. Balance = "+balance);
	}
	
	double withdraw() {
		System.out.println("\n__________Withdraw from your account: "+ ac_no +"__________");
		System.out.println("Current balance: "+balance);
		System.out.print("Enter amount to withdraw: ");
		balance -= inp.nextDouble();
		System.out.println("Amount successfully withdrawn. Balance = "+balance);
		return balance;
	}
	
	void printBalance() {
		System.out.println("\n__________Hello "+ ac_holder_name +"__________");
		System.out.println("Current balance: "+balance);
	}
}

class Q4 {	
	public static void main(String args[]) {
		
	
