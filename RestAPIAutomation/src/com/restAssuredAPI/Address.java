package com.restAssuredAPI;

public class Address {
	public String street;
	public String suite;
	public String city;
	public String zipcode;
	public Geo geoOb;

	public Address(){}
	
	public Address(String street, String suite, String city, String zipcode, Geo geoOb) {
		this.street = street;
		this.suite = suite;
		this.city = city;
		this.zipcode = zipcode;
		this.geoOb = geoOb;
	}

	public String getStreet() {
		return street;
	}

	public String getSuite() {
		return suite;
	}

	public String getCity() {
		return city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public Geo getGeoOb() {
		return geoOb;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public void setGeoOb(Geo geoOb) {
		this.geoOb = geoOb;
	}
}