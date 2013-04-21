package com.divcloud.carshome.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divcloud.carshome.dao.CountryTypeDao;


@Service
public class DemoTestServiceImpl implements DemoTestService {
	
	@Autowired
	private CountryTypeDao countryDao;
	
	@Transactional
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("sssssssssssssssssssssssssssssssss"+countryDao.listCountryType().size());
	}

}
