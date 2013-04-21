package com.divcloud.carshome.dao;

import com.divcloud.carshome.entity.ModelCarEntity;
import java.util.List;

public abstract interface ModelCarManageDao {
	public abstract void addModelCar(ModelCarEntity paramModelCarEntity);

	public abstract List<ModelCarEntity> listModelCarList();

	public abstract List<ModelCarEntity> listModelCarByModelId(int paramInt);
}
