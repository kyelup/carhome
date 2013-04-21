package com.divcloud.carshome.dao;

import com.divcloud.carshome.entity.CountryTypeEntity;

import java.util.List;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

@Repository
public class CountryTypeDaoImpl implements CountryTypeDao {
	@Autowired
	private SessionFactory sessionFactory;

	public List<CountryTypeEntity> listCountryType() {
		return this.sessionFactory.getCurrentSession()
				.createQuery("from CountryTypeEntity").setCacheable(true)
				.list();
	}

}
