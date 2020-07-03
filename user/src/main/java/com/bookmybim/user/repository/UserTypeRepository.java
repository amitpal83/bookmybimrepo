package com.bookmybim.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmybim.user.entity.UserType;

public interface UserTypeRepository extends JpaRepository<UserType, Integer> {

}
