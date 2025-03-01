import java.util.*;

public class trywithoutcatch {
	public static void main(String[]args) {
		try {
			Scanner s= new Scanner(System.in);
			System.out.println("Enter any 2 numbers:");
			int a = s.nextInt();
			int b =s.nextInt();
			System.out.println((a/b));
			
		}
		finally {
			System.out.println("The Programming is Not working");
		}
		
	}

}
