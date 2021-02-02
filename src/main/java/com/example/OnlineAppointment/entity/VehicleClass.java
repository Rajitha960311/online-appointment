package com.example.OnlineAppointment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle_class")
public class VehicleClass {
	
	@Id
	@Column(name = "Vehicle_Class_ID")
	private String vehicleClassID;

	@Column(name = "Vehicle_Class")
	private String vehicleClass;
	
	@Column(name="Remarks")
	private String remark;
	
	@Column(name="Status")
	private String status;
	
	@Column(name="VehicleCategoryID")
	private String vehicleCategoryID;

	@Column(name = "vehicle_class_Logo")
	byte[] vehicleclassLogo;

	public VehicleClass() {
		super();
	}

	public VehicleClass(String vehicleClassID, String vehicleClass, String remark, String status,
			String vehicleCategoryID, byte[] vehicleclassLogo) {
		super();
		this.vehicleClassID = vehicleClassID;
		this.vehicleClass = vehicleClass;
		this.remark = remark;
		this.status = status;
		this.vehicleCategoryID = vehicleCategoryID;
		this.vehicleclassLogo = vehicleclassLogo;
	}

	public String getVehicleClassID() {
		return vehicleClassID;
	}

	public void setVehicleClassID(String vehicleClassID) {
		this.vehicleClassID = vehicleClassID;
	}

	public String getVehicleClass() {
		return vehicleClass;
	}

	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVehicleCategoryID() {
		return vehicleCategoryID;
	}

	public void setVehicleCategoryID(String vehicleCategoryID) {
		this.vehicleCategoryID = vehicleCategoryID;
	}

	public byte[] getVehicleclassLogo() {
		return vehicleclassLogo;
	}

	public void setVehicleclassLogo(byte[] vehicleclassLogo) {
		this.vehicleclassLogo = vehicleclassLogo;
	}

}
