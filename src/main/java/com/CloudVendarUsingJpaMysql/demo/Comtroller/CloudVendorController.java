package com.CloudVendarUsingJpaMysql.demo.Comtroller;

import org.springframework.web.bind.annotation.RestController;

import com.CloudVendarUsingJpaMysql.demo.Model.VendorModel;
import com.CloudVendarUsingJpaMysql.demo.service.CloudVendorService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/cloudVendar")
public class CloudVendorController {

	//VendorModel cloudVendar;
	/*@GetMapping("/test")
	public String getMethodName() {
		return "Debasish Maity";
	} */

	/*@GetMapping
	public VendorModel CloudVendarDetails(String vendarId) {
		return new VendorModel("c1","Name","kolkata","XXXXX");
	} */
	
	CloudVendorService cloudVendorServicec;
	
	/**
	 * @param cloudVendorServicec
	 */
	public CloudVendorController(CloudVendorService cloudVendorServicec) {
		super();
		this.cloudVendorServicec = cloudVendorServicec;
	}
	
	// Read Specific Cloud Vendor Details from DB
	@GetMapping("{vendarId}")
	public VendorModel getCloudVendarDetails(@PathVariable("vendarId") String vendarId) {
		
		return cloudVendorServicec.getCloudVendor(vendarId);
	
	}
	
	// Read All Cloud Vendor Details from DB
	@GetMapping()
	public List<VendorModel> getAllCloudVendarDetails() {
		
		return cloudVendorServicec.getAllCloudVendors();
	
	}
	
	
	@PostMapping
	public String createVendarDetails(@RequestBody VendorModel cloudVendar) {
		
		cloudVendorServicec.createCloudVendor(cloudVendar);
		return "Vendar create successfully";
	}
	
	@PutMapping
	public String updateVendarDetails(@RequestBody VendorModel cloudVendar) {
		
		cloudVendorServicec.updateCloudVendor(cloudVendar);
		return "Vendar update successfully";
	}
	
	@DeleteMapping("{vendarId}")
	public String deleteVendarDetails(@PathVariable("vendarId") String vendarId) {
		
		cloudVendorServicec.deleteCloudVendor(vendarId);
		return "Vendar delete successfully";
	}
}
