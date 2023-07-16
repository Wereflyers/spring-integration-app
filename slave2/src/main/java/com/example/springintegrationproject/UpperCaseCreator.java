package com.example.springintegrationproject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UpperCaseCreator {

    @RabbitListener(queues = "myQueue2")
    public void getUpperCase(String message) {
        log.info("Received from queue2 " + message.toUpperCase());
    }

}
