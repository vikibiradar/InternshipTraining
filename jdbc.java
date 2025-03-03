package day5;
import java.sql.*;
public class jdbc {
	public static void main(String[]args)throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");//Loading the driver
		//Creating the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batchi06?useSSL=false","root","Admin@123");
		Statement st=con.createStatement();
//		st.execute("create table mphasis (empid int,name varchar(30));");
//		System.out.println("Table Created");
		st.execute("insert into mphasis values(34,'Vikram');");
		System.out.println("Row is Entered");
		ResultSet rs=st.executeQuery("select * from student");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
		
		
	}

}
