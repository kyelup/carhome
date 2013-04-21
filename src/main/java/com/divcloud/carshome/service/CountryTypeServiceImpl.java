package com.divcloud.carshome.service;

import com.divcloud.carshome.dao.CountryTypeDao;
import com.divcloud.carshome.entity.CountryTypeEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CountryTypeServiceImpl implements CountryTypeService {

	@Autowired
	private CountryTypeDao countryDAO;

	@Transactional
	public List<CountryTypeEntity> listCountryType() {
		return this.countryDAO.listCountryType();
	}
}
