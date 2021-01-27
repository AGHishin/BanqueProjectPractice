package org.aghiprac.banqP.account;

import java.util.List;

import javax.websocket.server.PathParam;

import org.aghiprac.banqP.entities.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	@Autowired
	public AccountService accountService;

	@RequestMapping(value = "/account/{id}",method =RequestMethod.GET)
	public Account getAccount(@PathVariable(value = "id") Long idAccount) {
		System.out.println(idAccount);
		return accountService.getAccount(idAccount);
	}

	@RequestMapping(value = "/account",method = RequestMethod.POST)
	public Account saveAccount(@RequestBody Account account) {
		
		return accountService.saveAccount(account);
	}

	@RequestMapping(value = "/account",method = RequestMethod.GET)
	public List<Account> getAllAccount( Long idAccount) {
		return accountService.getAllAccount();
	}
	
}
