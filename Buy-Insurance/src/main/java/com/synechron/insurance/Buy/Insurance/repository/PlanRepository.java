package com.synechron.insurance.Buy.Insurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.synechron.insurance.Buy.Insurance.entity.Plans;

@Repository
public interface PlanRepository extends JpaRepository<Plans, Long>{
	
	@Query("from Plans where plan_premium > 5000")
	public List<Plans> getCustomPlans();
}
