package com.bytestream.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytestream.entity.CovidData;

@RestController
@RequestMapping("/api/v1")
public class CovidController 
{
	@CrossOrigin("*")
	@GetMapping("/getCovidData")
	public List<CovidData> getCovidData()
	
	{
		CovidData data  = new CovidData(100, 200, "New York", 400);
		CovidData data1  = new CovidData(200, 300, "London", 500);
		CovidData data2  = new CovidData(300, 400, "Paris", 400);
		CovidData data3  = new CovidData(400, 500, "Rome", 300);
		
		List<CovidData> list = new ArrayList();
		list.add(data);
		list.add(data1);
		list.add(data2);
		list.add(data3);
		
		return list;
		
	}
}
