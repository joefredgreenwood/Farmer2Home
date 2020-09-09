package com.mastek.farmToShop.entities;

import java.util.HashSet;
import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table
public class Farm {
	
	
	public Farm() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int farmID;
	String farmName;
	FarmLocation farmLocation;
	FarmType farmType;
	String farmUsername;
	String farmPassword;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getFarmID() {
		return farmID;
	}
	public void setFarmID(int farmID) {
		this.farmID = farmID;
	}
	public String getFarmName() {
		return farmName;
	}
	public void setFarmName(String farmName) {
		this.farmName = farmName;
	}
	public FarmLocation getFarmLocation() {
		return farmLocation;
	}
	public void setFarmLocation(FarmLocation farmLocation) {
		this.farmLocation = farmLocation;
	}
	public FarmType getFarmType() {
		return farmType;
	}
	public void setFarmType(FarmType farmType) {
		this.farmType = farmType;
	}
	public String getFarmUsername() {
		return farmUsername;
	}
	public void setFarmUsername(String farmUsername) {
		this.farmUsername = farmUsername;
	}
	public String getFarmPassword() {
		return farmPassword;
	}
	public void setFarmPassword(String farmPassword) {
		this.farmPassword = farmPassword;
	}
	
	
	
	
	
	////////////////////////////////////////////////Foreign Keys//////////////////////////////////////////

	/*Set<Product> farmProduce = new HashSet<Product>(); //Many to many

/*	Set<Product> farmProduce = new HashSet<Product>();					//Many to many
	@ManyToMany(cascade=CascadeType.ALL)								// configured many to many associations for the entities
	@JoinTable(name="Farm_Produce", 									// the join table name
			   joinColumns= {@JoinColumn(name="fk_farmID")}, 			// foreign key for the current class
			   inverseJoinColumns = {@JoinColumn(name="fk_productID")})	//foreign key column for the collection

	
	@XmlTransient	// this will ignore the association property when shared via service
	public Set<Product> getFarmProduce() {
		return farmProduce;
	}
	public void setFarmProduce(Set<Product> farmProduce) {
		this.farmProduce = farmProduce;
	}
*/
	
	
	
	
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + farmID;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Farm other = (Farm) obj;
		if (farmID != other.farmID)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Farms [farmID=" + farmID + ", farmName=" + farmName + ", farmLocation=" + farmLocation + ", farmType="
				+ farmType + ", farmUsername=" + farmUsername + ", farmPassword=" + farmPassword + "]";
	}

	
	

}
