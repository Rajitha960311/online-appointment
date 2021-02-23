package com.example.OnlineAppointment.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.OnlineAppointment.entity.Appointment;
import com.example.OnlineAppointment.entity.TestCategory;
import com.example.OnlineAppointment.entity.VehicleClass;
import com.example.OnlineAppointment.service.AppointmentOnlineService;


@Controller
public class AppointmentControllerOnline {
	
	@Autowired
	private AppointmentOnlineService service;

	@GetMapping("/")
	public String viewHomePage(Model m) {		
		m.addAttribute("appointment", new Appointment());
		
		List<VehicleClass> veclss = service.listAllVehicleClass();
		m.addAttribute("veclss",veclss);
		
		List<TestCategory> tc = service.listAllTestCategory();
		m.addAttribute("testCategory",tc);

		return "index";	
	}
	
	@RequestMapping(value="/viewFreeTimeSlots", method=RequestMethod.GET)
	public @ResponseBody String[] viewFreeTimeSlots(@RequestParam String catID,
			@RequestParam String selectedDate,
			@RequestParam String date2) throws ParseException{
		
		SimpleDateFormat df = new SimpleDateFormat("HH:mm");
		SimpleDateFormat df2 = new SimpleDateFormat("dd-MM-yyyy");
		
		Date ot = df.parse("08:00");
		Date ct = df.parse("22:00");
		
		Date choseDate = df2.parse(selectedDate);  
		Date todayDate = df2.parse(df2.format(new Date()));
		Date currentTime = df.parse(df.format(new Date()));
		
		long difference = 0;
		
		difference = ct.getTime() - ot.getTime();
		long diffMinutes = difference / 60000;
		
		long testAproTime = Long.valueOf(service.getCategoryById(catID).getTestAproTime());
		long noOfTimeSlots = diffMinutes/testAproTime;
		
		String a[]=new String[(int) noOfTimeSlots];	
		Calendar calender = Calendar.getInstance();
		
		for (int i = 0; i < noOfTimeSlots; i++) {
			
			if(i ==0) {
				a[i]=df.format(ot);
			}else {
				calender.setTime(ot);
				calender.add(Calendar.MINUTE, (int) testAproTime);
				ot = calender.getTime();
				a[i]=df.format(ot);
			}
			
		}
		
		// no of vehicles for a one time = no of lanes for a test category * lane capacity
		int totalLaneCapacity =  service.getCategoryById(catID).getTotalLaneCapacity();
		
		String[] reservedTimeList =  service.getReservedTimes(choseDate,catID);
		String[] freeTimeList = new String[80];		
		
	
		for (int i = 0; i < a.length; i++) {
	
			Date time_slot = df.parse(a[i]);
			
			if(choseDate.compareTo(todayDate)==0 && time_slot.compareTo(currentTime)<0) {
				continue;
			}
			
			int l=0;
			for (int j = 0; j < reservedTimeList.length; j++) {
				Date reserved_slot = df.parse(reservedTimeList[j]);
				if (time_slot.compareTo(reserved_slot)==0) {
					l = l+1;
				}
			}

			if(l<totalLaneCapacity)
				freeTimeList[i]=a[i];
				//freeTimeList[i]=df3.format(date3);
		}
		
		return freeTimeList;
		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveOnlineAppointment( @ModelAttribute("appointment") Appointment ap, BindingResult br,
			Model m,RedirectAttributes redirectAttributes) {
		
		SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat df2 = new SimpleDateFormat("dd-MM-yyyy");
		
		String todayDate = df2.format(new Date());
		String currentTime =df.format(new Date());
		
		String id = todayDate+"/"+currentTime;
		
		ap.setAppointmentID(id);
		ap.setAppointmentStatus("pending");
		ap.setPullStatus(false);
		service.save(ap);
		redirectAttributes.addFlashAttribute("success", 1);
		return "redirect:/";
		
	}

}
