package com.mastek.farmToShop.APIs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mastek.farmToShop.dao.ProductDAO;
import com.mastek.farmToShop.entities.Product;

@RestController
@RequestMapping("/product")
public class ProductAPItest {
	
	@Autowired
	private ProductDAO repo;
	
	public ProductDAO getRepo() {
		return repo;
	}

	public void setRepo(ProductDAO repo) {
		this.repo = repo;
	}
	
	
	@GetMapping("/list")
	public Iterable<Product> getItems(){
		return getRepo().findAll();
		
	}
	
	
	@PostMapping("/create")
	public @ResponseBody String createItem(
			@RequestParam String productName,
			@RequestParam int productQuantity,
			@RequestParam double productPrice)

	{
		Product p = new Product();
		p.setProductName(productName);
		p.setProductQuantity(productQuantity);
		p.setProductPrice(productPrice);

		repo.save(p);
		
		return "Product created and saved";
	}
	
	@DeleteMapping("/delete/{productID}")
	public String deleteProduct(@PathVariable int productID) {
		getRepo().deleteById(productID);
		return "Product with ID: " + Integer.toString(productID) +" , deleted.";
	}

}
