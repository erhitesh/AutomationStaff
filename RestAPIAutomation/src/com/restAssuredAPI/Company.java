package com.restAssuredAPI;

public class Company {

	public String name;
	public String catchPhrase;
	public String bs;

	public Company() {}
	
	/**
	 * @param name
	 * @param catchPhrase
	 * @param bs
	 */
	public Company(String name, String catchPhrase, String bs) {
		super();
		this.name = name;
		this.catchPhrase = catchPhrase;
		this.bs = bs;
	}

	public String getName() {
		return name;
	}

	public String getCatchPhrase() {
		return catchPhrase;
	}

	public String getBs() {
		return bs;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}

	public void setBs(String bs) {
		this.bs = bs;
	}
}
