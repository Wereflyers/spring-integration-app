package com.example.springintegrationproject;

import com.example.springintegrationproject.service.MessageGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    private final MessageGateway messageGateway;

    @Autowired
    public MessageController(MessageGateway messageGateway) {
        this.messageGateway = messageGateway;
    }

    @GetMapping("/")
    public String getFormattedString(@RequestBody @NonNull String input) {
        if (input.replaceAll("\"", "").isBlank()) {
            throw new NullPointerException("Input is blank");
        }
        return messageGateway.collectString(input);
    }
}
