package com.mastek.farmToShop.APIs;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.farmToShop.entities.Farm;

@Path("/farmtoshop/")
public interface FarmAPI {
	
	//http://localhost:7777/farmtoshop/farm/list
	@GET
	@Path("/farm/list")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Iterable<Farm> listAllFarms();
	
	@GET
	@Path("/farm/find/{farmID}")
	@Produces({MediaType.APPLICATION_JSON})
	public Farm findByFarmid(@PathParam("farmID") int farmID);
	
	
	@POST
	@Path("/farm/register")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces({MediaType.APPLICATION_JSON})
	public Farm registerNewFarm(@BeanParam Farm newFarm);
	
}
