package com.divcloud.carshome.dao;

import com.divcloud.carshome.entity.BrandModelEntity;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BrandModelManageDaoImpl implements BrandModelManageDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void addModel(BrandModelEntity randModelEntity) {
		this.sessionFactory.getCurrentSession().save(randModelEntity);
	}

	public List<BrandModelEntity> getAllBrandModelList() {
		return this.sessionFactory.getCurrentSession()
				.createQuery("from BrandModelEntity").setCacheable(true).list();
	}

	public List<BrandModelEntity> getAllBrandModelList(int brandId) {
		Query query = this.sessionFactory
				.getCurrentSession()
				.createQuery(
						"from BrandModelEntity as model where model.brandEntity.id=:brandId ");
		query.setCacheable(true);
		query.setInteger("brandId", brandId);
		return query.list();
	}
}
