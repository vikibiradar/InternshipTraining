package org.vikram;

abstract class bank1{
	abstract void loan();
	abstract void register();
	void balance() {
		System.out.println("Icici Bank");
	}
	
}

public class Abstractclass extends bank1{
	@Override
	void register() {
		System.out.println("Registration Page");
		
	}
	@Override
	void loan() {
		System.out.println("Loan Page");
		
	}
	public static void main(String[]args) {
		Abstractclass a= new Abstractclass();
		a.register();
		a.loan();
		a.balance();
	}

	
}
