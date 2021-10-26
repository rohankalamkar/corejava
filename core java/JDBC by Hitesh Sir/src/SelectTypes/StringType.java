package SelectTypes;

import java.sql.*;



public class StringType {
	// Fetching specific Data
	
	
	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
	
		String sql = "Select * from classicmodels.customers where country like 'usa' ";
		
		Statement smt = con.createStatement();
		
		ResultSet rs = smt.executeQuery(sql);
		
		while(rs.next()) {
			String country = rs.getString(11);
			int custNum = rs.getInt(1);
			String city = rs.getString(8);
			String custName = rs.getString(2);
			
			System.out.println(custNum+"   "+custName+"   "+city+"   "+country);
		}
		
	}

}
