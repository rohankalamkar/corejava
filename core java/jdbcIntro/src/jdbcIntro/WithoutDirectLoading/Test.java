package jdbcIntro.WithoutDirectLoading;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// Step 1 : Load Driver class.  (jdbc driver loading)
		
		Class.forName("com.mysql.jdbc.Driver");   // It will gives you class not found exception if You not built path for sql . jar file
		// Once you added jar file in Project: (Right Click) on project --> Built Path --> configure Built Path --> Libraries--> add External Jar. and added mysql-connector-java-5.1.14.bin.jar
		
		// after that this will not gives you ClassNotFoundException
		
		// Step 2 : Established Connection Between Eclipse and DataBase(here MySql) through jdbc
		
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
		// Student here is Schema name(Package) which must be present in Mysql DataBase 
		// Here Student (Schema) is not created yet..so it will give you exception 
		// MySQLSyntaxErrorException: Unknown database 'student'
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
		// Connection interface is present in java.sql;
		// No error : college(Schema name) already created in mysql database
		
		// Step 3 : To Construct SQL query(adding data into college schema table Name Student(already exist in mysql server)
		// You can create table in Scheme through java but you cannot create Schema throught java in mysql database. Scheme must have already presented in database(Mysql)
		
		String sql = "insert into student values(110,'Ashish Kadam','Baramati')";
		// first run : added succussfully
		
		// here in sql 110 is key, Duplicate not allowed here thats it will store only one time. if you run it again it will gives you 
		// For second time run MySQLIntegrityConstraintViolationException: Duplicate entry '110' for key 1
		
		// Step 4 : To create reference of required jdbc sql statement
		// String sql ko transport karna hai data base me throught connection between jdbc and mysql database (here con)
		Statement smt = con.createStatement();   // Statement :  Executes the given SQL statement, which returns a single object   
		// Statement interface present in java.sql package
		// Creates a <code>PreparedStatement</code> object for sending
	   //  * parameterized SQL statements to the database.
		
		// Step 5 : To Submit Query :
		
		smt.execute(sql);    // execute method present in Statement interface
		
		System.out.println("Data Added Succeccfully...!!!");
		
		// now close 
		smt.close();
		con.close();
		
	}

}
