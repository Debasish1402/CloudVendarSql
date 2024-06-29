package com.CloudVendarUsingJpaMysql.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloud_vendar_info")
public class VendorModel {
	@Id
	private String vendarId;
	private String vendarName;
	private String vendarAddress;
	private String vendarPhoneNumber;
	
	
	public VendorModel() {
		
	}
	/**
	 * @param vendarId
	 * @param vendarName
	 * @param vendarAddress
	 * @param vendarPhoneNumber
	 */
	public VendorModel(String vendarId, String vendarName, String vendarAddress, String vendarPhoneNumber) {
		super();
		this.vendarId = vendarId;
		this.vendarName = vendarName;
		this.vendarAddress = vendarAddress;
		this.vendarPhoneNumber = vendarPhoneNumber;
	}
	
	public String getVendarId() {
		return vendarId;
	}
	public void setVendarId(String vendarId) {
		this.vendarId = vendarId;
	}
	public String getVendarName() {
		return vendarName;
	}
	public void setVendarName(String vendarName) {
		this.vendarName = vendarName;
	}
	public String getVendarAddress() {
		return vendarAddress;
	}
	public void setVendarAddress(String vendarAddress) {
		this.vendarAddress = vendarAddress;
	}
	public String getVendarPhoneNumber() {
		return vendarPhoneNumber;
	}
	public void setVendarPhoneNumber(String vendarPhoneNumber) {
		this.vendarPhoneNumber = vendarPhoneNumber;
	}
	
	
}
