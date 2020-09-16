package com.mastek.farmToShop.APIs;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


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

	}


