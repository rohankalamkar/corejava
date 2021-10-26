
package IntroJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class IntroJdbc {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Step 1 : loading Driver
		
		Class.forName("com.mysql.jdbc.Driver");
		
		// Step 2 : getting connection of jdbc to mysql database
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
		
		// Step3 : Construct sql query . 
		
		//String sql = " create table  class10 (rollno int, name varchar(60), surname varchar(60)) ";
		String sql = "insert into class10 values(1,'Rohan','Kalamkar') ";
		// step4 : Create statement for sql query
		
		Statement smt = con.createStatement();
		
		// step 5 : pass sql query into statement
		System.out.println(smt.execute(sql));
		
		System.out.println(sql);
	}

}
