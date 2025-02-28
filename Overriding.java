package org.vikram;

class parent1{
	void show() {
		System.out.println("Inside the parent class");
	}
}
class child1 extends parent1{
	void show() {
		System.out.println("Inside child class");
		
	}
}
public class Overriding {
	
	public static void main(String[]args) {
	child1 c1=new child1();
	c1.show();

}
}