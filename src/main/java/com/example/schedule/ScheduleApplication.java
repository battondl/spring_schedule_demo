package com.example.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.schedule.service.SchedulingService;

@SpringBootApplication
public class ScheduleApplication {


	public static void main(String[] args) throws InterruptedException {
		ApplicationContext applicationContext = SpringApplication.run(ScheduleApplication.class, args);
		SchedulingService schedulingService = applicationContext.getBean(SchedulingService.class);
		schedulingService.printSomething();
	}

}
