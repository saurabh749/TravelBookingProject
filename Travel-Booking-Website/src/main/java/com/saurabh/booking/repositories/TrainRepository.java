package com.saurabh.booking.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.saurabh.booking.entities.Train;

@Repository
public interface TrainRepository extends JpaRepository<Train, Integer> {
	
	@Query(value="select * from city join train on city.cityid=train.cityid where city.cityid=? and city.cityfrom=? and city.tocity=?",nativeQuery=true)
	public List<Train> train_details(int id,String cityfrom,String tocity);

}
