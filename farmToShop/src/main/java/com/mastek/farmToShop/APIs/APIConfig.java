package com.mastek.farmToShop.APIs;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.mastek.farmToShop.services.FarmShopServices;



@Component
public class APIConfig extends ResourceConfig {
			  
	public APIConfig() {
	register (FarmShopServices.class);
	register (CORSFilter.class);
	}

}
