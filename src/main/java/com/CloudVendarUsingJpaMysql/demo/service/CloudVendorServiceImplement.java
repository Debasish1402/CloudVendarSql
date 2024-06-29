package com.CloudVendarUsingJpaMysql.demo.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.CloudVendarUsingJpaMysql.demo.Model.VendorModel;
import com.CloudVendarUsingJpaMysql.demo.repository.CloudVendorRepository;


@Service
public class CloudVendorServiceImplement implements CloudVendorService {

	
	
	CloudVendorRepository cloudVendorRepository;
	
	/**
	 * @param cloudVendorRepository
	 */
	public CloudVendorServiceImplement(CloudVendorRepository cloudVendorRepository) {
		super();
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(VendorModel cloudVendor) {
		// TODO Auto-generated method stub
		cloudVendorRepository.save(cloudVendor);
		return "Successfully save.";
	}

	@Override
	public String updateCloudVendor(VendorModel cloudVendor) {
		// TODO Auto-generated method stub
		// More 
		cloudVendorRepository.save(cloudVendor);
		return "Successfully Updated.";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		// TODO Auto-generated method stub
		cloudVendorRepository.deleteById(cloudVendorId);
		return "Successfully Deleted.";
	}

	@Override
	public VendorModel getCloudVendor(String cloudVendorId) {
		// TODO Auto-generated method stub
		return cloudVendorRepository.findById(cloudVendorId).get();
	}

	@Override
	public List<VendorModel> getAllCloudVendors() {
		// TODO Auto-generated method stub
		return cloudVendorRepository.findAll();
	}

	
}
