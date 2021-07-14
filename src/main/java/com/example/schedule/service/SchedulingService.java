package com.example.schedule.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;



@Service
public class SchedulingService {


    @Scheduled(initialDelayString = "${printSomething.initDelay}", fixedDelayString = "${printSomething.delay}")
    public void printSomething() throws InterruptedException {
        System.out.println("Now is " + new Date());
    }

}
