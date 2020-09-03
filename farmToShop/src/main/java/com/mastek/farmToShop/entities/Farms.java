package com.mastek.farmToShop.entities;

import java.util.HashSet;
import java.util.Set;

public class Farms {
	
	
	public Farms() {
		// TODO Auto-generated constructor stub
	}
	
	int farmID;
	String farmName;
	FarmLocation farmLocation;
	FarmType farmType;
	String farmUsername;
	String farmPassword;

	
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
	Set<Products> farmProduce = new HashSet<Products>(); //Many to many
	
		
	public Set<Products> getFarmProduce() {
		return farmProduce;
	}
	public void setFarmProduce(Set<Products> farmProduce) {
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
		Farms other = (Farms) obj;
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
