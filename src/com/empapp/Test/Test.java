package com.empapp.Test;

import java.sql.PreparedStatement;
import java.util.Scanner;

import com.empapp.dao.EmployeeDAO;
import com.empapp.dao.impl.EmployeeDAOImpl;
import com.empapp.dto.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Employee e=new Employee();
		EmployeeDAO edao=new EmployeeDAOImpl();
		
//		TO ADD DATA
		
//		System.out.println("Enter the name : ");
//		e.setName(sc.next());
//		System.out.println("Enter the job role : ");
//		e.setJob(sc.next());
//		System.out.println("Enter the salary : ");
//		e.setSalary(sc.nextDouble());
//		
//		System.out.println("Enter the dept number : ");
//		e.setDno(sc.nextInt());
//		
//		System.out.println("Enter the mail Id : ");
//		e.setMail(sc.next());
//		
//		System.out.println("Enter the password : ");
//		e.setPassword(sc.next());
////		send this data to employee object
//		edao.addEmployee(e);
//		
//		System.out.println("Data added successfully!");
		
		
//		TO FIND BY ID
		
		System.out.println("enter the id : ");
		Employee empl=edao.findById(sc.nextInt());
		System.out.println(empl);
		
		
		
	}

}
