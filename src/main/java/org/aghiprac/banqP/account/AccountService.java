package org.aghiprac.banqP.account;

import java.util.List;

import org.aghiprac.banqP.entities.Account;


public interface AccountService {

		public Account saveAccount(Account account);
		public List<Account> getAllAccount();
		public Account getAccount(Long idAccount);

}
