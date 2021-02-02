package com.example.OnlineAppointment.entity;

import java.util.Date;

public class AppointmentOnlineForm {

	private String appointmentID;
	private Date appointmentDate;
	private String appointmentTime;
	private String lane;
	private TestCategory categoryId;
	
	private String vehicleID;
	private VehicleClass vehicleClass;
	private String makeModel;
	
	private String customerID;
	private String mobileNo;
	private String cusName;
	private String email;
	public String getAppointmentID() {
		return appointmentID;
	}
	public void setAppointmentID(String appointmentID) {
		this.appointmentID = appointmentID;
	}
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	public String getLane() {
		return lane;
	}
	public void setLane(String lane) {
		this.lane = lane;
	}
	public TestCategory getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(TestCategory categoryId) {
		this.categoryId = categoryId;
	}
	public String getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}
	public VehicleClass getVehicleClass() {
		return vehicleClass;
	}
	public void setVehicleClass(VehicleClass vehicleClass) {
		this.vehicleClass = vehicleClass;
	}
	public String getMakeModel() {
		return makeModel;
	}
	public void setMakeModel(String makeModel) {
		this.makeModel = makeModel;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
