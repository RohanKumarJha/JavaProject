package com.infy.dao;

import java.util.List;

import com.infy.model.ServiceRequest;

public interface MobileServiceDAO {
	ServiceRequest registerRequest(ServiceRequest service);
	List<ServiceRequest> getServices();
}
