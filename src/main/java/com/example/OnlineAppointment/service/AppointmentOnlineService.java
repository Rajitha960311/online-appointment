package com.example.OnlineAppointment.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.OnlineAppointment.entity.Appointment;
import com.example.OnlineAppointment.entity.TestCategory;
import com.example.OnlineAppointment.entity.VehicleClass;
import com.example.OnlineAppointment.repository.AppointmentRepository;
import com.example.OnlineAppointment.repository.TestCategoryRepository;
import com.example.OnlineAppointment.repository.vehicleClassRepository;

@Service
@Transactional
public class AppointmentOnlineService {

	@Autowired
	private vehicleClassRepository veclassRepo;
	
	@Autowired
	private TestCategoryRepository categoryRepo;
	
	@Autowired
	private AppointmentRepository appointmentRepo;


	public List<VehicleClass> listAllVehicleClass() {
		return (List<VehicleClass>) veclassRepo.findAll();
	}
	
	public List<TestCategory> listAllTestCategory() {
		return (List<TestCategory>) categoryRepo.findAll();
	}
	
	public TestCategory getCategoryById(String categoryId) {
		return categoryRepo.findById(categoryId).get();
	}
	
	public String[] getReservedTimes(Date selectedDate, String catID) {
		
		return appointmentRepo.viewReservedTimes2(selectedDate,catID);
	}
    
	public void save(Appointment appointment) {
		appointmentRepo.save(appointment);
	}

}
