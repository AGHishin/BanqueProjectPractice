package org.aghiprac.banqP.Employee;

import java.util.List;

import org.aghiprac.banqP.entities.Employee;

public interface EmployeeService {
	public Employee saveEmployee(Employee employee);
	public List<Employee> saveAllEmployee(List<Employee> employees);

}
