
package com.mph.dao;

import java.util.List;

import com.mph.entity.HEmployee;

public interface HEmployeeDao {
	 public void createEmployee(HEmployee emp);
     public List<HEmployee> getAllEmployee();
     public List<HEmployee> updateEmployee(HEmployee emp);
     public List<HEmployee> deleteEmployee(int eid);
     public HEmployee getEmployee(int id);
     public HEmployee getEmployeeByEmail(String email,String pass);
}
