package com.mastek.farmToShop.services;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import javax.transaction.Transactional;

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
import com.mastek.farmToShop.entities.AssignedProduct;
import com.mastek.farmToShop.entities.Basket;
import com.mastek.farmToShop.entities.Customer;
import com.mastek.farmToShop.entities.Farm;
import com.mastek.farmToShop.entities.FarmLocation;
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
	
	
	public Set<Product> findProductByFarmID(int farmID){
		Farm farm = FarDAO.findById(farmID).get();
		int count = farm.getFarmProduce().size();
		System.out.println(count+" Products Found");
		Set<Product> prods = farm.getFarmProduce();
		return prods;
		
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
	@Transactional
	public Farm registerNewFarm(Farm newFarm) throws NoSuchElementException{
		if(FarDAO.findByUsername(newFarm.getFarmUsername())!=null) {
			throw new NoSuchElementException("Username already exists");
		}
		else {
		newFarm = FarDAO.save(newFarm);
		return newFarm;
		}
	}
	
	public Iterable<Farm> findByFarmLocation(FarmLocation farmLocation) {
		Iterable<Farm> farm = FarDAO.findByFarmLocation(farmLocation);
		return farm;
	}
	@Transactional
	public Farm findByFarmUsernameAndPassword(String username, String password) throws IllegalArgumentException{
		Farm farm = FarDAO.findByUsernameAndPassword(username, password);
		if (farm==null) {
			throw new IllegalArgumentException("Username or Password invalid");
		}
		return farm;
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
	@Transactional
	public Customer registerNewCustomer(Customer newCustomer) throws NoSuchElementException{
		Basket basket = new Basket();
		BasDAO.save(basket);
		if (CusDAO.findByUsername(newCustomer.getCustomerUsername())!=null) {
			throw new NoSuchElementException("Username already exists");
		}
		else {
		newCustomer = CusDAO.save(newCustomer);
		linkBasketToCustomer(basket.getBasketID(), newCustomer.getCustomerID());
		return newCustomer;}
	}
	
	public Customer findByUsernameAndPassword(String username, String password) throws IllegalArgumentException{
		
			Customer cus = CusDAO.findByUsernameAndPassword(username, password);
			if (cus==null) {
				throw new IllegalArgumentException("Invalid Username or Password");} 	
			return cus;
			
//		} catch (IllegalArgumentException e) {
//			System.out.println("Error inserting username and password");
//			e.printStackTrace();
//			Customer cus = null;
//			return cus;
//		}
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

	public Customer deleteCustomer(int customerID) {
		
		Customer cus = CusDAO.findById(customerID).get();
		CusDAO.deleteById(customerID);
		return cus;
		
		
	}

	
	
	
	



	
//	@Transactional
//	public Basket customerBuysProduct(int custID) {
//		
//	}
//


//////////////////////////////////////////////////// JOINS ////////////////////////////////////////////////////////////
	
	@Transactional
	public Farm assignProductToFarm(int farmID, int productID) {
		Farm farm = FarDAO.findById(farmID).get();
		Product prod = prodDAO.findById(productID).get();
		
		
		prod.setFarmProduct(farm);
		farm.getFarmProduce().add(prod);
		FarDAO.save(farm);
		prodDAO.save(prod);
		
		
		return farm;
	}
	
	@Transactional
	public AssignedProduct assigednProductToProduct(int assignedID, int productID) {
		AssignedProduct aprod = AsspDAO.findById(assignedID).get();
		Product prod = prodDAO.findById(productID).get();
		
		aprod.setCurrentProduct(prod);
		prod.getAssignedProducts().add(aprod);
		
		prodDAO.save(prod);
		AsspDAO.save(aprod);
		
		return aprod;
	}
	
	@Transactional
	public AssignedProduct assignedProductToBasket(int assignedID, int basketID) {
		AssignedProduct aprod = AsspDAO.findById(assignedID).get();
		Basket bask = BasDAO.findById(basketID).get();
		
		aprod.setCurrentBasket(bask);
		bask.getBasketProducts().add(aprod);
		
		AsspDAO.save(aprod);
		BasDAO.save(bask);
		
		
		return aprod;

	}
	
	@Transactional
	public Transaction linkTransactionToBasket(int tranID, int basketID) {
		Transaction tran = TranDAO.findById(tranID).get();
		Basket bask = BasDAO.findById(basketID).get();
		
		tran.setLinkedBasket(bask);
		TranDAO.save(tran);
		
		
		return tran;
	}
	
	
	@Transactional
	public Basket linkBasketToCustomer(int baskID, int custID) {
		Basket bask = BasDAO.findById(baskID).get();
		Customer cust = CusDAO.findById(custID).get();
		
		bask.setLinkedCustomer(cust);
		cust.getCustomersBaskets().add(bask);
		
		BasDAO.save(bask);
		CusDAO.save(cust);
		
		
		return bask;
	}


	@Transactional
	public Iterable<Product> findProductByFarUsernameAndPassword(String username, String password) {
		Farm farm = FarDAO.findByUsernameAndPassword(username, password);
		System.out.println(farm.getFarmProduce().size());
		Iterable<Product> prods = farm.getFarmProduce();
		return prods;
	}

	@Transactional
	public Product registerNewFarmProducts(Product product, String username, String password) {
		Farm farm = FarDAO.findByUsernameAndPassword(username, password);		
		assignProductToFarm(farm.getFarmID(), product.getProductID());
		product = prodDAO.save(product);
		farm = FarDAO.save(farm);
		return product;
	}
	
	
	@Transactional
	public Set<Product> findProducstByFarmID(int farmID) {
		Farm farm = FarDAO.findById(farmID).get();
		System.out.println(farm.getFarmProduce().size());
		Set<Product> prod = farm.getFarmProduce();
		return prod;
	}

	@Transactional
	public Basket findBasketByUsernameAndPassword(String username, String password) {
		Basket basket = null;
		Customer cust = CusDAO.findByUsernameAndPassword(username, password);
		System.out.println(cust.getCustomersBaskets().size());
		Set<Basket> basks = cust.getCustomersBaskets();
		for (Basket bask : basks) {
			try {
				if(bask.getLinkedTransactions()!=null) {
					basket = null;
					
				}
				else {
					basket = bask;
					break;
				}
			} catch (NullPointerException e) {
				basket = bask;
				break;
//				e.printStackTrace();
			}
//			else {
//				basket = null;
//			}
		}
		if(basket==null) {
			Basket baske = new Basket();
			BasDAO.save(baske);
			linkBasketToCustomer(baske.getBasketID(), cust.getCustomerID());
			basket = baske;
			
			
		}
		return basket;
	}

	

	
	
	
	

	
}
