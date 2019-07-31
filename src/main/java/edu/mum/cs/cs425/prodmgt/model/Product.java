package edu.mum.cs.cs425.prodmgt.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products2")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pid;
	private long productNumber;
	private String name;
	private float unitPrice;	
	private LocalDate dateMfd;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(long pid, long productNumber, String name, float unitPrice, LocalDate dateMfd) {
		super();
		this.pid = pid;
		this.productNumber = productNumber;
		this.name = name;
		this.unitPrice = unitPrice;
		this.dateMfd = dateMfd;
	}


	public Product(long productNumber, String name, float unitPrice, LocalDate dateMfd) {
		super();
		this.pid = pid;
		this.productNumber = productNumber;
		this.name = name;
		this.unitPrice = unitPrice;
		this.dateMfd = dateMfd;
	}


	public long getPid() {
		return pid;
	}


	public void setPid(long pid) {
		this.pid = pid;
	}


	public long getProductNumber() {
		return productNumber;
	}


	public void setProductNumber(long productNumber) {
		this.productNumber = productNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}


	public LocalDate getDateMfd() {
		return dateMfd;
	}


	public void setDateMfd(LocalDate dateMfd) {
		this.dateMfd = dateMfd;
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productNumber=" + productNumber + ", name=" + name + ", unitPrice="
				+ unitPrice + ", dateMfd=" + dateMfd + "]";
	}
	
}
