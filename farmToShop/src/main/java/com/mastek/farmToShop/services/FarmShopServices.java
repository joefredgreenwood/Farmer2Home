package com.mastek.farmToShop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mastek.farmToShop.APIs.BasketAPI;
import com.mastek.farmToShop.APIs.CustomerAPI;
import com.mastek.farmToShop.APIs.FarmAPI;
import com.mastek.farmToShop.APIs.ProductAPI;
import com.mastek.farmToShop.APIs.TransactionAPI;
import com.mastek.farmToShop.dao.AssignedProductDAO;
import com.mastek.farmToShop.dao.BasketDAO;
import com.mastek.farmToShop.dao.CustomerDAO;
import com.mastek.farmToShop.dao.FarmDAO;
import com.mastek.farmToShop.dao.ProductDAO;
import com.mastek.farmToShop.dao.TransactionDAO;
import com.mastek.farmToShop.entities.Basket;
import com.mastek.farmToShop.entities.Customer;
import com.mastek.farmToShop.entities.Farm;
import com.mastek.farmToShop.entities.Product;
import com.mastek.farmToShop.entities.Transaction;

@Component
public class FarmShopServices implements ProductAPI, BasketAPI, CustomerAPI, FarmAPI, TransactionAPI {
	
	@Autowired
	ProductDAO prodDAO;

	@Autowired
	AssignedProductDAO AsspDAO;
	
	@Autowired
	BasketDAO BasDAO;
	
	@Autowired
	CustomerDAO CusDAO;
	
	@Autowired
	FarmDAO FarDAO;
	
	@Autowired
	TransactionDAO TranDAO;
	
	
	///////////////////////////////////// Product API /////////////////////////////////////////////////

	public Iterable<Product> listAllProducts() {
		// TODO Auto-generated method stub
		return prodDAO.findAll();
	}

	public Product findByProductid(int productID) {
		// TODO Auto-generated method stub
		return prodDAO.findById(productID).get();
	}

	public Product registerNewProduct(Product newProduct) {
		newProduct = prodDAO.save(newProduct);
		return newProduct;
	}

	///////////////////////////////////// Transaction API ////////////////////////////////////////////////////
	
	public Iterable<Transaction> listAllTransactions() {
		// TODO Auto-generated method stub
		return TranDAO.findAll();
	}

	public Transaction findByTransactionid(int transactionID) {
		// TODO Auto-generated method stub
		return TranDAO.findById(transactionID).get();
	}

	public Transaction registerNewTransaction(Transaction newTransaction) {
		newTransaction = TranDAO.save(newTransaction);
		return newTransaction;
	}
	
	
	//////////////////////////////////////// Farm API //////////////////////////////////////////////

	public Iterable<Farm> listAllFarms() {
		// TODO Auto-generated method stub
		return FarDAO.findAll();
	}

	public Farm findByFarmid(int farmID) {
		// TODO Auto-generated method stub
		return FarDAO.findById(farmID).get();
	}

	public Farm registerNewFarm(Farm newFarm) {
		newFarm = FarDAO.save(newFarm);
		return newFarm;
	}
	
	//////////////////////////////////////// Customer API ///////////////////////////////////////////////

	public Iterable<Customer> listAllCustomers() {
		// TODO Auto-generated method stub
		return CusDAO.findAll();
	}

	public Customer findByCustomerid(int customerID) {
		// TODO Auto-generated method stub
		return CusDAO.findById(customerID).get();
	}

	public Customer registerNewCustomer(Customer newCustomer) {
		newCustomer = CusDAO.save(newCustomer);
		return newCustomer;
	}

	///////////////////////////////////////// Basket API //////////////////////////////////////////////////
	
	public Iterable<Basket> listAllBaskets() {
		// TODO Auto-generated method stub
		return BasDAO.findAll();
	}

	public Basket findByBasketid(int basketID) {
		// TODO Auto-generated method stub
		return BasDAO.findById(basketID).get();
	}

	public Basket registerNewBasket(Basket newBasket) {
		newBasket = BasDAO.save(newBasket);
		return newBasket;
	}
	
	
	

	
}
