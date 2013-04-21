/*    */package com.divcloud.carshome.entity;

/*    */
/*    */import java.util.Date;
/*    */
import java.util.List;
/*    */
import javax.persistence.Column;
/*    */
import javax.persistence.Entity;
/*    */
import javax.persistence.FetchType;
/*    */
import javax.persistence.GeneratedValue;
/*    */
import javax.persistence.Id;
/*    */
import javax.persistence.JoinColumn;
/*    */
import javax.persistence.ManyToOne;
/*    */
import javax.persistence.OneToMany;
/*    */
import javax.persistence.OrderBy;
/*    */
import javax.persistence.Table;
/*    */
import org.hibernate.annotations.Cache;
/*    */
import org.hibernate.annotations.CacheConcurrencyStrategy;

/*    */
/*    */@Entity
/*    */@Table(name = "carshome_brand_model")
/*    */@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
/*    */public class BrandModelEntity
/*    */{
	/*    */
	/*    */@Id
	/*    */@Column(name = "ID")
	/*    */@GeneratedValue
	/*    */private int id;
	/*    */
	/*    */@Column(name = "BRAND_MODEL_NAME")
	/*    */private String modelName;
	/*    */
	/*    */@Column(name = "CREATE_TIME")
	/*    */private Date createTime;
	/*    */
	/*    */@Column(name = "UPDATE_TIME")
	/*    */private Date updateTime;
	/*    */
	/*    */@ManyToOne(fetch = FetchType.EAGER)
	/*    */@JoinColumn(name = "BRAND_ID")
	/*    */private BrandEntity brandEntity;
	/*    */
	/*    */@OneToMany(fetch = FetchType.LAZY, mappedBy = "brandModelEntity")
	/*    */@OrderBy("id")
	/*    */private List<ModelCarEntity> modelCarEntityList;

	/*    */
	/*    */public List<ModelCarEntity> getModelCarEntityList()
	/*    */{
		/* 48 */return this.modelCarEntityList;
		/*    */}

	/*    */
	/*    */public void setModelCarEntityList(
			List<ModelCarEntity> modelCarEntityList) {
		/* 52 */this.modelCarEntityList = modelCarEntityList;
		/*    */}

	/*    */
	/*    */public int getId() {
		/* 56 */return this.id;
		/*    */}

	/*    */
	/*    */public void setId(int id) {
		/* 60 */this.id = id;
		/*    */}

	/*    */
	/*    */public String getModelName() {
		/* 64 */return this.modelName;
		/*    */}

	/*    */
	/*    */public void setModelName(String modelName) {
		/* 68 */this.modelName = modelName;
		/*    */}

	/*    */
	/*    */public BrandEntity getBrandEntity() {
		/* 72 */return this.brandEntity;
		/*    */}

	/*    */
	/*    */public void setBrandEntity(BrandEntity brandEntity) {
		/* 76 */this.brandEntity = brandEntity;
		/*    */}

	/*    */
	/*    */public Date getCreateTime() {
		/* 80 */return this.createTime;
		/*    */}

	/*    */
	/*    */public void setCreateTime(Date createTime) {
		/* 84 */this.createTime = createTime;
		/*    */}

	/*    */
	/*    */public Date getUpdateTime() {
		/* 88 */return this.updateTime;
		/*    */}

	/*    */
	/*    */public void setUpdateTime(Date updateTime) {
		/* 92 */this.updateTime = updateTime;
		/*    */}
	/*    */
}

/*
 * Location: E:\carshome\WEB-INF\classes\ Qualified Name:
 * com.divcloud.carshome.entity.BrandModelEntity JD-Core Version: 0.6.0
 */