package com.mastek.farmToShop.entities;

import java.util.HashSet;
import java.util.Set;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table

public class Customer {
	
	public Customer() {
	
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int customerID;
	String customerForename;
	String customerSurname;
	String customerAddress;
	String customerDOB;
	String customerEmail;
	String customerUsername;
	String customerPassword;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerForename() {
		return customerForename;
	}
	public void setCustomerForename(String customerForename) {
		this.customerForename = customerForename;
	}
	public String getCustomerSurname() {
		return customerSurname;
	}
	public void setCustomerSurname(String customerSurname) {
		this.customerSurname = customerSurname;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerDOB() {
		return customerDOB;
	}
	public void setCustomerDOB(String customerDOB) {
		this.customerDOB = customerDOB;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerUsername() {
		return customerUsername;
	}
	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	////////////////////////////////////////////Foreign Keys//////////////////////////////////////////////////////
//	Set<Basket> customersBaskets = new HashSet<Basket>();	
	
//	@ManyToMany(cascade=CascadeType.ALL)									//SAJS Join
//	@JoinTable(name="Customers_Baskets",
//			   joinColumns= {@JoinColumn(name="fk_customerID")},
//			   inverseJoinColumns = {@JoinColumn(name="fk_basketID")})
//	
//	@XmlTransient
//	public Set<Basket> getCustomersBaskets() {
//		return customersBaskets;
//	}
//	public void setCustomersBaskets(Set<Basket> customersBaskets) {
//		this.customersBaskets = customersBaskets;
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Customers [customerID=" + customerID + ", customerForename=" + customerForename + ", customerSurname="
				+ customerSurname + ", customerAddress=" + customerAddress + ", customerDOB=" + customerDOB
				+ ", customerEmail=" + customerEmail + ", customerUsername=" + customerUsername + ", customerPassword="
				+ customerPassword + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customerID;
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
		Customer other = (Customer) obj;
		if (customerID != other.customerID)
			return false;
		return true;
	}

	
	
	
	
	
}
