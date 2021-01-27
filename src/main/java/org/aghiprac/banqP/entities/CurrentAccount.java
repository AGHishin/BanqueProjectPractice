package org.aghiprac.banqP.entities;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Entity
@DiscriminatorValue("CA")
@NoArgsConstructor
@AllArgsConstructor	
public class CurrentAccount extends Account {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private double overdraft ; //découvert
}
