package com.bookmybim.user.controller;

import java.util.ArrayList;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.bookmybim.user.entity.Country;
import com.bookmybim.user.entity.Course;
import com.bookmybim.user.entity.Degree;
import com.bookmybim.user.entity.Institute;
import com.bookmybim.user.entity.UserCredentials;
import com.bookmybim.user.entity.UserType;
import com.bookmybim.user.repository.CityRepository;
import com.bookmybim.user.repository.CountryRepository;
import com.bookmybim.user.repository.CourseRepository;
import com.bookmybim.user.repository.DegreeRepository;
import com.bookmybim.user.repository.InstituteRepository;
import com.bookmybim.user.repository.UserCredentialsRepository;
import com.bookmybim.user.repository.UserTypeRepository;
import com.bookmybim.user.entity.City;

import net.bytebuddy.asm.Advice.This;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MasterController {

	@Autowired
	private CountryRepository countryRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private DegreeRepository degreeRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private InstituteRepository instituteRepository;
	
	@Autowired
	private UserTypeRepository userTypeRepository;
	
	
	@Autowired
	private UserCredentialsRepository userCredentialsRepository;
	
	private Logger logger = LoggerFactory.getLogger(MasterController.class);
	
	@GetMapping(path = "/masters/countries")
	public List<Country> getCountries(){
		logger.info("In the function getCountries" );
		List<Country> countryList = countryRepository.findAll();
		return countryList;
	}
	
	@GetMapping(path = "/masters/cities")
	public List<City> getCities() {
		logger.info("In the function getCities" );
		List<City> cityList = cityRepository.findAll();
		return cityList;
	}
	
	
	@GetMapping(path = "/masters/cities/{countryCode}")
	public List<com.bookmybim.user.entity.City> getCitiesbyCountry( @PathVariable String countryCode ) {
		logger.info("In the function getCitiesbyCountry" );
		List<City> cityList = cityRepository.findByCountryCode(countryCode);
		return cityList;
	}
	
	@GetMapping(path = "/masters/degrees")
	public List<Degree> getDegrees(  ) {
		logger.info("In the function getDegrees" );
		List<Degree> degreeList = degreeRepository.findAll();
		return degreeList;
	}
	
	
	@GetMapping(path = "/masters/courses")
	public List<Course> getCourses(  ) {
		logger.info("In the function getCourses" );
		List<Course> courseList = courseRepository.findAll();
		return courseList;
	}
	
	@GetMapping(path = "/masters/institutes")
	public List<Institute> getInstitutes(  ) {
		logger.info("In the function getInstitutes" );
		List<Institute> instituteList = instituteRepository.findAll();
		return instituteList;
	}
	
	@GetMapping(path = "/masters/UserType")
	public List<UserType> getUserType(  ) {
		logger.info("In the function getUserType" );
		List<UserType> userTypeList = userTypeRepository.findAll();
		return userTypeList;
	}
	
	@GetMapping(path = "/user/username/{username}")
	public UserCredentials getUserCredentials(@PathVariable String username  ) {
		logger.info("In the function getUserCredentials" );
		List<UserCredentials> userCredentialList = userCredentialsRepository.findByUserName(username);
		return userCredentialList.get(0);
	}
}
