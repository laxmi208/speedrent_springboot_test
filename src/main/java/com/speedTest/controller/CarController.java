package com.speedTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.speedTest.car.model.Car;

@RestController
public class CarController {

	@GetMapping(value="/hello")
	public Car getCarInFo() {
		Car car=new Car();
		car.setManufacturer("ABC");
		car.setName("Myvi");
	return car;	
	}
	
}
