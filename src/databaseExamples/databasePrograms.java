package databaseExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class databasePrograms {

	public static void main(String[] args) throws SQLException {

		//download oracle driver (.jar file)
		//add driver .jar in your projects
		
		// Step 1: Eclipse Create Connection
		// Step 2: Create a query / statements
		// Step 3: Execute this query/statements in through the connection.
		// Step 4: Close Connection
		
		// Step 1: Create Connection
		Connection con = DriverManager.getConnection("");
		
		
		//Create a query/statement
		Statement stmt = con.createStatement();
		//String s = "insert into student values (101, 'John')";
		
		//String s = "update student set sname = 'KIM' where sid =105";
		
		//String s = "delete student where sid =105";
		
		String s = "Select employee_id, first_name, last_name from employees";
		
		//Execute statement / query
		ResultSet rs = stmt.executeQuery(s);
		
		while(rs.next()) {
			
			int eid = rs.getInt("employee_id");
			String fname = rs.getString("first_name");
			String lname = rs.getString("last_name");
			
			System.out.println(eid+ "       " +fname +"       " +lname);
		}
		
		
		con.close();
		
		System.out.println("Program is completed");
		
		
	}

}
