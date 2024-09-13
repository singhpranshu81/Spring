package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.HEmployeeDao;
import com.mph.entity.HEmployee;

@Service
@Transactional
public class HEmployeeServiceImpl implements HEmployeeService{
 @Autowired
	private HEmployeeDao hEmployeeDao;
	@Override
	public void createEmployee(HEmployee emp) {
		hEmployeeDao.createEmployee(emp);
		
	}

	@Override
	public List<HEmployee> getAllEmployee() {
		
		return hEmployeeDao.getAllEmployee();
	}

	@Override
	public List<HEmployee> updateEmployee(HEmployee emp) {
		
		return hEmployeeDao.updateEmployee(emp);
	}

	@Override
	public List<HEmployee> deleteEmployee(int eid) {
		
		return hEmployeeDao.deleteEmployee(eid);
	}

	@Override
	public HEmployee getEmployee(int id) {
		
		return hEmployeeDao.getEmployee(id);
	}

	@Override
	public HEmployee getEmployeeByEmail(String em,String pass) {
		
		return hEmployeeDao.getEmployeeByEmail(em,pass) ;
	}



}
