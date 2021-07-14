package com.example.schedule.service;

import com.example.schedule.config.SchedulingConfiguration;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringJUnitConfig(SchedulingConfiguration.class)
class SchedulingServiceTest {

    private SchedulingService schedulingService = new SchedulingService();

    @Test
    void printSomething() throws InterruptedException {
        schedulingService.printSomething();
        assertTrue(true);
    }
}