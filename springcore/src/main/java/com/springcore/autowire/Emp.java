package com.springcore.autowire;

public class Emp {
	private Address address;

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("constructor setting");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	

}
