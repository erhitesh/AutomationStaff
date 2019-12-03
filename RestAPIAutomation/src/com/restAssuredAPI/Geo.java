package com.restAssuredAPI;

public class Geo {

	public String lat;
	public String lng;
	
	public Geo(){}
	
	/**
	 * @param lat
	 * @param lng
	 */
	public Geo(String lat, String lng) {
		this.lat = lat;
		this.lng = lng;
	}


	public String getLat() {
		return lat;
	}


	public String getLng() {
		return lng;
	}


	public void setLat(String lat) {
		this.lat = lat;
	}


	public void setLng(String lng) {
		this.lng = lng;
	}

}
