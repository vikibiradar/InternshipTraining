package org.vikram;
import java.util.*;

public class Calculator {
	public static void main(String[]args) {
		Scanner ob =new Scanner(System.in);
		System.out.print("Enter the 1st Number: ");
		int x=ob.nextInt();
		System.out.print("Enter the 2nd Number: ");
		int y=ob.nextInt();
		System.out.println("Select the Operation");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Divide");
		System.out.println("5.Remainder");
		int choice= ob.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Addition of Number is "+(x+y));
		case 2:
			System.out.println("Substraction of two numbers is "+(x-y));
		case 3:
			System.out.println("Multiplication of numers is "+(x*y));
		case 4:
			System.out.println("Divison of the numbers is "+(x/y));
		case 5:
			System.out.println("Remainder after dividing "+x+" by "+y+" is "+(x%y));
		}
		
		
	}

}
