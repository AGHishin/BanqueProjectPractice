package org.aghiprac.banqP.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@DiscriminatorValue("SA")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SavingsAccount extends Account {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private double rate; // taux

}
