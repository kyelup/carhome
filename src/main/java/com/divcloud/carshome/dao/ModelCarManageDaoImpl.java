package com.divcloud.carshome.dao;

import com.divcloud.carshome.entity.ModelCarEntity;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ModelCarManageDaoImpl implements ModelCarManageDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void addModelCar(ModelCarEntity modelCarEntity) {
		this.sessionFactory.getCurrentSession().save(modelCarEntity);
	}

	public List<ModelCarEntity> listModelCarList() {
		return this.sessionFactory.getCurrentSession()
				.createQuery("from ModelCarEntity").setCacheable(true).list();
	}

	public List<ModelCarEntity> listModelCarByModelId(int modelId) {
		Query query = this.sessionFactory
				.getCurrentSession()
				.createQuery(
						"from ModelCarEntity as car where car.brandModelEntity.id=:modelId ");
		query.setCacheable(true);
		query.setInteger("modelId", modelId);
		return query.list();
	}
}
