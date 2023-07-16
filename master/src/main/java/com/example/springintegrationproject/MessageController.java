package com.example.springintegrationproject;

import com.example.springintegrationproject.service.MessageGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    private final MessageGateway messageGateway;

    @Autowired
    public MessageController(MessageGateway messageGateway) {
        this.messageGateway = messageGateway;
    }

    @PostMapping("/")
    public ResponseEntity<String> getFormattedString(@RequestBody @NonNull String input) {
        if (input.replaceAll("\"", "").isBlank()) {
            return new ResponseEntity<>("Error: empty input", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(messageGateway.collectString(input), HttpStatus.OK);
    }
}
