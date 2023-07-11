package org.example.slave2;

import org.example.message.Message;
import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;

@Component
public class UpperCaseCreator {

    @Transformer(inputChannel = "master")
    public String getUpperCase(Message message) {
        return message.getMessageContent().toUpperCase();
    }
}
