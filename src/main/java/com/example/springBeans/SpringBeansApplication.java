package com.example.springBeans;

import com.example.springBeans.service.CarVehicleServiceImpl;
import com.example.springBeans.service.Cat;
import com.example.springBeans.service.PlaneVehicleServieImpl;
import com.example.springBeans.service.VehicleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBeansApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBeansApplication.class, args);
		VehicleService vehicleService = ctx.getBean("getBeanCarVehicleServiceImpl",VehicleService.class);
		vehicleService.startEngine();
		vehicleService.move();
		vehicleService.stopEngine();

		Cat cat = ctx.getBean(Cat.class);
		cat.makeNoise();
	}

}
