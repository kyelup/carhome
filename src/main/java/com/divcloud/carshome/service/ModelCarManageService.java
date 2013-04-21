package com.divcloud.carshome.service;

import com.divcloud.carshome.entity.ModelCarEntity;
import java.util.List;

public abstract interface ModelCarManageService {
	public abstract void addModelCar(ModelCarEntity paramModelCarEntity);

	public abstract List<ModelCarEntity> listModelCarList();

	public abstract List<ModelCarEntity> listModelCarByModelId(int paramInt);
}
