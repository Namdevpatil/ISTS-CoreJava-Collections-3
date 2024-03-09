package com.javaListCollectionObjectsSortingWithComparator;

import java.util.Comparator;

public class SortingStudentByName implements Comparator<Student>
{
	
	public SortingStudentByName() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Student student1, Student student2) 
	{
		return student1.getStudentName().compareTo(student2.getStudentName());		
	}

}
