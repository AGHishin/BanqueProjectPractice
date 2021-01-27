package org.aghiprac.banqP.surgery;


import org.springframework.stereotype.Service;


public interface SurgeryService {
	public boolean pay(long idCompte,double amount,long codeEmp);
	public boolean withdrawal(Long idCompte,double amount,long codeEmp);
	public boolean transfer(long idCompteOne,long idCompteTwo, double amount,long codeEmp);

}
