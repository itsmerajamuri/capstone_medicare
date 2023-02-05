package com.capstone.medicare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="productData")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="productid")
	int productId;
	
	String medicineName;
	
	String medicineDetails;
	
	String uses;
	
	String safetyInformation;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getMedicineDetails() {
		return medicineDetails;
	}

	public void setMedicineDetails(String medicineDetails) {
		this.medicineDetails = medicineDetails;
	}

	public String getUses() {
		return uses;
	}

	public void setUses(String uses) {
		this.uses = uses;
	}

	public String getSafetyInformation() {
		return safetyInformation;
	}

	public void setSafetyInformation(String safetyInformation) {
		this.safetyInformation = safetyInformation;
	}

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", medicineName=" + medicineName + ", medicineDetails="
				+ medicineDetails + ", uses=" + uses + ", safetyInformation=" + safetyInformation + "]";
	}
	
	

}
