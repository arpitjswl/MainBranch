package com.synechron.insurance.Buy.Insurance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.springframework.core.annotation.Order;

@Entity
public class Plans {
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "plan_id")
	private Long id;
	
	@Size(max = 50, message = "Plan name can not be greater than {max} characters")
	@Column(name = "plan_name")
	private String planName;
	
	@Column(name = "plan_premium")
	private Integer premium;
	
	@Column(name = "plan_coverage")
	private Long coverage;
	
	@Column(name = "co_payment")
	private Short coPayment;
	
	@Column(name = "plan_type")
	private String planType;
	
	@Size(max = 40, message = "Maximum Value is {max}")
	@Column(name = "insurance_provider")
	private String insuranceProvider;
	
	protected Plans() {}
	
	public Plans(String planName, Integer premium, Long coverage, Short coPayment, String planType,
			String insuranceProvider) {
		super();
		this.planName = planName;
		this.premium = premium;
		this.coverage = coverage;
		this.coPayment = coPayment;
		this.planType = planType;
		this.insuranceProvider = insuranceProvider;
	}
	public Long getId() {
		return id;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public Integer getPremium() {
		return premium;
	}
	public void setPremium(Integer premium) {
		this.premium = premium;
	}
	public Long getCoverage() {
		return coverage;
	}
	public void setCoverage(Long coverage) {
		this.coverage = coverage;
	}
	public Short getCoPayment() {
		return coPayment;
	}
	public void setCoPayment(Short coPayment) {
		this.coPayment = coPayment;
	}
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public String getInsuranceProvider() {
		return insuranceProvider;
	}
	public void setInsuranceProvider(String insuranceProvider) {
		this.insuranceProvider = insuranceProvider;
	}
	@Override
	public String toString() {
		return "Plans [id=" + id + ", planName=" + planName + ", premium=" + premium + ", coverage=" + coverage
				+ ", coPayment=" + coPayment + ", planType=" + planType + ", insuranceProvider=" + insuranceProvider
				+ "]";
	}	
}
