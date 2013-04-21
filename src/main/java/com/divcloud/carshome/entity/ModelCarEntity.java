package com.divcloud.carshome.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "carshome_brand_model_car")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ModelCarEntity {

	@Id
	@Column(name = "ID")
	@GeneratedValue
	private int id;

	@Column(name = "MODEL_CAR_NAME")
	private String carName;

	@Column(name = "MIN_PRICE")
	private double minPrice;

	@Column(name = "MAX_PRICE")
	private double maxPrice;

	@Column(name = "CAR_ICON_PATH")
	private String carIconPath;

	@Column(name = "CREATE_TIME")
	private Date createTime;

	@Column(name = "UPDATE_TIME")
	private Date updateTime;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "BRAND_MODEL_ID")
	private BrandModelEntity brandModelEntity;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarName() {
		return this.carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public double getMinPrice() {
		return this.minPrice;
	}

	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}

	public double getMaxPrice() {
		return this.maxPrice;
	}

	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getCarIconPath() {
		return this.carIconPath;
	}

	public void setCarIconPath(String carIconPath) {
		this.carIconPath = carIconPath;
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

	public BrandModelEntity getBrandModelEntity() {
		return this.brandModelEntity;
	}

	public void setBrandModelEntity(BrandModelEntity brandModelEntity) {
		this.brandModelEntity = brandModelEntity;
	}
}
