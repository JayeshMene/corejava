package com.tns.client;

import com.tns.entities.student;
import com.tns.service.studentservice;
import com.tns.service.studentserviceimpl;

public class client {

	public static void main(String[] args) 
	{
		
		studentservice service = new studentserviceimpl ();
		
		student student = new student();
			//create Operation
		student.setStudentid(100);
		student.setName("Jayesh");
		service.addstudent(student);
		
		//At this breakpoint, we have to added one record to table 
		//retrieve operation
		
		student = service.findstudentbyId(100);
		System.out.println("ID:"+student.getStudentid());
		System.out.println("Name:"+student.getName());
		
		//Update Operation
		student = service.findstudentbyId(100);
		student.setName("Jayesh Mene");
		service.updatestudent(student);
		
		//At this breakpoint, we have updated record added in first section
		
		student = service.findstudentbyId(100);
		System.out.println("ID:"+student.getStudentid());
		System.out.println("Name:"+student.getName());
		
		//At this breakpoint, record is remove from the table 
		//delete operation
		
		student = service.findstudentbyId(100);
		service.removestudent(student);
		System.out.println("End of the program / Life Cycle Completed....");
		
	}

}
