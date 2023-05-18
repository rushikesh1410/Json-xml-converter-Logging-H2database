package com.student.controller;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JSONtoXMLConverter
{
	@PostMapping(value= "/jsontoxmlConverter",
				consumes= MediaType.APPLICATION_JSON_VALUE,
				produces= MediaType.APPLICATION_XML_VALUE)
	
	public String jsonxml(@RequestBody String jsonstring) 
	{
		JSONObject json = new JSONObject(jsonstring);
		return XML.toString(json);
	}

}
