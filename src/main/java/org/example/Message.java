package org.example;

import org.springframework.integration.annotation.Filter;

import java.util.concurrent.atomic.AtomicInteger;

public class Message {

    private String messageContent;
    private boolean even;

    public Message(String messageContent, boolean even) {
        this.messageContent = messageContent;
        this.even = even;
    }

    public Boolean choseChannel() {
        return even;
    }

    public String getMessageContent() {
        return messageContent;
    }
}
