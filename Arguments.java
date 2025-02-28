package org.vikram;

public class Arguments {
	
	public static void main(String h[])
	{
	String a=h[0];
	String b=h[1];
	String c=h[2];
	float x=Float.parseFloat(a);
	float y=Float.parseFloat(b);
	float z=Float.parseFloat(c);
	float sum=x+y+z;
	System.out.println(sum);
	}

}
