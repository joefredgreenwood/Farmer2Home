package com.mastek.farmToShop.dao;

import org.springframework.data.repository.CrudRepository;

import com.mastek.farmToShop.entities.Farm;

public interface FarmDAO extends CrudRepository<Farm, Integer>{

}
