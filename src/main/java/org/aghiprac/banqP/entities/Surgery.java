package org.aghiprac.banqP.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_surgery",length = 1)
public class Surgery implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idOperation;
private Date dateOperation;
private double amount;
@ManyToOne
@JoinColumn(name = "idAccount")
private Account account;
@ManyToOne
@JoinColumn(name = "idEmployee")
private Employee employee;


}
