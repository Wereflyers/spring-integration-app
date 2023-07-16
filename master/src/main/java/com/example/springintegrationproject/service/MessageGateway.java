package com.example.springintegrationproject.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;

public interface MessageGateway {

    void sendMessage(RabbitTemplate template, String exchange, Object data);
}
