package org.vikram;
import java.util.*;

public class arraydemo {
	public static void main(String[]args) {
		int a[]=new int[5];
		int sum=0;
		Scanner ob= new Scanner(System.in);
		System.out.print("Enter 5 numbers:");
		for ( int i=0;i<5;i++) {
			a[i]=ob.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum of 5 numers is "+sum);
	}

}
