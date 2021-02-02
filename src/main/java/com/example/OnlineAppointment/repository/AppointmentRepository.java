package com.example.OnlineAppointment.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.OnlineAppointment.entity.Appointment;


@Repository
public interface AppointmentRepository extends JpaRepository<Appointment , String> {

//	@Query(value = "SELECT appointment_time FROM appointment where appointment_date =:selectedDate AND Category_id =:catID",nativeQuery = true)
//	public String[] viewReservedTimes(@Param("selectedDate") String selectedDate,@Param("catID") String catID);
	
	@Query(value = "SELECT a.appointmentTime FROM Appointment a where a.appointmentDate =:selectedDate AND a.categoryId.categoryId =:catID")
	public String[] viewReservedTimes2(@Param("selectedDate") Date selectedDate,@Param("catID") String catID);

}
