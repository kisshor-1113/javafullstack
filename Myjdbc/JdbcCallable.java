package Myjdbc;
import java . sql.*;
public class JdbcCallable {

	
		static final String DB_URl = "jdbc : mysql://localhost:3306/NewDB";
            static final String USER = "root";
            static final String PASS = "Janni@2026";
            
            public static void main(String[] args) {
            	
            	try 
            	{
            	 Connection conn = DriverManager.getConnection(DB_URl,USER, PASS);
            	 String stmt = "insert into Student values(?,?,?,?)";
            	    CallableStatement cs = conn.prepareCall(stmt);
            	    cs.setInt(1,119);
            	    cs.setString(2,"ratanii");
            	    cs.setInt(3,32);
            	    cs.setString(4,"male");
            	    cs.execute();
            	    System.out.println("Uploaded Succesfully\n");
            	}
            catch(SQLException e)
            	{
            	e.printStackTrace();
            		
            		
            		
            	}
            }
}



