package com.infy.service;

import java.util.List;

import com.infy.model.ServiceRequest;
import com.infy.model.Status;

public interface MobileService {
	public ServiceRequest registerRequest(ServiceRequest service);
	public Float calculateEstimateCost(List<String> issues);
	public List<ServiceRequest> getServices(Status status);
}
