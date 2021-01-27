package org.aghiprac.banqP.Employee;

import java.util.List;

import org.aghiprac.banqP.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/employee",method = RequestMethod.POST)
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

	@RequestMapping(value = "/employee",method = RequestMethod.GET)
	public List<Employee> saveAllEmployee() {
		return employeeService.getAllEmployee();
	}
}
