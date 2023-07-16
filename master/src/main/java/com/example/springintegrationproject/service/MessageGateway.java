package com.example.springintegrationproject.service;

import org.springframework.integration.annotation.EndpointId;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface MessageGateway {
    @EndpointId("messageGateway")
    @Gateway(requestChannel = "newLine")
    String collectString(String line);
}
