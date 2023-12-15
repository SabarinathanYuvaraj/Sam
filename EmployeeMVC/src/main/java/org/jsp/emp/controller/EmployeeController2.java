package org.jsp.emp.controller;

import java.util.List;

import org.jsp.emp.entity.Employee;
import org.jsp.emp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController2 {
	
	@Autowired
	EmployeeService empService;
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public ModelAndView addEmp(@RequestParam int id,@RequestParam String name,@RequestParam double sal)
	{
		int empid= empService.addEmp(id,name,sal);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("Home.jsp");
		mav.addObject("res",empid);
		return mav;
	}
	@RequestMapping(value="/DisplayEmpById",method = RequestMethod.GET)
	public ModelAndView getEmpById(@RequestParam int id)
	{
		System.out.println("csame");
		List<Employee> emp = empService.getEmpById(id);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("DisplayEmpl.jsp");
		mav.addObject("Employee",emp);
		return mav;
	}
	@RequestMapping(value="/DisplayAll",method = RequestMethod.GET)
	public ModelAndView getAll()
	{
		System.out.println("csame");
		List<Employee> emp = empService.getAll();
		ModelAndView mav=new ModelAndView();
		mav.setViewName("DisplayEmpl.jsp");
		mav.addObject("Employee",emp);
		return mav;
	}
	@RequestMapping(value="/Edit",method = RequestMethod.GET)
	public ModelAndView Edit()
	{
		System.out.println("from edit");
		List<Employee> emp = empService.getAll();
		ModelAndView mav=new ModelAndView();
		mav.setViewName("EditUiPage.jsp");
		mav.addObject("EmployeeList",emp);
		return mav;
	}
	@RequestMapping(value="/Delete",method = RequestMethod.GET)
	public ModelAndView Delete(@RequestParam int id)
	{
		System.out.println("csame");
		empService.deleteEmpById(id);
		List<Employee> emp = empService.getAll();
		ModelAndView mav=new ModelAndView();
		mav.setViewName("EditUiPage.jsp");
		mav.addObject("EmployeeList",emp);
		return mav;
	}
	@RequestMapping(value="/Update",method = RequestMethod.GET)
	public ModelAndView Update(@RequestParam int val)
	{
		System.out.println("csame");
//		empService.getEmpById(val);
		List<Employee> emp = empService.getEmpById(val);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("UpdateUiPage.jsp");
		mav.addObject("EmployeeList",emp);
		return mav;
	}
	@RequestMapping(value="/UpdateById",method = RequestMethod.GET)
	public ModelAndView UpdateById(@RequestParam int id,@RequestParam String name,@RequestParam double sal)
	{
		System.out.println("csame");
		empService.updateEmpById(id, name, sal);
		List<Employee> emp = empService.getAll();
		ModelAndView mav=new ModelAndView();
		mav.setViewName("EditUiPage.jsp");
		mav.addObject("EmployeeList",emp);
		System.out.println(emp);
		return mav;
	}

}
