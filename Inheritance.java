package org.vikram;
import java.util.*;
class parent{
	int rollno;
	String name,address;
	public parent(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	void display() {
		System.out.println("The Roll No of Student is"+rollno+" , Name is "+name+" and the address is"+address);
		
	}
}

public class Inheritance extends parent{
	int phy ,chem,bio,total,avg;

	 
	public Inheritance(int rollno, String name, String address, int phy, int chem, int bio ) {
		super(rollno, name, address);
		this.phy = phy;
		this.chem = chem;
		this.bio = bio;
		this.total = phy+bio+chem;
		this.avg = total/3 ;
	}


	void display()
	{
		super.display();
		System.out.println("the physics marks is "+phy);
		System.out.println("the chemistry marks is "+chem);
		System.out.println("the biology marks is "+bio);
		System.out.println("the total marks is "+total);
		System.out.println("the Average marks is "+avg);
			}
	public static void main(String[]args) {
		Inheritance ob= new Inheritance(101,"Viki","Pune",8,32,34);
		ob.display();
	}
	 
}