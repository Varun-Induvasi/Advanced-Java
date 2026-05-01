package com.empapp.Test;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
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
		
//		1.TO ADD DATA
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
		
		
//		2.TO FIND BY ID
//		
//		System.out.println("enter the id : ");
//		Employee empl=edao.findById(sc.nextInt());
//		System.out.println(empl);
		
//		3.FIND ALL 
//		List<Employee> ls=new ArrayList<>();
//		ls=edao.findAll();
//		System.out.println(ls);
		
		
//		4.TO FIND BY MAIL AND PASSWORD
//		
//		System.out.println("enter the mail : ");
//		String mail=sc.next();
//		System.out.println("enter the password : ");
//		String password=sc.next();
//		Employee empl=edao.findByMailandPassword(mail,password);
//		System.out.println(empl);
		
//		5. Update employee
		System.out.println("Enter the ID");
		Employee emp=edao.findById(sc.nextInt());
		System.out.println("----------------------------------");
		System.out.println("Before updating : ");
		System.out.println(emp);
		System.out.println("----------------------------------");
		System.out.println("1.Name");
		System.out.println("2.Job");
		System.out.println("3.Salary");
		System.out.println("4.Dept no");
		System.out.println("5.Mail");
		System.out.println("6.Password");
		
		Integer choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter your new name : ");
			emp.setName(sc.next());
			break;
			
		case 2:
			System.out.println("Enter your job : ");
			emp.setJob(sc.next());
			break;
		case 3:
			System.out.println("Enter your salary : ");
			emp.setSalary(sc.nextDouble());
			break;
		case 4:
			System.out.println("Enter your Department no : ");
			emp.setDno(sc.nextInt());
			break;
		case 5:
			System.out.println("Enter your new email: ");
			emp.setMail(sc.next());
			break;
		case 6:
			System.out.println("Enter your new password: ");
			emp.setPassword(sc.next());
			break;
		default : System.out.println("Enter a valid input");
			break;
		}
		edao.updateEmployee(emp);
		System.out.println("After update");
		System.out.println(emp);
		
	}

}


