package com.example.springBeans.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CarVehicleServiceImpl implements VehicleService{
    @Override
    public void startEngine() {
        log.info("starting engine");

    }

    @Override
    public void move() {
        log.info("moving car");
    }

    @Override
    public void stopEngine() {
        log.info("stopping engine");
    }
}
