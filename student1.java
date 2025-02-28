package org.vikram;
import java.util.*;
public class student1 {
	String rollno,name,address;
	void input() {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the Roll no: ");
		rollno=ob.nextLine();
		name=ob.nextLine();
		address=ob.nextLine();
		
	}
	void display() {
		System.out.println("The Name is  "+name);
		System.out.println("the Address is "+ address);
		System.out.println("The Roll no is "+ rollno);
	}
	public static void main(String[]args) {
		student1 s1= new student1();
		s1.input();
		s1.display();
		
	}

}
