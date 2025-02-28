package org.vikram;

class Student{
	int rollno;
	String name,address;
	public Student(int rollno, String name, String address) {
		this.rollno=rollno;
		this.name=name;
		this.address=address;
		
	}
	void display() {
		System.out.println("The Roll no is "+ rollno+" the name is "+name+"The address is"+address);
		
	}
}
class marks extends Student{
	float phy, chem, maths;

	public marks(int rollno, String name, String address, float phy, float chem, float maths) {
		super(rollno, name, address);
		this.phy = phy;
		this.chem = chem;
		this.maths = maths;
	}
	
}

public class Studentdemo {

}
