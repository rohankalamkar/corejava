package jdbcIntro.ByHIteshSir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		// DriverManager is Inbuilt class in java.sql;
		
		String st = "create table user(uid int, uname varchar(60), pass varchar(70))";
		// For First run : It will run Properly.
		// For Second run : MySQLSyntaxErrorException: Table 'user' already exists
		// for that you have to comment this line for furthur execution.
		
		System.out.println(st);
		
		Statement smt = con.createStatement();
		smt.execute(st);
	}
}
