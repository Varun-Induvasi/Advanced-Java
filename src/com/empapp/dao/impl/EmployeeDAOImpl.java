package com.empapp.dao.impl;

import java.util.List;

import com.empapp.dao.EmployeeDAO;
import com.empapp.dto.Employee;
import java.sql.Connection;
import com.empapp.utility.*;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private Connection con;
	
	public EmployeeDAOImpl() {
		this.con=Connector.requestConnection();
	}

	@Override
	public void adddEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findByMailandPassword(String mail, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEmployee(EmployeeDAO e) {
		// TODO Auto-generated method stub
		
	}


}
