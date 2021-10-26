package SelectTypes;

import java.sql.*;
import java.util.Scanner;



public class StringTypesByScanner {
	// Fetching specific Data By using Scanner 
	
	
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Country Name : ");
		String cntry = sc.next();
		// Step 1 : Already Loaded
		// Step 2 : Get Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
		//step 3:
		String sql = "Select * from classicmodels.customers where country like '"+cntry+"' ";
		// syntax : "select * from tablename where culumnName 'inputvalue'";
		//step 4:
		Statement smt = con.createStatement();
		//step 5
		ResultSet rs = smt.executeQuery(sql);
		
		while(rs.next()) {
			String country = rs.getString(11);
			int custNum = rs.getInt(1);
			String city = rs.getString(8);
			String custName = rs.getString(2);
			
			System.out.println(custNum+"   "+custName+"   "+city+"   "+country);
		}
		
		smt.close();
		con.close();
		
	}

}
