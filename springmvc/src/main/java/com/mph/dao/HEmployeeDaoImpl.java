package com.mph.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.HEmployee;

import jakarta.persistence.criteria.CriteriaQuery;

@Repository
public class HEmployeeDaoImpl implements HEmployeeDao{
	@Autowired
      private SessionFactory sessionFactory;  
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void createEmployee(HEmployee emp) {
		getSession().saveOrUpdate(emp);
		System.out.println("Employee added successfully..");
	}

	@Override
	public List<HEmployee> getAllEmployee() {
	
	    Query qry= getSession().createQuery("from HEmployee");
	    List<HEmployee> emplist = qry.list();
	    System.out.println(emplist);
		return emplist;
	}

	@Override
	public List<HEmployee> updateEmployee(HEmployee emp) {
		 
		   Query qry= getSession().createQuery("update HEmployee set ename=:ename,email=:email,password=:password,gender=:gender where eid=:eid");
		   qry.setParameter("ename",emp.getEname());
		   qry.setParameter("email",emp.getEmail());
		   qry.setParameter("password",emp.getPassword());
		   qry.setParameter("gender",emp.getGender());
		   qry.setParameter("eid",emp.getEid());
		   int n=qry.executeUpdate();
		   if(n>0) {
			   System.out.println("updated"+ emp.getEid() + "Info. ");
		   }
		return getAllEmployee();
	}

	@Override
	public List<HEmployee> deleteEmployee(int eid) {
		  Query qry= getSession().createQuery("delete from HEmployee where eid=:eid");
		  qry.setParameter("eid",eid);
		  int n=qry.executeUpdate();
		   if(n>0) {
			   System.out.println("deleted"+ eid + "Info. ");
		   }
		   return getAllEmployee();
	}

	@Override
	public HEmployee getEmployee(int id) {
		  Query qry= getSession().createQuery("from HEmployee where eid=:id");
		  qry.setParameter("id",id);
		  HEmployee emp=(HEmployee) qry.uniqueResult();
		  System.out.println("Serach res: "+emp);
		   return emp;
	}

	@Override
	public HEmployee getEmployeeByEmail(String email,String password) {
		  
		 Query<HEmployee> c=getSession().createQuery("from HEmployee where email=:email and password=:password");
		  c.setParameter("email", email);
		  c.setParameter("password", password);
		  HEmployee emp= (HEmployee) c.uniqueResult();
		  System.out.println("emp fetched using email: "+emp);
		return emp;
	}

}
