package com.mastek.farmToShop.entities;

import java.util.HashSet;
import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.ws.rs.FormParam;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity
@Table
@NamedQueries({
	@NamedQuery(name="Farm.findByUsernameAndPassword", //Declare query name as method in dao
			query="select a from Farm a where a.farmUsername=:username and a.farmPassword=:password"),
	@NamedQuery(name="Farm.findByUsername", //Declare query name as method in dao
			query="select a from Farm a where a.farmUsername=:username"),
	@NamedQuery(name="Farm.findByFarmLocation",
			query="select f from Farm f where f.farmLocation=:farmLocation")
		})
public class Farm {
	
	
	public Farm() {
		
	}
	


	@FormParam("farmID")
	int farmID;
	
	@FormParam("farmName")
	String farmName;
	
	@FormParam("farmLocation")
	FarmLocation farmLocation;
	
	@FormParam("farmType")
	FarmType farmType;
	
	@FormParam("farmUsername")
	String farmUsername;
	
	@FormParam("farmPassword")
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

	
	Set<Product> farmProduce = new HashSet<Product>();					
	
	@OneToMany(mappedBy="farmProduct", cascade=CascadeType.ALL)
	@XmlTransient
	public Set<Product> getFarmProduce() {
		return farmProduce;
	}
	public void setFarmProduce(Set<Product> farmProduce) {
		this.farmProduce = farmProduce;
	}

	
	
	
	
	
	
	
	
	
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
