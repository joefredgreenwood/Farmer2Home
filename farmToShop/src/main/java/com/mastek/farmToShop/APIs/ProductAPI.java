package com.mastek.farmToShop.APIs;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.farmToShop.entities.Basket;
import com.mastek.farmToShop.entities.Customer;
import com.mastek.farmToShop.entities.Product;

@Path("/farmtoshop/")
public interface ProductAPI {
	
		//http://localhost:7777/farmtoshop/product/list

		@GET
		@Path("/product/list")
		@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
		public Iterable<Product> listAllProducts();

		@GET
		@Path("/product/find/{productID}")
		@Produces({MediaType.APPLICATION_JSON})
		public Product findByProductid(@PathParam("productID") int productID);


		@POST
		@Path("/product/register")
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
		@Produces({MediaType.APPLICATION_JSON})
		public Product registerNewProduct(@BeanParam Product newProduct);
		
		
		// http://localhost:7777/farmtoshop/Product/delete
		@DELETE
		@Path("/product/delete/{productID}")
		@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
		public Product deleteProduct(@PathParam("productID") int productID);
		
		//http://localhost:7777/farmtoshop/product/update
		@POST 														
		@Path("/product/update/{productID}")									 
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED)				 
		@Produces(MediaType.APPLICATION_JSON)							 
		public Product updateProduct(
				@FormParam("productID") int productID,
				@FormParam("productName")String productName,
				@FormParam("productQuantity")int productQuantity,
				@FormParam("productPrice") String productPric);
				}