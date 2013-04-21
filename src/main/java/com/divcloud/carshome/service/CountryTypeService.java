package com.divcloud.carshome.service;

import com.divcloud.carshome.entity.CountryTypeEntity;
import java.util.List;

public abstract interface CountryTypeService {
	public abstract List<CountryTypeEntity> listCountryType();
}
