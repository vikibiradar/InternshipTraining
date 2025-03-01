import java.util.*;
public class throwexecption {
	public static void main(String []args) throws Exception {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter your Age to cast your vote");
		int age=ob.nextInt();
		if (age >=18) {
			System.out.println("You are eligible to cast your vote");
		}
		else {
			throw new Exception("The Age Should be greater than or equal to 18 to caste your your");
		}
		
	}
}
