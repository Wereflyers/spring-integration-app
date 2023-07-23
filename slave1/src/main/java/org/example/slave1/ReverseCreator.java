package org.example.slave1;

import org.example.message.Message;
import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;

@Component
public class ReverseCreator {
    @Transformer
    public String getReverse(Message message) {
        return new StringBuilder(message.getMessageContent()).reverse().toString();
    }
}
