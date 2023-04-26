package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.RegsiterForm;

@RestController
public class Controller {

	
	
	
	  @GetMapping("/get")
	  public String getMethod() {
	    return "GET METHOD";
	  }

	  @PostMapping("/post")
	  public String registerPost(@RequestBody RegsiterForm form) {
		  
		  System.out.println("Customer ID is"+form.getCustomerId());
		  		  
		  return "POST METHOD";
	  }
	  

}
