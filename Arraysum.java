package org.vikram;
import java.util.*;

public class Arraysum {
	public static void main(String[]args) {
		float a[]=new float[5];
		float sum=0.0f;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter 5 numbers: " );
		for (int i=0;i<5;i++){
			a[i]=ob.nextFloat();
			sum = sum+ a[i];			
		}
		System.out.println("The sum is :" + sum);
	}
}
