package com.divcloud.carshome.dao;

import com.divcloud.carshome.entity.BrandEntity;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BrandManageDaoImpl implements BrandManageDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void addBrand(BrandEntity brandEntity) {
		this.sessionFactory.getCurrentSession().save(brandEntity);
	}

	public List<BrandEntity> getAllBrandList() {
		return this.sessionFactory.getCurrentSession()
				.createQuery("from BrandEntity").setCacheable(true).list();
	}

	public List<BrandEntity> getBrandListByCountryId(int countryId) {
		Query query = this.sessionFactory
				.getCurrentSession()
				.createQuery(
						"from BrandEntity as brand where brand.countryEntity.id=:countryId ");
		query.setCacheable(true);
		query.setInteger("countryId", countryId);
		return query.list();
	}
}
