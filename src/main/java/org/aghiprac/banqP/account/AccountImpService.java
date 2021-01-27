package org.aghiprac.banqP.account;

import java.util.Date;
import java.util.List;

import org.aghiprac.banqP.entities.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AccountImpService implements AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public Account saveAccount(Account account) {
		// TODO Auto-generated method stub
		account.setDateCreation(new Date());
		return accountRepository.save(account);
	}

	@Override
	public List<Account> getAllAccount() {
		// TODO Auto-generated method stub
		return accountRepository.findAll();
	}

	@Override
	public Account getAccount(Long idAccount) {
		// TODO Auto-generated method stub
		System.out.println(idAccount);
		return accountRepository.findById(idAccount).get();
	}

}
