package day5;
import java.util.*;
public class hasprevious {
	public static void main(String[] args)
	{
	LinkedList<String> ls=new LinkedList<String>();
	ls.add("Trupti");
	ls.add("Shubham");
	ls.add("Madhu");
	ls.add("Geetanjali");
	ls.add("Sunil");
	ls.add("Deepak");
	System.out.println("Forword Direction");
	ListIterator<String> li=ls.listIterator();
	while(li.hasNext())
	{
		System.out.println(li.next());
	}
	System.out.println("Backward Direction");
	while(li.hasPrevious())
	{
		System.out.println(li.previous());
	}
	}

}
