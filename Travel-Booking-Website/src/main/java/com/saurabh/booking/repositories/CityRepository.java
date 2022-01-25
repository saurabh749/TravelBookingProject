package com.saurabh.booking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saurabh.booking.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

}
