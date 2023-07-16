package com.example.springintegrationproject;

import com.example.springintegrationproject.exception.ValidParam;
import com.example.springintegrationproject.service.MessageGateway;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class MessageController {

    private final MessageGateway messageGateway;
    private final RabbitConfiguration rabbitConfiguration;
    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public MessageController(MessageGateway messageGateway, RabbitConfiguration rabbitConfiguration, RabbitTemplate rabbitTemplate) {
        this.messageGateway = messageGateway;
        this.rabbitConfiguration = rabbitConfiguration;
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostMapping("/")
    public ResponseEntity<String> sendMessageToRabbit(@RequestBody @ValidParam String input) {
        messageGateway.sendMessage(rabbitTemplate, rabbitConfiguration.getExchange(), input);
        return new ResponseEntity<>("Process string " + input, HttpStatus.OK);
    }
}
