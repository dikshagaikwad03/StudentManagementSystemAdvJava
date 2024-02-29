package Test;

import java.util.ArrayList;
import java.util.Scanner;

import bean.Student;
import dbcon.Myconnection;

public class TestStudentManagement 
{
	public static void main(String args[])
	{
		System.out.println("1.Save\n 2.Get list of students\n 3.Update Student");
		
		String name,grade;
		Scanner sc = new Scanner(System.in);
		
		Myconnection connection = new Myconnection();
		/*
		//Insert Query
		System.out.println("Enter Name:");
		name=sc.next();	
		
		System.out.println("Enter Grade:");
		grade=sc.next();
		
		//initialize student bean
		Student s = new Student();
		s.setName(name);
		s.setGrade(grade);
		
		//Call business logic
		Myconnection connection1 = new Myconnection();
		connection1.saveStudent(s);
		
		System.out.println("Student Stored Successsfully");
		*/
		
		System.out.println("------------Student List-----------");
		ArrayList<Student> ar = connection.listStudent();
		
		//using java 1.8 show array list object
		for(Student s:ar)
		{
			System.out.print(s);
		}
		
	}
}
