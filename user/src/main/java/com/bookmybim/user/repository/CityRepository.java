package com.bookmybim.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmybim.user.entity.City;

public interface CityRepository extends JpaRepository<City, Integer> {

	List<City> findByCountryCode(String countryCode);
}
