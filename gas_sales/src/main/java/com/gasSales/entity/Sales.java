package com.gasSales.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sales")
public class Sales {

	@Id
	@Column(name="idsales")
	private int idsales;
	
	@Column(name="email")
	private String email;
	
	@Column(name="name")
	private String name;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="cardNumber")
	private String cardNumber;
	
	@Column(name="expirationDateYear")
	private Integer expirationDateYear;
	
	@Column(name="expirationDateMonth")
	private Integer expirationDateMonth;
	
	@Column(name="gasType")
	private Integer gasType;
	
	@Column(name="amount")
	private Double amount;
	
	@Column(name="gasStation")
	private String gasStation;
	
	@Column(name="sellerName")
	private String sellerName;
	
	public Sales() {
		
	}

	public int getIdsales() {
		return idsales;
	}

	public void setIdsales(int idsales) {
		this.idsales = idsales;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Integer getExpirationDateYear() {
		return expirationDateYear;
	}

	public void setExpirationDateYear(Integer expirationDateYear) {
		this.expirationDateYear = expirationDateYear;
	}

	public Integer getExpirationDateMonth() {
		return expirationDateMonth;
	}

	public void setExpirationDateMonth(Integer expirationDateMonth) {
		this.expirationDateMonth = expirationDateMonth;
	}

	public Integer getGasType() {
		return gasType;
	}

	public void setGasType(Integer gasType) {
		this.gasType = gasType;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getGasStation() {
		return gasStation;
	}

	public void setGasStation(String gasStation) {
		this.gasStation = gasStation;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	@Override
	public String toString() {
		return "Sale [idsales=" + idsales + ", email=" + email + ", name=" + name + ", lastName=" + lastName
				+ ", cardNumber=" + cardNumber + ", expirationDateYear=" + expirationDateYear + ", expirationDateMonth="
				+ expirationDateMonth + ", gasType=" + gasType + ", amount=" + amount + ", gasStation=" + gasStation
				+ ", sellerName=" + sellerName + "]";
	}
			
}





