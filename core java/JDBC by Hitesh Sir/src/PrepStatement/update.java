package PrepStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update {
	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classrrom", "root", "root");
		
		
		String sql = "update class10 set name=? , address =? where rollno = ?";
		// It is similar to
		// String sql="update class10 set name = 'kanta', address='arvi naka' where rollno=15";
		// By Prep Statement : 
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "kanta");
		ps.setString(2, "arvi naka");
		ps.setInt(3, 15);
		
		ps.execute();
		ps.close();
		
		
	}

}
