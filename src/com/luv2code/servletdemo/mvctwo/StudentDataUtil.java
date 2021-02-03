package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {

	public static List<Student> getStudents(){
	
		//create an empty list
		List<Student> students = new ArrayList<>();
		
		//add sample data
		students.add(new Student("Mary","Public","mary@lu2code.com"));
		students.add(new Student("John","Doe","john@lu2code.com"));
		students.add(new Student("Ajay","rao","ajay@lu2code.com"));
		
		//return the list
		return students;
	}
	
}
