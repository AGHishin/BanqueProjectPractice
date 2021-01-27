package org.aghiprac.banqP.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("P")
public class Payment extends Surgery {
	

}
