package com.javaListCollectionsWithObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example6 {

	public static void main(String[] args) {
		
		List<Integer> values = new ArrayList<Integer>();
		
		values.add(1123);
		values.add(3032);
		values.add(1133);
		values.add(4455);
		values.add(1199);
		
		for(Integer value: values)
		{
			System.out.println(value);
		}
		
		System.out.println("----------------------------after sorting-------------------------");
		
		Collections.sort(values);
		
		for(Integer value: values)
		{
			System.out.println(value);
		}
		
	}

}
