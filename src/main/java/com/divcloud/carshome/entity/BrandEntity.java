package com.divcloud.carshome.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "carshome_brand")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class BrandEntity {

	@Id
	@Column(name = "ID")
	@GeneratedValue
	private int id;

	@Column(name = "BRAND_DESCRIPTION")
	private String brandDescription;

	@Column(name = "BRAND_ICON_PATH")
	private String brandIconPath;

	@Column(name = "BRAND_SORT_CHAR")
	private String brandSortChar;

	@Column(name = "CREATE_TIME")
	private Date createTime;

	@Column(name = "UPDATE_TIME")
	private Date updateTime;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "COUNTRY_ID")
	private CountryTypeEntity countryEntity;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "brandEntity")
	@OrderBy("id")
	private List<BrandModelEntity> brandModelList;

	public List<BrandModelEntity> getBrandModelList() {
		return this.brandModelList;
	}

	public void setBrandModelList(List<BrandModelEntity> brandModelList) {
		this.brandModelList = brandModelList;
	}

	public CountryTypeEntity getCountryEntity() {
		return this.countryEntity;
	}

	public void setCountryEntity(CountryTypeEntity countryEntity) {
		this.countryEntity = countryEntity;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrandDescription() {
		return this.brandDescription;
	}

	public void setBrandDescription(String brandDescription) {
		this.brandDescription = brandDescription;
	}

	public String getBrandIconPath() {
		return this.brandIconPath;
	}

	public void setBrandIconPath(String brandIconPath) {
		this.brandIconPath = brandIconPath;
	}

	public String getBrandSortChar() {
		return this.brandSortChar;
	}

	public void setBrandSortChar(String brandSortChar) {
		this.brandSortChar = brandSortChar;
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
