package com.mastek.farmToShop.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.farmToShop.entities.Basket;


@Repository
public interface BasketDAO extends CrudRepository<Basket, Integer>{

}
