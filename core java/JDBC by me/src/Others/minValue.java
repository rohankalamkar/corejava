package Others;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class minValue {
	public static void main(String[] args) throws SQLException {
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Account Number : ");
//		int acn = sc.nextInt();
		
		String sql = "select salary,uid from user where salary = (select min(salary) from user)";
		ResultSet rs = con.createStatement().executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString(1)+"  "+rs.getString(2));// "  "+rs.getString(3)+"   " +rs.getString(4));
		}
		
		
	}

}
