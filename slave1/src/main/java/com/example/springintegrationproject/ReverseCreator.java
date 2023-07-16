package com.example.springintegrationproject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ReverseCreator {
    @RabbitListener(queues = "myQueue1")
    public void getReverse(String message) {
        log.info("Received from queue1 " + new StringBuilder(message).reverse());
    }
}
