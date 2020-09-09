package com.mastek.farmToShop.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.farmToShop.entities.AssignedProduct;

@Repository
public interface AssignedProductDAO extends CrudRepository<AssignedProduct, Integer> {

}
