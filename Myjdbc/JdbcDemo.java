package Myjdbc;

import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) {
	try {
		//1.load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. Create Connection
		Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost : 3306/testDB",
			"root",
			"Janni@2026");
		
		// 3. Create Statement
		PreparedStatement pst = con.prepareStatement("SELECT * FROM employees");
	
	   //4. Execute Query
		ResultSet rs = pst.executeQuery();	
		
		//5.process results
		while(rs.next()) {
			System.out.println(rs.getInt("EmpId") + " " + rs.getString("EmpName")+ " " +rs.getString("EmpLocation"));
		}
		
		//6. Close Resources
		rs.close();
		pst.close();
		con.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}

	}

}
