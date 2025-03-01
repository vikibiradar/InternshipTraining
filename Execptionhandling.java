import java.util.*;

public class Execptionhandling {
	public static void main(String[]args) {
		Scanner ob =new Scanner(System.in);
		try {
			System.out.println("Enter 2 No:");
			int a=ob.nextInt();
			int b=ob.nextInt();
			int c=a/b;
			System.out.println("The result is "+c);
		}catch(Exception e) {
			System.out.println("the error is "+e);
		}
		finally {
			System.out.println("Finally Block");
		}
	}
}
