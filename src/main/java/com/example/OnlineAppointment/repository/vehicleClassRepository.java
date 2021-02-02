package com.example.OnlineAppointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlineAppointment.entity.VehicleClass;

@Repository
public interface vehicleClassRepository extends JpaRepository<VehicleClass, String> {

}
