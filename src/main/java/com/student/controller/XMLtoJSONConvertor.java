package com.student.controller;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XMLtoJSONConvertor {
	
	@PostMapping(value= "/xmltojsonConverter",
			consumes= MediaType.APPLICATION_XML_VALUE,
			produces= MediaType.APPLICATION_JSON_VALUE
			)
	
	public String xmljson(@RequestBody String stringXml) 
	{
		JSONObject json = XML.toJSONObject(stringXml);
		return json.toString();
	}

}
