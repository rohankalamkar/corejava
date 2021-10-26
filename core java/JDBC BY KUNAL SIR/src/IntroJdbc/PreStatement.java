package IntroJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreStatement {
	public static void main(String[] args) throws SQLException {
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		String sql = "insert into user values(?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, 2);
		ps.setString(2, "chetan");
		ps.setString(3, "kalamkar");
		
		int x=ps.executeUpdate();
		System.out.println(x);
		
		
	}

}
