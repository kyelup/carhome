package com.divcloud.carshome.service;

import com.divcloud.carshome.entity.BrandModelEntity;
import java.util.List;

public abstract interface BrandModelManageService {
	public abstract void addModel(BrandModelEntity paramBrandModelEntity);

	public abstract List<BrandModelEntity> getAllBrandModelList();

	public abstract List<BrandModelEntity> getModelListByBrandId(int paramInt);
}
