package com.apirest;

import com.apirest.controller.LenguagesRestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestApplication.class, args);
		LenguagesRestController lenguagesRestController =  LenguagesRestController.getInstance();
		LenguagesRestController lenguagesRestController2 =  LenguagesRestController.getInstance();



		System.out.println("lenguagesRestController "+String.valueOf(lenguagesRestController));
		System.out.println("lenguagesRestController2 "+String.valueOf(lenguagesRestController2));
	}



}
