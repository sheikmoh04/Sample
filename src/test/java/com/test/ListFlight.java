package com.test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;

import com.pojo.Data;
import com.pojo.FlightList;
import com.pojo.Support;

import tools.jackson.databind.ObjectMapper;

public class ListFlight {

	public static void main(String[] args) throws IOException, ParseException {
		
		//1.Create object for ObjectMapper class
		ObjectMapper mapper = new ObjectMapper();
		
		//2.Pass the Json file to fetch value
		FlightList flightList = mapper.readValue(new File
				("C:\\Users\\sheik\\eclipse-workspace\\ApiTest\\src\\test\\resources\\ListFlight.json"),
				FlightList.class);
		
		int page = flightList.getPage();
		System.out.println(page);
		System.out.println(flightList.getPer_page());
		System.out.println(flightList.getTotal());
		System.out.println(flightList.getTotal_pages());
		
		List<Data> data = flightList.getData();
		for (Data data2 : data) {
			System.out.println(data2.getId());
			System.out.println(data2.getFlightName());
			System.out.println(data2.getDestinations());
			System.out.println(data2.getCountry());
			System.out.println(data2.getURL());
		}
		
		Support support = flightList.getSupport();
		System.out.println(support.getText());
		System.out.println(support.getUrl());
		
	}
	
	
}
