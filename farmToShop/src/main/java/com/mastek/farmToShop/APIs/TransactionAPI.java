package com.mastek.farmToShop.APIs;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.farmToShop.entities.Product;
import com.mastek.farmToShop.entities.Transaction;
@Path("/farmtoshop/")
public interface TransactionAPI {
	
	//http://localhost:7777/farmtoshop/transaction/list

	@GET
	@Path("/transaction/list")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Iterable<Transaction> listAllTransactions();

	@GET
	@Path("/transaction/find/{transactionID}")
	@Produces({MediaType.APPLICATION_JSON})
	public Transaction findByTransactionid(@PathParam("transactionID") int transactionID);


	@POST
	@Path("/transaction/register")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces({MediaType.APPLICATION_JSON})
	public Transaction registerNewTransaction(@BeanParam Transaction newTransaction);
	
			/*
			//http://localhost:7777/farmtoshop/transaction/update
			@POST 														
			@Path("/transaction/update/{transactionID}")									 
			@Consumes(MediaType.APPLICATION_FORM_URLENCODED)				 
			@Produces(MediaType.APPLICATION_JSON)							 
			public Product updateTransaction(
					@FormParam("transactionID") int transactionID,
					@FormParam("transactionDate") String transactionDate,
					@FormParam("transactionValue") double transactionValue);
				*/
					
					}



