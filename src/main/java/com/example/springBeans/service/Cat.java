package com.example.springBeans.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Cat {
    public void makeNoise(){
        log.info("meow!!!!!!!!!!!!!");
    }
}
