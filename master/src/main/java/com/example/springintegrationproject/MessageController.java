package com.example.springintegrationproject;

import com.example.springintegrationproject.exception.ValidParam;
import com.example.springintegrationproject.service.MessageGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
public class MessageController {
    private final MessageGateway messageGateway;

    @Autowired
    public MessageController(MessageGateway messageGateway) {
        this.messageGateway = messageGateway;
    }

    @PostMapping("/")
    public ResponseEntity<String> getFormattedString(@RequestBody @ValidParam String input) {
        return new ResponseEntity<>(messageGateway.collectString(input), HttpStatus.OK);
    }
}
