package com.dao.sample;

import java.sql.*;
import java.util.*;

public class StudentDAOImplementation implements StudentDao {

    Connection conn = DBConnection.getConnection();

    // Create
    @Override
    public void addStudent(Student s) {
        String sql = "INSERT INTO student VALUES(?,?,?,?,?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, s.getStudentId());
            ps.setString(2, s.getStudentName());
            ps.setString(3, s.getStudentAge());
            ps.setString(4, s.getStudentGender());
            ps.setString(5, s.getStudentLocation());

            ps.executeUpdate();
            System.out.println("Student Added");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Update
    @Override
    public void updateStudent(Student s) {
        String sql = "UPDATE student SET StudentName=?, StudAge=?, StudentGender=?, StudentLocation=? WHERE StudentId=?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, s.getStudentName());
            ps.setString(2, s.getStudentAge());
            ps.setString(3, s.getStudentGender());
            ps.setString(4, s.getStudentLocation());
            ps.setInt(5, s.getStudentId());

            ps.executeUpdate();
            System.out.println("Student Updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Delete
    @Override
    public void deleteStudent(int id) {
        String sql = "DELETE FROM student WHERE StudentId=?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Student Deleted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Read
    @Override
    public List<Student> getAllStudents() {

        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM student";

        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Student s = new Student(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));

                list.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
