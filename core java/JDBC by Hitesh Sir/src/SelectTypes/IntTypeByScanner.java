package SelectTypes;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class IntTypeByScanner {
	// Fetching/Retrivien specific int data by scanner
		public static void main(String[] args) throws SQLException {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Customer Number : ");
			int cust = sc.nextInt();
			
			// Step1  : Load Driver 
			// Class.forName("com.mysql.jdbc.Driver");
			
			// Step 2 : Get Connected 
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root", "root");
			
			// Step 3 : construct sql query
			
			String sql="select * from payments where customerNumber > "+cust+"";
			
			// syntax : "select * from TableName where columnName >/=/</<=/>= yourinput "; 
			// for int we can use < , > , = , <= , >=
			// Step 4 : Create statement 
			Statement smt = con.createStatement();
			
			boolean flag = true;
			// execute query by statement
			
			ResultSet rs = smt.executeQuery(sql);
			
			while(rs.next()) {
				int custNum = rs.getInt(1);
				String ChNum = rs.getString(2);
				Date date = rs.getDate(3);
				double amt = rs.getDouble(4);
				flag = false;
				System.out.println(custNum + "   "+ChNum+"   "+date+"  "+amt );
			}
			
			if(flag) {
				System.out.println("This Customer Number does not exist ");
			}
			
		}


}
