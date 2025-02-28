package org.vikram;

public class Outerclass {
	static int rollno=10;//class variable,global variables can be accessed anywhere within the program
	static String name="sandip";
	static class inner
	{
		void display()
		{
			System.out.println("The rollno is "+rollno);
			System.out.println("The name is "+name);
		}
	}
	public static void main(String[] args) 
	{
	Outerclass.inner obj=new Outerclass.inner();
	obj.display();
	}
}

