package com.javaListCollectionObjectsSortingWithComparator;


public class Student
{	
	//fields
	private Integer studentId;
	private String studentName;
	private String studentClass;
	private float studentMarks;

	//initializers

	//constructors
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer studentId, String studentName, String studentClass, float studentMarks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.studentMarks = studentMarks;
	}

	//methods
	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public float getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(float studentMarks) {
		this.studentMarks = studentMarks;
	}

	//toString method
	@Override
	public String toString()
	{
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentClass=" + studentClass
				+ ", studentMarks=" + studentMarks + "]";
	}
	

}
