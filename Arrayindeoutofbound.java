import java.util.*;
public class Arrayindeoutofbound {
	public static void main(String[]args) throws Exception {
		try {int a[]=new int[5];
		Scanner ob=new Scanner(System.in);
		System.out.println("enter 5 nos");
		for(int i=0;i<5;i++) {
		a[i]=ob.nextInt();
		System.out.println("5 nos are");}
		for(int i=0;i<=5;i++) {
		System.out.println(a[i]);
		}
		}
		catch(Exception ae){
			ae.printStackTrace();
			System.out.println("Hey");
			
		}
	}

}
