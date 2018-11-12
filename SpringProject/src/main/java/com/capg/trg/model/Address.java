package com.capg.trg.model;

public class Address 
 {
	private String houseNumber;
	private String street;
	private String city;
	private Long zipCode;
	
	public Address(String houseNumber, String street, String city, Long zipCode) {
		super();
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}
	
	public Address() {
		super();
	}
	
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getZipCode() {
		return zipCode;
	}
	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", street=" + street
				+ ", city=" + city + ", zipCode=" + zipCode + "]";
	}

}
