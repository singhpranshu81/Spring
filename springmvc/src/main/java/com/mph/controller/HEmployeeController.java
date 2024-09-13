package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mph.entity.HEmployee;
import com.mph.service.HEmployeeService;

@Controller
public class HEmployeeController {
	@Autowired
   private HEmployeeService hEmployeeService;

	HEmployee employee;
	
	@RequestMapping(value = "/registerpage", method=RequestMethod.GET)
	public ModelAndView registerMethod() {
		return new ModelAndView("register");
	}
	@RequestMapping(value = "/loginpage", method=RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("login");
	}
	@RequestMapping(value = "/addEmp", method=RequestMethod.POST)
	public ModelAndView signup(@RequestParam("txtename") String name,
@RequestParam("txtemail") String email,
@RequestParam("txtpass") String pass,
@RequestParam("txtgender") String gender)
 {
		System.out.println(name +" "+email+" "+pass+" "+gender);
		employee = new HEmployee();
		employee.setEname(name);
		employee.setEmail(email);
		employee.setPassword(pass);
		employee.setGender(gender);
		hEmployeeService.createEmployee(employee);
		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "/signin", method=RequestMethod.POST)
	public ModelAndView signin(@RequestParam("txtemail") String email,
			@RequestParam("txtpass") String pass){
	
		HEmployee emp=hEmployeeService.getEmployeeByEmail(email,pass);
		if(emp==null) {
		ModelAndView mv= new ModelAndView("home");
		mv.addObject("NOTIFICATION","Employe does not exist");
		return mv;
		
		}
		else {
			return allEmployees();
		}
		
	}
	@RequestMapping(value = "/delete", method=RequestMethod.GET)
	public ModelAndView deleteEmp(HEmployee emp) {
		List<HEmployee> x=hEmployeeService.deleteEmployee(emp.getEid());
		ModelAndView v=new ModelAndView("home");
		v.addObject("allemp",x);
		return v;
		
		
	}
	@RequestMapping(value = "/edit", method=RequestMethod.GET)
	public ModelAndView editEmp(HEmployee emp) {
		
		ModelAndView v=new ModelAndView("edit");
		
		return v;
		
		
	}
	@RequestMapping(value = "/updateEmp", method=RequestMethod.POST)
	public ModelAndView updateEmp(@ModelAttribute HEmployee emp) {
		 System.out.println("*****"+emp);
		List<HEmployee> x=hEmployeeService.updateEmployee(emp);
		ModelAndView v=new ModelAndView("home");
		v.addObject("allemp",x);
		return v;
		
		
	}
	public ModelAndView allEmployees(){
		List<HEmployee> list = hEmployeeService.getAllEmployee();
		ModelAndView mv= new ModelAndView("home");
		mv.addObject("allemp",list);
		return mv;
	}
}
