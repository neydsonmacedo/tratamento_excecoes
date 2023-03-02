package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number:");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder:");
		String holder = sc.nextLine();
		System.out.print("Initial Balance:");
		double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit:");
		double withdrawLimit = sc.nextDouble();
			
		Account conta = new Account(number,holder,initialBalance,withdrawLimit);
			
		System.out.print("Enter amount for withdraw:");
		double withdraw = sc.nextDouble();

			
			
		try {
			conta.withdraw(withdraw);
			System.out.println("New balance: " + conta.getBalance());
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		
		catch(RuntimeException e) {
			System.out.println("Unexpected error"); 
		}
		

		
		
		
		sc.close();
		

	}

}
