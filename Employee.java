import java.util.*;

class details{
	int emp_id;
	String name;
	float salary;
	
	void input() {
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the emp_id:  ");
		emp_id=ob.nextInt();
		System.out.print("Enter the name:  ");
		name=ob.nextLine();
		name=ob.nextLine();
		System.out.print("Enter the salary:  ");
		salary=ob.nextFloat();
	}
	void display() {
		System.out.println("the emp_id:  "+emp_id);
		System.out.println("the name: "+name);
		System.out.println("the salary: "+salary);
	}
	
}

public class Employee {
	public static void main(String[]args) { 
		System.out.print("Enter the number of Employess:");
		Scanner ob = new Scanner(System.in);
		int emp_no=ob.nextInt();
		details []e=new details[emp_no];
		
		
		for (int i=0;i<e.length;i++) {
			e[i]=new details();
			e[i].input();
			
		}
		int ch ;
		
		do {
			System.out.println("");
			System.out.println("Hello , How may I help you ?");
			System.out.println("1.Show all employee details");
			System.out.println("2.Search an employee ");
			System.out.println("3.Exit");
			System.out.print("Enter a Choice: ");
			ch= ob.nextInt();
			if (ch==1) { 
				for (int i=0;i<e.length;i++) {
					e[i].display();
				}	
			}
			else if (ch==2) {
				System.out.print("Enter employee id: ");
				int search_emp=ob.nextInt(); 
				for (int i=0; i<e.length;i++) {
					if (e[i].emp_id==search_emp) {
						e[i].display();
					}
					else {
						System.out.println("Employee not Found");
					}
				}
			}
			else if (ch==3){
				System.out.println("Thank You, Have a Nice Day.");
				break;
			}
			else {
				System.out.println("Enter a valid input!!");
			}
			
		}while (ch!=3);
		
	}

}
