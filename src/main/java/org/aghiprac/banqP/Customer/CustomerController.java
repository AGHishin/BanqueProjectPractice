package org.aghiprac.banqP.Customer;

import java.util.List;

import org.aghiprac.banqP.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;	
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/customer",method = RequestMethod.POST)
	public Customer saveCustomer(@RequestBody Customer c) {
		System.out.println("test");
		return customerService.saveCustomer(c);
	}
	@RequestMapping(value="/customer",method = RequestMethod.GET)
	public List<Customer> getAllCustomer() {
		return customerService.getAllCustomer();
	}

	

}
