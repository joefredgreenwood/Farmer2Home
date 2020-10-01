package com.mastek.farmToShop.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mastek.farmToShop.entities.Farm;
import com.mastek.farmToShop.entities.FarmLocation;


@Repository
public interface FarmDAO extends CrudRepository<Farm, Integer>{
	
	Iterable<Farm> findByFarmLocation(@Param("farmLocation")FarmLocation farmLocation);

}
