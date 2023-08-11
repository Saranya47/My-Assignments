package org.student;

import org.department.Department;

public class Student extends Department {
	
		

		public void studentName()
		{
			
			System.out.println("Student Name-Saranya");
			

		}
		
		public void studentDept()
		
		{
			System.out.println("Student Dept-MCA");
			

		}

	public void studentId()
	{
		System.out.println("Student ID 126689");
	}

		public static void main(String[] args) {
			
			
			// TODO Auto-generated method stub
			
	System.out.println("Student details");		
			Student S=new Student();
		S.collegeName();
		S.collegeCode();
		S.collegeRank();
		S.deptName();
		S.studentName();
		S.studentId();
		S.studentDept();
		}

		}





