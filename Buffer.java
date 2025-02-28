package org.vikram;

public class Buffer {
	public static void main(String[] args) 
	{
	StringBuffer s1=new StringBuffer("My name ")	;
	StringBuffer s2=new StringBuffer("is Vikram ")	;
	StringBuffer s3=new StringBuffer("I am 21 years old");
	System.out.println(s1.append(s2));
	System.out.println(s1.append(s3));
	System.out.println(s1);//mutable the value of the string is changed
	s1.setCharAt(0, 'm');
	System.out.println(s1);
	s1.setLength(20);
	System.out.println(s1);
	System.out.println(s1.insert(20, " am a java Trainer"));
	System.out.println(s1.delete(21, 25));
	System.out.println(s1.reverse());
	System.out.println(s1.reverse());
	System.out.println(s1.capacity());
	}

}
