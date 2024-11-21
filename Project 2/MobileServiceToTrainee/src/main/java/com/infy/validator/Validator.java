package com.infy.validator;

import java.util.List;

import com.infy.exception.MobileServiceException;
import com.infy.model.ServiceRequest;

public class Validator {
	public void validate(ServiceRequest service) throws MobileServiceException {
		if(!isValidBrand(service.getBrand())) {
			System.out.println("Sorry! we do not provide service for this brand");
		}
		if(!isValidIssues(service.getIssues())) {
			System.out.println("Please provide the device only if there are issues.");
		}
		if(!isValidMEINumber(service.getiMEINumber())) {
			System.out.print("Sorry! we’re not able to detect the IMEI number for this device ");
		}
		if(!isValidContactNumber(service.getContactNumber())) {
			System.out.print("Please provide a valid contact number");
		}
		if(!isValidCustomerName(service.getCustomerName())) {
			System.out.print("Please provide a valid customer name");
		}
	}
	
	public Boolean isValidBrand(String brand) {
		String regex = "^[A-Z][a-zA-Z]{1,}*$";
		if(brand.matches(regex)) return true;
		return false;
	}
	
	public Boolean isValidIssues(List<String> issues) {
		String regex = "^\\S+$";
		if(issues.toString().matches(regex)) return true;
		return false;
	}
	
	public Boolean isValidMEINumber(Long iMEINumber) {
		String regex = "^[0-9]{16}$";
		if(iMEINumber.toString().matches(regex)) return true;
		return false;
	}
	
	public Boolean isValidContactNumber(Long contactNumber) {
		String regex = "^(?!.*(\\d)\1)(\\d{10})$";
		if(contactNumber.toString().matches(regex)) return true;
		return false;
	}
	
	public Boolean isValidCustomerName(String customerName) {
		String regex = "^[A-Z][a-z]*( [A-Z][a-z]*)*$";
		if(customerName.matches(regex)) return true;
		return false;
	}
}
