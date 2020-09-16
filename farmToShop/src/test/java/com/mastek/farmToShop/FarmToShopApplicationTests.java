package com.mastek.farmToShop;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mastek.farmToShop.dao.AssignedProductDAO;
import com.mastek.farmToShop.dao.BasketDAO;
import com.mastek.farmToShop.dao.CustomerDAO;
import com.mastek.farmToShop.dao.FarmDAO;
import com.mastek.farmToShop.dao.ProductDAO;
import com.mastek.farmToShop.dao.TransactionDAO;

import com.mastek.farmToShop.entities.Basket;
import com.mastek.farmToShop.entities.Customer;

import com.mastek.farmToShop.entities.AssignedProduct;
import com.mastek.farmToShop.entities.Farm;
import com.mastek.farmToShop.entities.FarmLocation;
import com.mastek.farmToShop.entities.FarmType;

import com.mastek.farmToShop.entities.Product;
import com.mastek.farmToShop.entities.Transaction;

@SpringBootTest
class FarmToShopApplicationTests {
	
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
	
	

/*	@Test
	void addProductTest() {

	@Test
	void addProduct() {

		Product prod = new Product();
		prod.setProductName("Potato");
		prod.setProductPrice(2.50);
		prod.setProductQuantity(100);
		
		prod = prodDAO.save(prod);
		assertNotNull(prod, "Work pls");;
		System.out.println(prod);
		
		
	}
*/
/*	@Test
	void addBasketTest(){
		
		Basket bas = new Basket();
		bas.setBasketValue(12.5);
		
		bas = BasDAO.save(bas);
		System.out.println(bas);
		
	}
*/
	
/*	@Test
	void addCustomerTest() {
		
		Customer cus = new Customer();
		cus.setCustomerForename("James");
		cus.setCustomerSurname("Bond");
		cus.setCustomerAddress("123 London Road, Leeds LS1 2PB");
		cus.setCustomerDOB("05/02/1990");
		cus.setCustomerEmail("james_bond@gmail.com");
		cus.setCustomerUsername("bond_mi6");
		cus.setCustomerPassword("imaspy12");
		
		cus = CusDAO.save(cus);
		System.out.println(cus);
		
	}
*/
	
/*	@Test
	void addTransactionTest() {
		
		Transaction tran = new Transaction();
		tran.setTransactionDate("01/09/2020");
		tran.setTransactionValue(12.5);
		
		tran = TranDAO.save(tran);
		System.out.println(tran);
	}
*/	

	
//	@Test
//	void removeProductTest() {
//		prodDAO.deleteById(1);
//	}

//	@Test
//	void findProductByID() {
//		Product prod = prodDAO.findById(1).get();
//		System.out.println(prod);
//	}
	
	@Test
	void addFarm() {
		Farm farm = new Farm();
		farm.setFarmLocation(FarmLocation.SCOTLAND);
		farm.setFarmUsername("Farm1");
		farm.setFarmName("Mastek");
		farm.setFarmPassword("Password");
		farm.setFarmType(FarmType.DAIRY);
		
		farm = FarDAO.save(farm);
		System.out.println(farm);
		
	}
	
	@Test
	void addAssignedProduct() {
		AssignedProduct aprod = new AssignedProduct();
		aprod.setProductQuantity(20);
		
		aprod = AsspDAO.save(aprod);
		System.out.println(aprod);
	}
	
}

