package day5;
import java.util.*;
public class lk {
	public static void main(String[] args)
	{
	LinkedList<Integer> ls=new LinkedList<Integer>();
	LinkedList<Integer> ls1=new LinkedList<Integer>();
	ls.add(10);
	ls.add(20);
	ls.add(30);
	ls.add(40);
	ls1.add(100);
	ls1.add(200);
	ls1.add(300);
	ls1.add(400);
	ls.forEach((x)->System.out.println(x));
	System.out.println("*******************");
	ls1.forEach((x)->System.out.println(x));
	System.out.println("*******************");
	ls.addFirst(9);
	ls1.addFirst(99);
	ls.forEach((x)->System.out.println(x));
	System.out.println("*******************");
	ls1.forEach((x)->System.out.println(x));
	System.out.println("*******************");
	ls.removeFirst();
	ls1.removeFirst();
	ls.forEach((x)->System.out.println(x));
	System.out.println("*******************");
	ls1.forEach((x)->System.out.println(x));
	System.out.println("*******************");
	ls.removeLast();
	ls1.removeLast();
	System.out.println(ls.getFirst());
	System.out.println(ls1.getLast());
	ls.addAll(ls1);
	System.out.println("*******************");
	ls.forEach((x)->System.out.println(x));
	ls.remove(0);
	ls.forEach((x)->System.out.println(x));
	}
	

}
