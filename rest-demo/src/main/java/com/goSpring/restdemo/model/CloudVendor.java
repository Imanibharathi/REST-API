package com.goSpring.restdemo.model;

public class CloudVendor {
	
	private String vendorId;
	private String vendorName;
	private String vendorAddress;
	private String vendorPhone;
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorAddress() {
		return vendorAddress;
	}
	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}
	public String getVendorPhone() {
		return vendorPhone;
	}
	public void setVendorPhone(String vendorPhone) {
		this.vendorPhone = vendorPhone;
	}
	public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhone) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorPhone = vendorPhone;
	}
	@Override
	public String toString() {
		return "CloudVendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorAddress=" + vendorAddress
				+ ", vendorPhone=" + vendorPhone + "]";
	}
	public CloudVendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
