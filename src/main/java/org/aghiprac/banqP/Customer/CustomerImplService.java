package org.aghiprac.banqP.Customer;

import java.util.List;

import org.aghiprac.banqP.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CustomerImplService implements CustomerService {
	@Autowired CustomerRepository customerRepository;

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Customer getCustomerById(Long IdCustomer) {
		// TODO Auto-generated method stub
		return customerRepository.findById(IdCustomer).get();
	}

}
