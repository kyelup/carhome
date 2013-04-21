package com.divcloud.carshome.dao;

import com.divcloud.carshome.entity.BrandEntity;
import java.util.List;

public abstract interface BrandManageDao {
	public abstract void addBrand(BrandEntity paramBrandEntity);

	public abstract List<BrandEntity> getAllBrandList();

	public abstract List<BrandEntity> getBrandListByCountryId(int paramInt);
}
