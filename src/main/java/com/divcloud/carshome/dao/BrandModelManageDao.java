package com.divcloud.carshome.dao;

import com.divcloud.carshome.entity.BrandModelEntity;
import java.util.List;

public abstract interface BrandModelManageDao {
	public abstract void addModel(BrandModelEntity paramBrandModelEntity);

	public abstract List<BrandModelEntity> getAllBrandModelList();

	public abstract List<BrandModelEntity> getAllBrandModelList(int paramInt);
}
