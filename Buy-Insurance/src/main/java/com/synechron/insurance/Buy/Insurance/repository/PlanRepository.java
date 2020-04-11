package com.synechron.insurance.Buy.Insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.synechron.insurance.Buy.Insurance.entity.Plans;

/*import com.synechron.insurance.Buy.Insurance.entity.Plans;*/

@Repository
public interface PlanRepository extends JpaRepository<Plans, Long>{

}
