package com.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.entity.Lenguages;
import com.apirest.service.*;
@RestController
@RequestMapping("/api")
public class LenguagesRestController{
	private static LenguagesRestController instancia;
	 @Autowired
	 private LenguagesService lenguagesService;
	 private LenguagesRestController(){

	 }
	 public static LenguagesRestController getInstance(){
		 if(instancia == null){
 				instancia=new LenguagesRestController();
		 }
		 return instancia;
	 }
	 @GetMapping("/lenguages")
	    public List<Lenguages> findAll(){
	        
	        return lenguagesService.findAll();
	    }
	 @GetMapping("/lenguages/{lenguagesId}")
	    public Lenguages getUser(@PathVariable int lenguagesId){
	        Lenguages lenguages = lenguagesService.findById(lenguagesId);

	        if(lenguages == null) {
	            throw new RuntimeException("User id not found -"+lenguagesId);
	        }
	        
	        return lenguages;
	    }
	 
	 @PostMapping("/lenguages")
	    public Lenguages addUser(@RequestBody Lenguages lenguages) {
		 lenguages.setId(0);

	        
	        lenguagesService.save(lenguages);

	        return lenguages;

	    }
	  
	    @PutMapping("/lenguages")
	    public Lenguages updateUser(@RequestBody Lenguages lenguages) {

	        lenguagesService.save(lenguages);

	      

	        return lenguages;
	    }
	    @DeleteMapping("lenguages/{lenguagesId}")
	    public String deteteUser(@PathVariable int lenguagesId) {

	        Lenguages lenguages = lenguagesService.findById(lenguagesId);

	        if(lenguages == null) {
	            throw new RuntimeException("Lenguage id not found -"+lenguagesId);
	        }

	        lenguagesService.deleteById(lenguagesId);

	        
	        return "Deleted lenguage id - "+lenguagesId;
	    }
	 

}
