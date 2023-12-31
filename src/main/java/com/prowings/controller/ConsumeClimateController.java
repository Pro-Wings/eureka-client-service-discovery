package com.prowings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.model.Climate;
import com.prowings.service.FetchClimateService;

@RestController
public class ConsumeClimateController {
	
	@Autowired
	FetchClimateService climateService;
	
	@GetMapping("/fetchClimate/hello")
	public String hello()
	{
		return "hello!!";
	}
	
	@GetMapping("/fetchClimate/{city}")
	public Climate fetchClimateFromClimateService(@PathVariable String city)
	{
		Climate climate = climateService.fetch(city);
		
		return climate;
	}

}
