package com.CloudVendarUsingJpaMysql.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CloudVendarUsingJpaMysql.demo.Model.VendorModel;


@Repository
public interface CloudVendorRepository extends JpaRepository<VendorModel,String>{

	
}
