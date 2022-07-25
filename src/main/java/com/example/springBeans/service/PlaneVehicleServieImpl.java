package com.example.springBeans.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PlaneVehicleServieImpl implements VehicleService {
    @Override
    public void startEngine() {
        log.info("starting plane engine");

    }

    @Override
    public void move() {
        log.info("flying plane");
    }

    @Override
    public void stopEngine() {
        log.info("stopping plane engine");
    }
}
