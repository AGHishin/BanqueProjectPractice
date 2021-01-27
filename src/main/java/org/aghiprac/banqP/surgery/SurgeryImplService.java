package org.aghiprac.banqP.surgery;

import java.util.Date;


import org.aghiprac.banqP.Employee.EmployeeRepository;
import org.aghiprac.banqP.account.AccountRepository;
import org.aghiprac.banqP.entities.Account;
import org.aghiprac.banqP.entities.Employee;
import org.aghiprac.banqP.entities.Payment;
import org.aghiprac.banqP.entities.Surgery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class SurgeryImplService  implements SurgeryService{

	@Autowired
	private SurgeryRepository surgeryRepository;
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired EmployeeRepository empRepository;
	
	@Override
	@Transactional 
	public boolean pay(long idAcc, double amount, long idEmp) {
		// TODO Auto-generated method stub
		Account account=accountRepository.findById(idAcc).get();
		Employee employee=empRepository.findById(idEmp).get();
		Surgery surgery= new Payment();
		surgery.setDateOperation(new Date());
		surgery.setAmount(amount);
		surgery.setAccount(account);
		surgery.setEmployee(employee);
		
		surgeryRepository.save(surgery);
		account.setBalance(account.getBalance()+amount);
		return true;
	}

	@Override
	@Transactional
	public boolean withdrawal(Long idAcc, double amount, long idEmp) {
		// TODO Auto-generated method stub
		Account account=accountRepository.findById(idAcc).get();
		if (account.getBalance()<amount)  throw new RuntimeException("solde insuffisant");	
		
		Employee employee=empRepository.findById(idEmp).get();
		Surgery surgery= new Payment();
		surgery.setDateOperation(new Date());
		surgery.setAmount(amount);
		surgery.setAccount(account);
		surgery.setEmployee(employee);
		
		surgeryRepository.save(surgery);
		account.setBalance(account.getBalance()-amount);
		return true;
		
	}

	@Override
	@Transactional
	public boolean transfer(long idCompteOne, long idCompteTwo, double amount, long idEmp) {
		// TODO Auto-generated method stub
		withdrawal(idCompteOne, amount, idEmp);
		pay(idCompteTwo, amount, idEmp);
		return true;
	}

}
