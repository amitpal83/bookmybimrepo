package com.bookmybim.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmybim.user.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Integer > {

}
