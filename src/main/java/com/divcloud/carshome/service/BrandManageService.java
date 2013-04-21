package com.divcloud.carshome.service;

import com.divcloud.carshome.entity.BrandEntity;
import java.util.List;

public abstract interface BrandManageService {
	public abstract void addBrand(BrandEntity paramBrandEntity);

	public abstract List<BrandEntity> getAllBrandList();

	public abstract List<BrandEntity> getBrandListByCountryId(int paramInt);
}
