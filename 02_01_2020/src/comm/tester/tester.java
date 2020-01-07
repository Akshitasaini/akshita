package comm.tester;

import java.util.Scanner;

import comm.create.Account;
import comm.create.AccountType;

public class tester {

public static void main (String[] args) {
	/*
	Employee e = Employee.createEmployee(100, "john", 12000);
	System.out.println(e.displayEmployeeDetails());
	
	Account account = Account.createAccount(AccountType.CREDIT_CARD, 100000);
	System.out.println(account.displayAccount());
*/

	int choice = -1;
	Account account = null;
	Scanner sc = new Scanner(System.in);
	do {
		System.out.println("1.create account.");
		System.out.println("2.display account.");
		System.out.println("0.exit.");
		System.out.println("choose your choice.>>>>");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				account = Account.createAccount(AccountType.CREDIT, 10000);
				break;
			case 2:
				System.out.println(account.displayAccount());
				break;
			case 0:
				System.out.println("existing from the system");
				System.exit(0);
				default:
					System.out.println("invaild choice..");
					break;
				
				
			
		}
	}
		while(choice!=0);
}
}
