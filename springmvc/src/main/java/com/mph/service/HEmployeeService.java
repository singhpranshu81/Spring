package com.mph.service;

import java.util.List;

import com.mph.entity.HEmployee;

public interface HEmployeeService {
     public void createEmployee(HEmployee emp);
     public List<HEmployee> getAllEmployee();
     public List<HEmployee> updateEmployee(HEmployee emp);
     public List<HEmployee> deleteEmployee(int eid);
     public HEmployee getEmployee(int id);
     public HEmployee getEmployeeByEmail(String em,String pass);
}
