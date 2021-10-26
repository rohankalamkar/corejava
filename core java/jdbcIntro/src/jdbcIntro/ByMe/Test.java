package jdbcIntro.ByMe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// Step 1 : To load driver 
		// Already path given to Project
		//Class.forName("com.mysql.jdbc.Driver");   // Traditional procedure if path not given to Project
		// Step 2 : To establishing connection 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class", "root", "root");
		//step 3 :sql query : Whatever we have to work to do in sql database starts from here
		//String st = "create table employee(eid int,ename varchar(60), edez varchar(60))";  // This for creating table in Schema class in mysql
		// pass this st in statment--> execute
		
		String sq = "insert into employee values(102,'Akash','Rathod')";
		// You can insert duplicate values in table,
		// But you cannot create duplicate table into that schema in database 
		
		Statement smt = con.createStatement();
		// step 5: Give this String sql query to statement in sql
		smt.execute(sq);
		
		System.out.println("Exists....");
		smt.close();
		con.close();
		
	}

}
