package org.aghiprac.banqP.Customer;

import java.util.List;

import org.aghiprac.banqP.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface CustomerService{	
	public Customer saveCustomer(Customer customer);
	public List<Customer> getAllCustomer() ;
	public Customer getCustomerById(Long IdCustomer);

}
