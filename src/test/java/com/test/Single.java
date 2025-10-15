package com.test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Single {

	public static void main(String[] args) throws IOException, ParseException {
		
		JSONParser jsonParser = new JSONParser();
		Object object = jsonParser.parse(new FileReader("C:\\Users\\sheik\\eclipse-workspace\\ApiTest\\src\\test\\resources\\SingleFlight.json"));
		
		JSONObject jsonObject = (JSONObject) object;
		Object object2 = jsonObject.get("data");
		System.out.println(object2);
		
		JSONObject jsonObject2 = (JSONObject) object2;
		Object object3 = jsonObject2.get("id");
		System.out.println(object3);
		
		JSONObject jsondata = (JSONObject) object2;
		Collection values = jsondata.values();
		for (Object data : values) {
			System.out.println(data);
		}
		
		Object object4 = jsonObject.get("support");
		JSONObject jsonsupport = (JSONObject) object4;
		Collection values2 = jsonsupport.values();
		for (Object support : values2) {
			System.out.println(support);
		}
		
		System.out.println("Scripting done");
		System.out.println("reScripting for tester2");
	}
	
	
}
