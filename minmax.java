package day5;
import java.util.*;
public class minmax {
		public static void main(String[] args)
		{
		LinkedList<Integer> ls=new LinkedList<Integer>();
		ls.add(10);
		ls.add(40);
		ls.add(30);
		ls.add(20);
		ls.add(50);
		Collections.sort(ls);
		ls.forEach((x)->System.out.println(x));
		System.out.println("the largest no is "+Collections.max(ls));
		System.out.println("the smallest no is "+Collections.min(ls));

	
}}
