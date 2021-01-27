package org.aghiprac.banqP.surgery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SurgeryController {

	@Autowired
	private SurgeryService surgeryService;

	@RequestMapping(value = "/pay", method = RequestMethod.PUT)
	public boolean pay(@RequestParam long idAccount,
					   @RequestParam double amount,
					   @RequestParam long idEmp) {
		System.out.println("ok");
		return surgeryService.pay(idAccount, amount, idEmp);
	}

	@RequestMapping(value = "/", method = RequestMethod.PUT)
	public boolean withdrawal(@RequestParam Long idCompte,
			                  @RequestParam double amount,
			                  @RequestParam long codeEmp) {
		return surgeryService.withdrawal(idCompte, amount, codeEmp);
	}

	@RequestMapping(value = "/transfer", method = RequestMethod.PUT)
	public boolean transfer(@RequestParam long idCompteOne,
			                @RequestParam long idCompteTwo,
			                @RequestParam double amount,
			                @RequestParam long codeEmp) {
		return surgeryService.transfer(idCompteOne, idCompteTwo, amount, codeEmp);
	}
	
	
}
