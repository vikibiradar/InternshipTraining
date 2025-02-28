package org.vikram;
import java.util.*;

public class book {
	int book_id;
	String book_name;
	String author;
	float price;
	
	void input() {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter book_id, Book Name, Author, Price :");
		book_id=ob.nextInt();
		book_name=ob.next();
		author=ob.next();
		price=ob.nextFloat();
		
	}
	void display() {
		System.out.println("Book_ id is "+book_id);
		System.out.println("The name of the book is "+book_name);
		System.out.println("Author of the book "+book_name +" is "+author);
		System.out.println("Price of the book "+book_name +" is "+price);
	}
	public static void main(String[]args) {
		book b1=new book();
		b1.input();
		b1.display();
		
		
	}
	

}
