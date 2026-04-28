package com.empapp.dao.impl;

import java.sql.Connection;
import java.util.List;

import com.empapp.dao.DeptDAO;
import com.empapp.dto.Dept;
import com.empapp.utility.Connector;

public class DeptDAOImpl implements DeptDAO {
	
private Connection con;
	
	public DeptDAOImpl() {
		this.con=Connector.requestConnection();
	}

	@Override
	public void addDept(Dept t) {
		// TODO Auto-generated method stub

	}

	@Override
	public Dept findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public List<Dept> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDept(Dept d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDept(Integer dno) {
		// TODO Auto-generated method stub

	}

}
