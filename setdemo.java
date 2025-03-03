package day5;
import java.util.*;
public class setdemo {
	public static void main(String[]args) {
	TreeSet<Integer> ts=new TreeSet<Integer>();
	//to check if the TreeSet is empty and  returns a boolean value
	System.out.println(ts.isEmpty());
	System.out.println(ts.size());
	ts.add(70);
	ts.add(20);
	ts.add(30);
	ts.add(10);
	ts.add(50);
	ts.add(50);
	ts.add(60);
	System.out.println(ts.isEmpty());
	System.out.println(ts.size());
	System.out.println(ts.contains(10));//searching .return boolean value
	System.out.println(ts.contains(100));
	System.out.println(ts.size());
	ts.remove(50);//remove the object
	System.out.println(ts);
	ts.clear(); //remove all the objects
	System.out.println(ts);
	System.out.println(ts.size());
	
}
}
