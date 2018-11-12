package com.capg.trg.model;

public class Person 
 {
	private Long adharCardNumber;
	private String name;
	private Address residentialAddress;
	private Address permanentAddress;
	public Long getAdharCardNumber() {
		return adharCardNumber;
	}
	public void setAdharCardNumber(Long adharCardNumber) {
		this.adharCardNumber = adharCardNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(Long adharCardNumber, String name,
			Address residentialAddress, Address permanentAddress) {
		super();
		this.adharCardNumber = adharCardNumber;
		this.name = name;
		this.residentialAddress = residentialAddress;
		this.permanentAddress = permanentAddress;
	}
	@Override
	public String toString() {
		return "Person [adharCardNumber=" + adharCardNumber + ", name=" + name
				+ ", residentialAddress=" + residentialAddress
				+ ", permanentAddress=" + permanentAddress + "]";
	}

	public void initialize() {
		System.out.println("Initialize before bean instance");
	}
	
	public void cleanUp() {
		System.out.println("Clean up before bean destruction");
	}
}
