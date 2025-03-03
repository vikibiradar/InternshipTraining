package day5;
import java.util.*;
public class stack {
	public static void main(String[] args)
	{
	Stack<Integer> st=new Stack<Integer>();
	st.push(10);//insert the data
	st.push(20);
	st.push(30);
	st.push(40);
	st.push(50);
	st.push(60);
	for(Object obj:st)
		System.out.println(obj);
	System.out.println("********************************");
	System.out.println(st.pop());//delete the data
	System.out.println(st.peek());//to see the last data
	System.out.println(st.pop());//delete the data
	System.out.println("********************************");
	for(Object obj:st)
		System.out.println(obj);
	System.out.println("********************************");
	//jdk1.8
	st.forEach((x)->System.out.println(x));//The wrapper class super class is Object
	System.out.println(st.search(10));//It will return the position of 10.It is last
	System.out.println(st.search(20));
	System.out.println(st.search(200));
	}
	

}
