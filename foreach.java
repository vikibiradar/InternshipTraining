package day5;
import java.util.*;

public class foreach {
	public static void main(String[] args)
	{
	TreeSet<Integer> ts=new TreeSet<Integer>();
	System.out.println(ts.isEmpty());
	//to check if the TreeSet is empty or not returns a Boolean value
	System.out.println(ts.size());
	ts.add(70);
	ts.add(20);
	ts.add(30);
	ts.add(10);
	ts.add(50);
	ts.add(50);
	ts.add(60);
	System.out.println("***********************");
	for(Object obj:ts)//the ts value will be stored into the obj one by one and we will print the obj.
		System.out.println(obj);
	System.out.println("***********************");
	

}}
