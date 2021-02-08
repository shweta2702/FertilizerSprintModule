package com.cg.main.fertilizer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "fertilizer")
public class Fertilizer {
	/**
	 * Declare variables
	 */
	@Id
	@GeneratedValue
	@Column(name = "Product_Id")
	int productId;
	
	
	@NotEmpty(message = "Product name cant be empty")
	@Size(min = 4, message = "min 3 chars required")
	String productName;
	
	
	@NotNull(message = "Cost should not be null")
	Double cost;
	
	
	@NotNull(message = "Stock should not be null")
	int stock;
	

	@NotEmpty(message = "Description cant be empty")
	String description;
	
	@NotEmpty(message = "Product Type name cant be empty")
	String productType;
	
	@NotEmpty(message = "bloom time name cant be empty")
	String bloomTime;

	public Fertilizer() {
		/**
		 * Auto generated stub-constructor
		 */
	}

	/**
	 * Constructor using Fields
	 * 
	 * @param productName
	 * @param cost
	 * @param productId
	 * @param stock
	 * @param description
	 * @param productType
	 * @param bloomTime
	 */

	public Fertilizer(String productName, Double cost, int productId, int stock, String description, String productType,
			String bloomTime) {
		super();
		this.productName = productName;
		this.cost = cost;
		this.productId = productId;
		this.stock = stock;
		this.description = description;
		this.productType = productType;
		this.bloomTime = bloomTime;
	}

	/**
	 * Constructor using field
	 * 
	 * @param productName
	 * @param cost
	 * @param stock
	 * @param description
	 * @param productType
	 * @param bloomTime
	 */
	public Fertilizer(String productName, Double cost, int stock, String description, String productType,
			String bloomTime) {
		super();
		this.productName = productName;
		this.cost = cost;
		this.stock = stock;
		this.description = description;
		this.productType = productType;
		this.bloomTime = bloomTime;
	}

	/*
	 * @return getProductName
	 */
	public String getProductName() {
		return productName;
	}
	/*
	 * @param productName
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
    /*
     * 
     * @return getCost
     */
	public Double getCost() {
		return cost;
	}
    /*
     * 
     * @param cost
     */
	public void setCost(Double cost) {
		this.cost = cost;
	}
    /*
     * 
     * @return getProductId
     */
	public int getProductId() {
		return productId;
	}
    /*
     * @param productId
     */
	public void setProductId(int productId) {
		this.productId = productId;
	}
    /*
     * 
     * @return getStock
     */
	public int getStock() {
		return stock;
	}
    /*
     * 
     * @param stock
     */
	public void setStock(int stock) {
		this.stock = stock;
	}
    /*
     * 
     * @return getDescription
     */
	public String getDescription() {
		return description;
	}
    /*
     * 
     * @param description
     */
	public void setDescription(String description) {
		this.description = description;
	}
    /*
     * 
     * @return getProductType
     */
	public String getProductType() {
		return productType;
	}
    /*
     * 
     * @param productType
     */
	public void setProductType(String productType) {
		this.productType = productType;
	}
    /*
     * 
     * @return getBloomTime
     */
	public String getBloomTime() {
		return bloomTime;
	}
    /*
     * 
     * @param bloomTime
     */
	public void setBloomTime(String bloomTime) {
		this.bloomTime = bloomTime;
	}

	/*
	 * Generate toString function.
	 */

	@Override
	public String toString() {
		return "Fertilizer [productId=" + productId + ", productName=" + productName + ", cost=" + cost + ", stock="
				+ stock + ", description=" + description + ", productType=" + productType + ", bloomTime=" + bloomTime
				+ "]";
	}

}