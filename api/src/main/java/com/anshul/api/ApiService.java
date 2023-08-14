package com.anshul.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anshul.tools.ToolsService;

@RestController
public class ApiService {
	
	@Autowired
	ToolsService toolsService ; 

	@GetMapping("")
	public String message() {
		return "Hello from api";
	}
	
	@GetMapping("/tools")
	public String toolsMessage() {
		return toolsService.toolsMessage();
	}
	
	@GetMapping("/all")
	public String all() {
		return toolsService.all();
	}
}
