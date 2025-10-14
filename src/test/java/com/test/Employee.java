package com.test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Employee {

	public static void main(String[] args) throws IOException, ParseException {
		
		//1.create object for JSONParser class
		JSONParser jsonParser = new JSONParser();
		
		//2.pass the JSON file to fetch values
		Object object = jsonParser.parse(new FileReader
				("C:\\Users\\sheik\\eclipse-workspace\\ApiTest\\src\\test\\resources\\Details.json"));
		
		//3. Convert Object to json object
		JSONObject jsonObject = (JSONObject) object;
		Object name = jsonObject.get("EmpName");
		System.out.println(name);
		
		System.out.println("All Values..........");
		
		Collection values = jsonObject.values();
		for (Object eachvalue : values) {
			System.out.println(eachvalue);
		}
		System.out.println("All Keys.........");
		Set keySet = jsonObject.keySet();
		for (Object key : keySet) {
			System.out.println(key);
		}
		System.out.println("All Entries........");
		Set entrySet = jsonObject.entrySet();
		for (Object esets : entrySet) {
			System.out.println(esets);
		}
		
	}
}
