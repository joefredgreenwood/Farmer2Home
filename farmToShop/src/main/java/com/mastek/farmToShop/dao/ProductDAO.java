package com.mastek.farmToShop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.mastek.farmToShop.entities.Product;

public interface ProductDAO extends JpaRepository<Product, Integer>{
//CrudRepository<Product, Integer>{

}
