package com.example.springintegrationproject.service;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class MessageProcessor {

    @ServiceActivator(inputChannel = "finalMessage")
    public String printLine(String message) {
        System.out.println(message);
        return message;
    }
}
