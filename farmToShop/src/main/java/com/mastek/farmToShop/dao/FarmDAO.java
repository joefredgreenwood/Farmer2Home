package com.mastek.farmToShop.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.farmToShop.entities.Farm;


@Repository
public interface FarmDAO extends CrudRepository<Farm, Integer>{

}
