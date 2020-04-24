package com.synechron.insurance.Buy.Insurance.service;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.synechron.insurance.Buy.Insurance.entity.Plans;
import com.synechron.insurance.Buy.Insurance.exception.InvalidIdPassed;
import com.synechron.insurance.Buy.Insurance.exception.NoDataFound;
import com.synechron.insurance.Buy.Insurance.repository.PlanRepository;

@Service
@Transactional
public class PlanServiceImpl implements PlanService {

	@Autowired
	private PlanRepository planRepo;
	
	
	@Override
	public List<Plans> getAllPlans() {
		List<Plans> plans = planRepo.findAll();
		if (plans.size() > 0)
			return plans;
		else 
			throw new NoDataFound("There are no Plans to display");
	}

	@Override
	public Optional<Plans> retreivePlan(Long id) {
		Optional<Plans> plan = planRepo.findById(id);
		if ( !plan.isPresent() ) 
			throw new InvalidIdPassed("Plan is not found with id ::: "+id);
		return plan;
	}

	@Override
	public ResponseEntity<Object> createNewPlan(Plans plans) {
		Plans plan = planRepo.save(plans);
		URI location =  ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(plan.getId()).toUri();
		return ResponseEntity.created(location).build();
	}

	@Override
	public void updatePlans(Plans plans, Long id) {
		Optional<Plans> getPlan = planRepo.findById(id);
		if (getPlan.isPresent()) {
			Plans plan = getPlan.get();
			plan.setPremium(plans.getPremium());
			plan.setCoPayment(plans.getCoPayment());
			plan.setPlanName(plans.getPlanName());
			plan.setInsuranceProvider(plans.getInsuranceProvider());
			plan.setCoverage(plans.getCoverage());
			plan.setPlanType(plan.getPlanType());
			planRepo.save(plan);
		}	
	}

	@Override
	public void deleteById(Long id) {
		Optional<Plans> getExists = planRepo.findById(id);
		if (!getExists.isPresent()) 
			throw new InvalidIdPassed("Passed Id is not Present");
		planRepo.deleteById(id);
	}

	@Override
	public List<Plans> getCustomPlans(){
		return planRepo.getCustomPlans();
	}
	
}

