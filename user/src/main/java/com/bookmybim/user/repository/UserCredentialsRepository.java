package com.bookmybim.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmybim.user.entity.UserCredentials;

public interface UserCredentialsRepository extends JpaRepository<UserCredentials, Integer>{
	public List<UserCredentials> findByUserName(String userName);
}
