package dummy;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jsp.emp.entity.Employee;
import org.jsp.emp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService empService;
	@RequestMapping(value = "add",method = RequestMethod.POST)
//	@PostMapping("/add")
	public ModelAndView register(@RequestParam int id,@RequestParam String name,@RequestParam double sal) {
		System.out.println(name+id);
		System.out.println(id+name+sal);
		int empid= empService.addEmp(id,name,sal);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("Home.jsp");
		mav.addObject("res",empid);
		System.out.println("came back");
		return mav;
	}
	@RequestMapping("/displayAll")
	public ModelAndView SelectAll()
	{
//		System.out.println(id);
		List<Employee> list = empService.getAll();
		ModelAndView mav=new ModelAndView();
		mav.setViewName("displayAll.jsp");
		mav.addObject("EmployeeList",list);
		return mav;	
	}
	
	@RequestMapping("/edit")
	public ModelAndView edit()//@PathVariable int id
	{
//		System.out.println(id);
		List<Employee> list = empService.getAll();
		ModelAndView mav=new ModelAndView();
		mav.setViewName("Edit.jsp");
		System.out.println(mav.getViewName()+" mav edit");
		mav.addObject("EmployeeList",list);
		return mav;	
	}
	@RequestMapping("/fetch/{id}")
	public ModelAndView fetch(@PathVariable int id)
	{
		Employee e=empService.fetchEmpById(id);
		System.out.println(e.getEmpName());
		ModelAndView mav=new ModelAndView();
		mav.setViewName("update.jsp");
		System.out.println("success");
		System.out.println(mav.getViewName()+" mav value");
		mav.addObject("Employee",e);
		System.out.println("success");
		return mav;
		
//		No mapping for GET /Employee/fetch/fetch/1
	}
	@PostMapping("/update")
	public void update(@RequestParam int id,@RequestParam String name,@RequestParam double sal)
	{
		empService.updateEmpById(id, name, sal);
		ModelAndView mav=new ModelAndView();
		SelectAll();
		
		
	}
	@RequestMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable int id)
	{
//		System.out.println(id);
		List<Employee> list = empService.getAll();
		ModelAndView mav=new ModelAndView();
		mav.setViewName("Edit.jsp");
		mav.addObject("EmployeeList",list);
		return mav;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@RequestMapping("/add")
//	public ModelAndView register(HttpServletRequest req, HttpServletResponse res) {
//		int id=Integer.parseInt(req.getParameter("id"));
//		double sal=Double.parseDouble(req.getParameter("sal"));
//		String name=req.getParameter("name");
//		
//		int empid= empService.addEmp(id,name,sal);
//		
//		ModelAndView mav=new ModelAndView();
//		mav.setViewName("output.jsp");
//		mav.addObject("res",empid);
//		return mav;
//	}
//	@RequestMapping("/displayAll")
//	public ModelAndView SelectAll(HttpServletRequest req, HttpServletResponse res)
//	{
//		List<Employee> list = empService.getAll();
//		ModelAndView mav=new ModelAndView();
//		mav.setViewName("displayAll.jsp");
//		mav.addObject("EmployeeList",list);
//		return mav;	
//	}
}
