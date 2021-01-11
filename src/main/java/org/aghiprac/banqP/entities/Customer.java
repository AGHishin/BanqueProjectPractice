package org.aghiprac.banqP.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
public class Customer  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCustomer;
	private String nameCustomer;
	//@OneToMany(mappedBy="customer",fetch = FetchType.LAZY)
	//private Collection<Account> Accounts;
	

}
