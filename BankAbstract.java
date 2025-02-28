package org.vikram;
import  java.util.*;

abstract class  Abstract{
	abstract void details();
	abstract void withdraw();
	abstract void deposit();
	int acc_no,balance;
	String name;
}

public class BankAbstract extends Abstract {
	
	static Scanner ob=new Scanner(System.in);
	
	@Override
	void details(){
			System.out.println("Enter Details accno, Name, Amount: ");
			acc_no=ob.nextInt();
			name=ob.next();
			balance=ob.nextInt();
			if (balance<1000) {
				System.out.println("Minimun deposit limit is 1000, Please Enter amount greater than 1000.");
				balance =ob.nextInt();
			}		
	}
	@Override
	void deposit() {
		System.out.println("How much to deposit:");
		int money=ob.nextInt();
		balance = balance+money;
	}
	@Override
	void withdraw() {
		System.out.println("Enter Amout to Withdraw:");
		int m=ob.nextInt();
		if (balance-m <1000) {
			System.out.println("Could not withdraw,Minimun balance is voilated.");
			
		}
		else {
			balance=balance-m;
			System.out.println("Sucessfully Withdrawed "+m+"Rs.");
			System.out.println("Total Balance Remained "+balance);
			
		}
	}
	
	@Override
	public String toString() {
		return "Details are Acount Number =" + acc_no  + ", name=" + name + ", balance=" + balance ;
	}
	public static void main(String[]args) {
		BankAbstract c1=new BankAbstract();
		c1.details();
		int ch;
		do{ System.out.println("");
			System.out.println("* * * ICICI BANK * * *");
			System.out.println("");
			System.out.println("1. View Details");
			System.out.println("2.Deposit Money");
			System.out.println("3.Withdraw Money");
			System.out.println("4.Exit");
			System.out.print("Enter Operation: ");
			ch=ob.nextInt();
			switch(ch) { 
			case 1: System.out.println(c1.toString());break;
			case 2:c1.deposit();break;
			case 3:c1.withdraw();break;
			case 4: break;
			
			
			default: System.out.println("Invalid choice");
			}
			
		}while(ch!=4);
	}
	

}
