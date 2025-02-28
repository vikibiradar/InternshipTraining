package org.vikram;

public class test {
	public static void main(String[] args) 
	{
	Employee ob=new Employee();
	ob.setEmpno(101);
	ob.setName("Vikram");
	ob.setAddress("Pune");
	ob.setSalary(34000.90f);
	System.out.println("the empno is "+ob.getEmpno());
	System.out.println("the name is "+ob.getName());
	System.out.println("the address is "+ob.getAddress());
	System.out.println("the salary is "+ob.getSalary());
	}

}
