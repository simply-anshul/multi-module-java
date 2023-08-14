package com.anshul.tools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToolsService {
	
	
	@Autowired
	SampleRepository sampleRepository ; 
	
	
	public String toolsMessage() {
		return "Hello from tools";
	}

	public String all() {
		return sampleRepository.findAll().toString();
	}

}
