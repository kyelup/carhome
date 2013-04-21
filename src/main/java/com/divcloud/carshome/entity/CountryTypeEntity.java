package com.divcloud.carshome.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "carshome_key_country")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class CountryTypeEntity {

	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Integer id;

	@Column(name = "COUNTRY_NAME")
	private String countryName;

	@Column(name = "CREATE_TIME")
	private Date createTime;

	@Column(name = "UPDATE_TIME")
	private Date updateTime;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "countryEntity")
	@OrderBy("id")
	private List<BrandEntity> brandList;

	public List<BrandEntity> getBrandList() {
		return this.brandList;
	}

	public void setBrandList(List<BrandEntity> brandList) {
		this.brandList = brandList;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
