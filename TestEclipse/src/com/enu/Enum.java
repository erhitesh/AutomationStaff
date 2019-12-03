package com.enu;

public enum Enum {
	ClassName,
	Id,
	Name;
//	ARIN("whois.arin.net"),
//    RIPE("whois.ripe.net"),
//    APNIC("whois.apnic.net"),
//    AFRINIC("whois.afrinic.net"),
//    LACNIC("whois.lacnic.net"),
//    JPNIC("whois.nic.ad.jp"),
//    KRNIC("whois.nic.or.kr"),
//    CNNIC("ipwhois.cnnic.cn"),
//    UNKNOWN("");
//	
//	private String url;
//	
//	private Enum(String url) {
//		this.url = url;
//	}
//	
//	public String url() {
//		return url;
//	}
	
	public String getData() {
		switch (this) {
		case ClassName:
			return "Class";
		case Name:
			return "Name";
		default:
			throw new AssertionError("Element Not Found...");
		}
	}
}
