package com.example.springintegrationproject.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageGatewayImpl implements MessageGateway {

    @Override
    public void sendMessage(RabbitTemplate template, String exchange, Object data) {
        List<String> lines = transformLine(data.toString());
        for (int i = 0; i < lines.size(); i++) {
            if (i % 2 == 0) template.convertAndSend(exchange, "testRoutingKey1", lines.get(i));
            else template.convertAndSend(exchange, "testRoutingKey2", lines.get(i));
        }
    }

    public List<String> transformLine(String line) {
        List<String> listOfMessages = new ArrayList<>();
        String[] lineSplit = line.replaceAll("\"", "").split(",");
        for (String s : lineSplit) {
            listOfMessages.add(s.trim());
        }
        return listOfMessages;
    }
}
