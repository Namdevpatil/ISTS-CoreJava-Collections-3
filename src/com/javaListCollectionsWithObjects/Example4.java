package com.javaListCollectionsWithObjects;

import java.util.ArrayList;
import java.util.List;

public class Example4 {

	public static void main(String[] args) {
		
		
		List<Student> listOfStudents = new ArrayList<Student>();
		
		//add the student objects
		listOfStudents.add(new Student(1100, "Anitha", "B.Tech, CSE", 56.56f));
		listOfStudents.add(new Student(1123, "Sudha", "B.Tech, AI", 78.56f));
		listOfStudents.add(new Student(1189, "Durga", "B.Tech, CSE", 72.22f));
		listOfStudents.add(new Student(2233, "Sudha", "B.Tech, AI", 78.56f));
		listOfStudents.add(new Student(1122, "Gayatri", "B.Tech, Mech", 55.22f));
		listOfStudents.add(new Student(3311, "Saranya", "B.E, ML", 66.56f));
		
		for(Student student1: listOfStudents)
		{
			System.out.println(student1.toString());
		}
		
		System.out.println("------------------------------------search the student object using get(index) method-----------------------------------------------------------");

		Student searchStudent = listOfStudents.get(0);
		
		System.out.println(searchStudent.toString());
		
		
		
	}

}
