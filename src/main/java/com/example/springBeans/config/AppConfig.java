package com.example.springBeans.config;

import com.example.springBeans.service.CarVehicleServiceImpl;
import com.example.springBeans.service.PlaneVehicleServieImpl;
import com.example.springBeans.service.VehicleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
    @Bean
    public VehicleService getBeanCarVehicleServiceImpl(){
        return new CarVehicleServiceImpl();
    }

    @Bean
    @Primary
    public VehicleService getBeanPlaneVehicleServiceImpl(){
        return new PlaneVehicleServieImpl();
    }
}
