package com.example.springintegrationproject;

import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;

@Component
public class ReverseCreator {
    @Transformer(inputChannel = "reverse", outputChannel = "master")
    public String getReverse(Message message) {
        return new StringBuilder(message.getMessageContent()).reverse().toString();
    }
}
