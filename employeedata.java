import java.util.*;

public class employeedata {
	public static void main(String[]args) throws Exception {
		
			Scanner ob=new Scanner(System.in);
			try {
				System.out.println("Enter Emp_no :");
				String str=ob.next();
				int num= Integer.parseInt(str);
					
			}

		    catch(NumberFormatException ex)
		    {
		           System.out.println("Enter only number");
		              }
			finally {
				System.out.println("Enter name,age and qualification");
				String name=ob.next();
				int age=ob.nextInt();
				String qual=ob.next();
				if(age>=20&& qual.equalsIgnoreCase("btech")) {
					System.out.println("You are Eligible");
				}
				else {
					throw new Exception("Not Eligible");
				}
			}

			}
		
	}


