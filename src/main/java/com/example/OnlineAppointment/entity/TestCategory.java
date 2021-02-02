package com.example.OnlineAppointment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test_category")
public class TestCategory {

	@Id
	@Column(name="Category_Id")
	private String categoryId;

	@Column(name="Category_Type")
	private String categoryType;
	
	@Column(name="Category_Fee")
	private Long categoryFee;

	@Column(name="Category_Remarks")
	private String remarks;
	
	@Column(name="profile_id")
	private int testProfileId;
	
	@Column(name="Visual_Profile_ID")
	private String viProfileId;
	
	@Column(name="testAproTime")
	private String testAproTime;
	
	@Column(name="no_of_lanes")
	private int noOfLanes;
	
	@Column(name="total_lane_capacity")
	private int totalLaneCapacity;

	public TestCategory() {
		super();
	}

	public TestCategory(String categoryId, String categoryType, Long categoryFee, String remarks, int testProfileId,
			String viProfileId, String testAproTime, int noOfLanes, int totalLaneCapacity) {
		super();
		this.categoryId = categoryId;
		this.categoryType = categoryType;
		this.categoryFee = categoryFee;
		this.remarks = remarks;
		this.testProfileId = testProfileId;
		this.viProfileId = viProfileId;
		this.testAproTime = testAproTime;
		this.noOfLanes = noOfLanes;
		this.totalLaneCapacity = totalLaneCapacity;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public Long getCategoryFee() {
		return categoryFee;
	}

	public void setCategoryFee(Long categoryFee) {
		this.categoryFee = categoryFee;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getTestProfileId() {
		return testProfileId;
	}

	public void setTestProfileId(int testProfileId) {
		this.testProfileId = testProfileId;
	}

	public String getViProfileId() {
		return viProfileId;
	}

	public void setViProfileId(String viProfileId) {
		this.viProfileId = viProfileId;
	}

	public String getTestAproTime() {
		return testAproTime;
	}

	public void setTestAproTime(String testAproTime) {
		this.testAproTime = testAproTime;
	}

	public int getNoOfLanes() {
		return noOfLanes;
	}

	public void setNoOfLanes(int noOfLanes) {
		this.noOfLanes = noOfLanes;
	}

	public int getTotalLaneCapacity() {
		return totalLaneCapacity;
	}

	public void setTotalLaneCapacity(int totalLaneCapacity) {
		this.totalLaneCapacity = totalLaneCapacity;
	}	

}
