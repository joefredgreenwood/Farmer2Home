package com.mastek.farmToShop.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mastek.farmToShop.entities.Product;

@Component
@Repository
public interface ProductDAO extends CrudRepository<Product, Integer>{


//Iterable<Product> findByFarmID(@Param("farmID")int farmID);


}
