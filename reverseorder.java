package day5;
import java.util.*;
public class reverseorder {
	public static void main(String[] args) {
	ArrayList<Integer> ls=new ArrayList<Integer>();
	ls.add(10);
	ls.add(40);
	ls.add(30);
	ls.add(20);
	ls.add(50);
	Collections.sort(ls,Collections.reverseOrder());
	Collections.reverseOrder();
	ls.forEach((x)->System.out.println(x));
	}

}
