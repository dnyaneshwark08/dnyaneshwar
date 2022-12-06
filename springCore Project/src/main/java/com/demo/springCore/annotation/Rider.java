package com.demo.springCore.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class Rider {
	
	@Value("Dnyaneshwar")
	private String Ridername;
	@Value("hk3452782562jhd")
	private String LicenseNo;
	@Value("27")
	private String RiderAge;
	public String getRidername() {
		return Ridername;
	}
	public void setRidername(String ridername) {
		Ridername = ridername;
	}
	public String getLicenseNo() {
		return LicenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		LicenseNo = licenseNo;
	}
	public String getRiderAge() {
		return RiderAge;
	}
	public void setRiderAge(String riderAge) {
		RiderAge = riderAge;
	}
	public Rider(String ridername, String licenseNo, String riderAge) {
		super();
		Ridername = ridername;
		LicenseNo = licenseNo;
		RiderAge = riderAge;
	}
	public Rider() {
		super();
	}
	@Override
	public String toString() {
		return "Rider [Ridername=" + Ridername + ", LicenseNo=" + LicenseNo + ", RiderAge=" + RiderAge + "]";
	}
	
	
	
	
}

