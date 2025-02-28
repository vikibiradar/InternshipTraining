package org.vikram;

class employee2{
	int empno;
	String name,address;
	Bank bk;
	public employee2(int empno, String name, String address, Bank bk) {
		
		this.empno = empno;
		this.name = name;
		this.address = address;
		this.bk = bk;
	}
	@Override
	public String toString() {
		return "employee [empno=" + empno + ", name=" + name + ", address=" + address + ", bk=" + bk + "]";
	}
}
class Bank 
{
String accno,bname;
float balance;
public Bank(String accno, String bname, float balance) {
	this.accno = accno;
	this.bname = bname;
	this.balance = balance;
}
@Override
public String toString() {
	return "Bank [accno=" + accno + ", bname=" + bname + ", balance=" + balance + "]";
}
 
}
public class first {
	
	
//	void show() {
//
//		System.out.println("empno is "+empno);
//		System.out.println("name is "+name);
//		System.out.println("address is "+address);
//		System.out.println("Bank details is "+bk);
//	}
	
	public static void main(String[]args) {
		Bank b1 = new Bank("3435","SBi",33435f);
		employee2 c1= new employee2(23,"Virkam ","Lohagoan",b1);
		System.out.println(c1);
		
	}
	

}
