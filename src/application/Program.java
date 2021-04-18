package application;

import java.util.Scanner;
import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		Double initialDeposit = 0.00;
		char option, initDepositQuestion;
		BankAccount bankAccount;
		
		System.out.println("\n    -- Register a new bank account --");
		System.out.print("Type your name: ");
		name = sc.nextLine();
		
		System.out.print("\nDo you wish to make an initial deposit?\nType Y or N: ");
		initDepositQuestion = sc.next().charAt(0);
		
		if (initDepositQuestion == 'Y' || initDepositQuestion == 'y') {
			System.out.print("\nHow much do you want to deposit?\n$ ");
			initialDeposit = sc.nextDouble();
		}
		
		bankAccount = new BankAccount(name, initialDeposit);
		System.out.println("\n\n" + bankAccount.getAccountInfo() + "\n\n");
		
		do {
			System.out.println("Do you want to make a deposit or a withdraw?\n1 - Deposit\n2 - Withdraw\nAny other to exit");
			System.out.print("\nSelect an option: ");
			option = sc.next().charAt(0);
			
			switch (option) {
			case '1':
				System.out.print("\nHow much do you want to deposit? \n$ ");
				bankAccount.deposit(sc.nextDouble());
				break;
			case '2':
				System.out.print("\nHow much would you like to withdraw? \n$ ");
				bankAccount.withdraw(sc.nextDouble());
				break;
			default:
				option = 'E';
			}
			
			if (option != 'E') {
				System.out.println("\nUpdated account");
				System.out.println(bankAccount.getAccountInfo());
				option = 'Y';
			} else {
				System.out.println("\n\n\n\n\n\nClosing menu...\n\n\n\n\n\n");
			}
		} while (option == 'y' || option == 'Y');
		sc.close();

	}

}
