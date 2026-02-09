package com.dao.sample;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAge;
	private String studentGender;
	private String studentLocation;
	public Student(int studentId, String studentName, String studentAge, String studentGender, String studentLocation) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentGender = studentGender;
		this.studentLocation = studentLocation;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public String getStudentLocation() {
		return studentLocation;
	}
	public void setStudentLocation(String studentLocation) {
		this.studentLocation = studentLocation;
	}
	

}
