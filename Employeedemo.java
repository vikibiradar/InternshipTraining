package org.vikram;
import java.util.*;

class employee1{
	int empno;
	String name,address;
	public employee1(int empno,String name, String address) {
		this.empno=empno;
		this.name=name;
		this.address=address;
		
	}
	void display() {
		System.out.println("The empno is "+empno+" The name is "+name+" The address is "+address);
		
	}
}
class Dept extends employee1{
	String loc,designation,dept;

	public Dept(int empno, String name, String address, String loc, String designation, String dept) {
		super(empno, name, address);
		this.loc = loc;
		this.designation = designation;
		this.dept = dept;
	}
	void display() {
		super.display();
		System.out.println("the location is "+loc+" the designation is "+designation+" The deptment is "+dept);
	}
	
}
	
class Salary extends Dept{
	float salary;

	public Salary(int empno, String name, String address, String loc, String designation, String dept, float salary) {
		super(empno, name, address, loc, designation, dept);
		this.salary = salary;
	}
	void display() {
		super.display();
		System.out.println("the salary is "+salary); 
	}
	
}

public class Employeedemo extends Salary {
	
	public Employeedemo(int empno, String name, String address, String loc, String designation, String dept,
			float salary) {
		super(empno, name, address, loc, designation, dept, salary);
	}

	public static void main(String[]args) {
		Employeedemo e1 = new Employeedemo(334,"Vikram","Pune","Lohagoan","Kharadi","IT",15000f);
		e1.display();
	}

}
