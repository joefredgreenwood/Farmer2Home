package com.mastek.farmToShop.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Transactions {
	
	public Transactions() {
		// TODO Auto-generated constructor stub
	}

	
	int transactionID;	
	String transactionData;
	float transactionValue;
	
	
	
	
}
