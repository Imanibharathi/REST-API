package com.goSpring.restdemo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goSpring.restdemo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
	
	CloudVendor cloudVendor;

	
	@GetMapping("{vendorId}")
	public CloudVendor getVendorDetails(@PathVariable("vendorId") String vendorId) {
		return cloudVendor;
	}
	
	@PostMapping
	public String postVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor=cloudVendor;
		return "Data posted successfully";
	}
	
	@PutMapping
	public String putVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor=cloudVendor;
		return "Data updated successfully";
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteVendorDetails(@PathVariable("vendorId") String vendorId) {
		this.cloudVendor=null;
		return "Data deleted successfully";
	}

}
