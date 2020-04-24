package com.synechron.insurance.Buy.Insurance.controller;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.synechron.insurance.Buy.Insurance.entity.Plans;
import com.synechron.insurance.Buy.Insurance.service.PlanService;

@RestController
public class InsuranceController {
	
	@Autowired
	private PlanService planService;
	
	/*This method retrieves all Plans of a Insurance Provider and return Response Message as 204 if the plans in DB are not available*/
	@RequestMapping(value = "/getAllPlans", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Plans> getAllPlans(){
	 return	planService.getAllPlans();
	}
	

	/* This method get a Object by passing a id in request parameter*/
	@RequestMapping(value = "/getAllPlans/{id}", method = RequestMethod.GET)
	public Optional<Plans> retreivePlan(@PathVariable Long id) throws Exception{
		return planService.retreivePlan(id);
	}
	
	/* This method saved a User Object and return Response to client with Status code we have used ResponseEntity class*/
	@RequestMapping(value = "/getAllPlans", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<Object> createPlan(@Valid @RequestBody Plans plans) {
		return 	planService.createNewPlan(plans);
	}
	
	/* Updating a Plan */
	@RequestMapping(value = "/getAllPlans/{id}", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updatePlans(@RequestBody Plans plans, @PathVariable() Long id) {
		planService.updatePlans(plans, id);
	}
	
	/* Deleting a Plan */
	@RequestMapping(value = "/getAllPlans/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteUser(@PathVariable Long id) {
		planService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/getCustomPlans", method = RequestMethod.GET)
	public List<Plans> getCustomPlans(){
		return planService.getCustomPlans();
	}
}
	


