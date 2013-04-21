package com.divcloud.carshome.service;

import com.divcloud.carshome.dao.BrandManageDao;
import com.divcloud.carshome.entity.BrandEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BrandManageServiceImpl implements BrandManageService {



	@Autowired(required = true)
	private BrandManageDao brandDao;

	@Transactional
	public void addBrand(BrandEntity brandEntity) {
		this.brandDao.addBrand(brandEntity);
	}

	@Transactional
	public List<BrandEntity> getAllBrandList() {
		return this.brandDao.getAllBrandList();
	}

	@Transactional
	public List<BrandEntity> getBrandListByCountryId(int countryId) {
		return this.brandDao.getBrandListByCountryId(countryId);
	}
}
