package org.aghiprac.banqP.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
//@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_CPTE",discriminatorType = DiscriminatorType.STRING,length = 2)
public abstract class Account implements Serializable{
	@Id
	private String idAccount;
	private Date dateCreation;
	private double balance;
	@ManyToOne
	@JoinColumn(name = "idCustomer")
	private Customer customer;
	@ManyToOne
	@JoinColumn(name ="idEmployee")
	private Employee employeeCreateAccount;
	@OneToMany(mappedBy = "account",fetch = FetchType.LAZY)
	private Collection<Surgery> surgeries;
	

}
