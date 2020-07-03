package com.bookmybim.user.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="mst_countries")
public class Country {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryCthree() {
		return countryCthree;
	}

	public void setCountryCthree(String countryCthree) {
		this.countryCthree = countryCthree;
	}

	public String getCountryCtwo() {
		return countryCtwo;
	}

	public void setCountryCtwo(String countryCtwo) {
		this.countryCtwo = countryCtwo;
	}

	public String getPhonecode() {
		return phonecode;
	}

	public void setPhonecode(String phonecode) {
		this.phonecode = phonecode;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Id
	@Column(name="id")
	public int id;
	
	@Column(name="name")
	public String name;
	
	@Column(name="country_cthree")
	public String countryCthree;
	
	@Column(name="country_ctwo")
	public String countryCtwo;
	
	@Column(name="phonecode")
	public String phonecode;
	
	@Column(name="capital")
	public String capital;
	
	@Column(name="currency")
	public String currency;
	
	@Column(name="created_at")
	public Date createdAt;
	
	@Column(name="updated_at")
	public Date updatedAt;
	
	
}
