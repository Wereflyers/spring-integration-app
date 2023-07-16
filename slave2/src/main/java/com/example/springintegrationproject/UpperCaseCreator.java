package com.example.springintegrationproject;

import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;

@Component
public class UpperCaseCreator {

    @Transformer(inputChannel = "upperCase", outputChannel = "master")
    public String getUpperCase(Message message) {
        return message.getMessageContent().toUpperCase();
    }

}
