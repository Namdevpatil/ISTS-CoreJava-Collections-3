package com.javaListCollectionObjectsSortingWithComparator;

import java.util.Comparator;

public class SortingStudentByMarks implements Comparator<Student>
{
	
	public SortingStudentByMarks() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Student student1, Student student2) 
	{
		if(student1.getStudentMarks() == student2.getStudentMarks())
		{
			return 0;
		}
		else if(student1.getStudentMarks() > student2.getStudentMarks())
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}

}
