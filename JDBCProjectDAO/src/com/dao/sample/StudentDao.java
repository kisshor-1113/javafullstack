package com.dao.sample;

import java.util.List;

public interface StudentDao {

	
	void addStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(int studentId);
	List<Student> getAllStudents();
}
