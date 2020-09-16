package com.mastek.farmToShop.entities;

import java.text.Normalizer.Form;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import javax.xml.bind.annotation.XmlRootElement;
import javax.ws.rs.FormParam;

import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity
@Table(name="Transaction_DAO")
public class Transaction {
	
	public Transaction() {

	}


		



	@FormParam("transactionID")
	int transactionID;
	
	@FormParam("transactionDate")
	String transactionDate;
	
	@FormParam("transactionValue")
	double transactionValue;


	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public double getTransactionValue() {
		return transactionValue;
	}
	public void setTransactionValue(double transactionValue) {
		this.transactionValue = transactionValue;
	}
	
	
	Basket linkedBasket;					//SAJS ONE TO ONE BASKET AND TRANSACTION
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_BasketID")
	@XmlTransient
	public Basket getLinkedBasket() {
		return linkedBasket;
	}
	public void setLinkedBasket(Basket linkedBasket) {
		this.linkedBasket = linkedBasket;
	}
	

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + transactionID;
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
		Transaction other = (Transaction) obj;
		if (transactionID != other.transactionID)
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Transaction [transactionID=" + transactionID + ", transactionDate=" + transactionDate
				+ ", transactionValue=" + transactionValue + "]";
	}
	
	
	
	
	
	
	
	
	
}
