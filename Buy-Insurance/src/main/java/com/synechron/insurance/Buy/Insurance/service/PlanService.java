package com.synechron.insurance.Buy.Insurance.service;

import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import com.synechron.insurance.Buy.Insurance.entity.Plans;

public interface PlanService {
	public List<Plans> getAllPlans();
	public Optional<Plans> retreivePlan(Long id);
	public ResponseEntity<Object> createNewPlan(Plans plans);
	public void updatePlans(Plans plans, Long id); 
	public void deleteById(Long id);
}
