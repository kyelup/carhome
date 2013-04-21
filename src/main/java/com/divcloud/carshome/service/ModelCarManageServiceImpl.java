package com.divcloud.carshome.service;

import com.divcloud.carshome.dao.ModelCarManageDao;
import com.divcloud.carshome.entity.ModelCarEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ModelCarManageServiceImpl implements ModelCarManageService {

	@Autowired
	private ModelCarManageDao modelCarManageDao;

	@Transactional
	public void addModelCar(ModelCarEntity modelCarEntity) {
		this.modelCarManageDao.addModelCar(modelCarEntity);
	}

	@Transactional
	public List<ModelCarEntity> listModelCarList() {
		return this.modelCarManageDao.listModelCarList();
	}

	@Transactional
	public List<ModelCarEntity> listModelCarByModelId(int modelId) {
		return this.modelCarManageDao.listModelCarByModelId(modelId);
	}
}
