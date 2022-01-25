package com.saurabh.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.saurabh.booking.entities.City;
import com.saurabh.booking.entities.Train;
import com.saurabh.booking.repositories.CityRepository;
import com.saurabh.booking.repositories.TrainRepository;

@RestController
@RequestMapping("")
public class TravelController {
	
	@Autowired
	public CityRepository cityRepository;
	@Autowired
	public TrainRepository trainRepository;
	
	@RequestMapping("/city")
	public ModelAndView searchCity()
	{
		ModelAndView m=new ModelAndView("cities");
		City u=new City();
		m.addObject(u);
		return m;
	}
	
	
	@RequestMapping("/first")
	public ModelAndView trainDetails(@ModelAttribute("City") City city)
	{
		ModelAndView m=new ModelAndView("trains");
		List<Train> details=trainRepository.train_details(city.getCityid(),city.getCityfrom(),city.getTocity());
		m.addObject("Train",details);
		return m;
	}

}
