package com.mastek.farmToShop.APIs;

import java.util.Set;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.farmToShop.entities.AssignedProduct;
import com.mastek.farmToShop.entities.Customer;
import com.mastek.farmToShop.entities.Product;

@Path("/farmtoshop/")
public interface ProductAPI {
	
		//http://localhost:7777/farmtoshop/product/list

		@GET
		@Path("/product/list")
		@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
		public Set<Product> listAllProducts();

		@GET
		@Path("/product/find/{productID}")
		@Produces({MediaType.APPLICATION_JSON})
		public Product findByProductid(@PathParam("productID") int productID);


		@POST
		@Path("/product/register")
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
		@Produces({MediaType.APPLICATION_JSON})
		public Product registerNewProduct(@BeanParam Product newProduct);

		
		@DELETE
		@Path("/product/delete/{assignedProductID}")
		@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
		public AssignedProduct deleteProduct(@PathParam("assignedProductID") int assignedProductID);
	}


