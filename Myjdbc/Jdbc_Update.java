package Myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Jdbc_Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//1.load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. Create Connection
			Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost : 3306/testDB",
				"root",
				"Janni@2026");
			
			// 3. Create Statement
			PreparedStatement pst = con.prepareStatement("insert into employees(EmpId , EmpName  values(?,?");
		    pst.setInt(1,255);
		    pst.setString(2, "Suri");
			
			int rows = pst.executeUpdate();
		     
			System.out.println(rows + "rows inseted");
			
		  
			
			//6. Close Resources
			
			pst.close();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}


	}

}
