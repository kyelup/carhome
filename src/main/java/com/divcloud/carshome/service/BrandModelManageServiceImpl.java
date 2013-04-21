package com.divcloud.carshome.service;

import com.divcloud.carshome.dao.BrandModelManageDao;
import com.divcloud.carshome.entity.BrandModelEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BrandModelManageServiceImpl implements BrandModelManageService {

	@Autowired
	private BrandModelManageDao brandModelDao;

	@Transactional
	public void addModel(BrandModelEntity brandModelEntity) {
		this.brandModelDao.addModel(brandModelEntity);
	}

	@Transactional
	public List<BrandModelEntity> getAllBrandModelList() {
		return this.brandModelDao.getAllBrandModelList();
	}

	@Transactional
	public List<BrandModelEntity> getModelListByBrandId(int brandId) {
		return this.brandModelDao.getAllBrandModelList(brandId);
	}
}
