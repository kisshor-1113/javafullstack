package com.dao.sample;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAOImplementation  implements StudentDao
{
   Connection conn=DBConnection.getConnection();
   
   //Create
   @Override
   public void addStudent(Student s) {
	   String sql="INSERT INTO student VALUES(?,?,?,?,?)";
	   try(PreparedStatement ps=conn.prepareStatement(sql)){
		   ps.setInt(1, s.getStudentId());
		   ps.setString(2, s.getStudentName());
		   ps.setString(3, s.getStudentAge());
		   ps.setString(4, s.getStudentGender());
		   ps.setString(5, s.getStudentLocation());
		   ps.executeUpdate();
		   System.out.println("Student Added");
		    
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
   }
   //Update
   @Override
   public void updateStudent(Student s)
   {
String sql="UPDATE student SET StudentName=?,StudAge=?,StudentGender=?,EmpLocation=?"+"WHERE StudentId=?";	   
   
try(PreparedStatement ps=conn.prepareStatement(sql)){
	
	ps.setString(1, s.get);
}
   
   }
}
