package com.divcloud.carshome.dao;

import com.divcloud.carshome.entity.CountryTypeEntity;
import java.util.List;

public abstract interface CountryTypeDao {
	public abstract List<CountryTypeEntity> listCountryType();
}
