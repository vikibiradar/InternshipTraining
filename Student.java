package org.vikram;
import java.util.*;
public class Student {
	int rollno;
	String name,address;
	void input() {
		Scanner ob =new Scanner(System.in);
		System.out.println("Enter Roll no, name , Address");
		rollno=ob.nextInt();
		name=ob.next();
		address=ob.next();
		
	}
	void display() {
		System.out.println("The roll no is "+rollno);
		System.out.println("The name is "+name);
		System.out.println("The address is "+address);
		
	}
	public static void main(String[]args) {
		Student s1= new Student();
		s1.input();
		s1.display();
		System.out.println(s1.rollno);
	}
}
