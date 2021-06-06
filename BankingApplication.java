package bank;

import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args)
	{
		BankAccount obj1= new BankAccount("Ajay","BA1234");
		obj1.showMenu();
	}

	}
	class BankAccount
	{
		int balance;
		int previoustransaction;
		String customername;
		String customerID;
		
		BankAccount(String cname,String cid)
		{
			customername=cname;
			customerID=cid;
		}
		
		void deposit(int amount)
		{
			if(amount!=0) 
			{
			balance=balance+amount;
			previoustransaction= amount;
		    }
		}
		
		void withdraw(int amount)
		{
			if(amount!=0) 
			{
			balance=balance-amount;
			previoustransaction= - amount;
		    }
		}
		void getprevioustransaction()
		{
			if(previoustransaction > 0)
			{
				System.out.println("Deposited :" +previoustransaction);
			}
			else if(previoustransaction < 0)
			{
				System.out.println("withdrawn: " +Math.abs(previoustransaction));
			}
			else
			{
				System.out.println("No transaction occured");
			}
			
		}
		void showMenu()
		{
			char option='\0';
			Scanner scanner =new Scanner(System.in);
			
			System.out.println("Welcome " +customername);
			System.out.println("Yout ID id "+customerID);
			System.out.println("\n");
			System.out.println("A.Check Balance");
			System.out.println("B.Deposit");
			System.out.println("C.Withdraw");
			System.out.println("D.Previous transcation");
			System.out.println("E.		Exit");
			
			do 
			{
				System.out.println("======================================================");
				System.out.println("Ennter an option");
				System.out.println("======================================================");
				option =scanner.next().charAt(0);
				System.out.println("\n");
				
				switch(option)
				{
				
				case 'A' :
					System.out.println("---------------");
					System.out.println("Balance = "+ balance);
					System.out.println("---------------");
					System.out.println("\n");
					break;
					
				case 'B' :
					System.out.println("---------------");
					System.out.println("Enter an amount to deposit: ");
					System.out.println("---------------");
					int amount =scanner.nextInt();
					deposit(amount);
					System.out.println("\n");
					break;
					
				case 'C' :
					System.out.println("---------------");
					System.out.println("Enter an amount to withdraw: ");
					System.out.println("---------------");
					int amount2 =scanner.nextInt();
					withdraw(amount2);
					System.out.println("\n");
					break;
					
				case 'D' :
					System.out.println("----------------");
					getprevioustransaction();
					System.out.println("----------------");
					System.out.println("\n");
					break;
				
				case 'E' :
					System.out.println("==================================================");
					break;
					
					default:
						System.out.println("Invalid for using our services");
				}
				
			}while(option !='E');
			System.out.println("Thank you for using our services");
		}
		
	}
	






/*
OUTPUT:


Welcome Ajay
Yout ID id BA1234


A.Check Balance
B.Deposit
C.Withdraw
D.Previous transcation
E.		Exit
======================================================
Ennter an option
======================================================
A


---------------
Balance = 0
---------------


======================================================
Ennter an option
======================================================
B


---------------
Enter an amount to deposit: 
---------------
7500


======================================================
Ennter an option
======================================================
A


---------------
Balance = 7500
---------------


======================================================
Ennter an option
======================================================
C


---------------
Enter an amount to withdraw: 
---------------
500


======================================================
Ennter an option
======================================================
A


---------------
Balance = 7000
---------------


======================================================
Ennter an option
======================================================
D


----------------
withdrawn: 500
----------------


======================================================
Ennter an option
======================================================
B


---------------
Enter an amount to deposit: 
---------------
1000


======================================================
Ennter an option
======================================================
A


---------------
Balance = 8000
---------------


======================================================
Ennter an option
======================================================
C


---------------
Enter an amount to withdraw: 
---------------
200


======================================================
Ennter an option
======================================================
A


---------------
Balance = 7800
---------------


======================================================
Ennter an option
======================================================
E


==================================================
Thank you for using our services


*/
