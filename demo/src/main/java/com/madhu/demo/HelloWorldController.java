package com.madhu.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@RequestMapping("/")
	public @ResponseBody Map<String,String> helloWorld(){
		
		Map<String,String> newMap = new HashMap<String,String>();
		newMap.put("message", "helloworld");
		return newMap;
	} 
}
