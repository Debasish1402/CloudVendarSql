package com.CloudVendarUsingJpaMysql.demo.service;

import java.util.List;

import com.CloudVendarUsingJpaMysql.demo.Model.VendorModel;

public interface CloudVendorService {

	 String createCloudVendor(VendorModel cloudVendor);
	 String updateCloudVendor(VendorModel cloudVendor);
	 String deleteCloudVendor(String cloudVendorId);
	 VendorModel getCloudVendor(String cloudVendorId);
	 List<VendorModel> getAllCloudVendors();
	
	}
