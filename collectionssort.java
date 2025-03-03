package day5;
import java.util.*;
public class collectionssort {
	public static void main(String[] args)
	{
	LinkedList<String> ls=new LinkedList<String>();
	ls.add("Trupti");
	ls.add("Shubham");
	ls.add("Madhu");
	ls.add("Geetanjali");
	ls.add("Sunil");
	ls.add("Deepak");
	Collections.sort(ls);
	ls.forEach((x)->System.out.println(x));

}
}