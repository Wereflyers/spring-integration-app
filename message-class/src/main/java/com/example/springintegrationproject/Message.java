package com.example.springintegrationproject;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Message {
    private final boolean even;
    private final String messageContent;

    @Override
    public String toString() {
        return "Message{" +
                "even=" + even +
                ", messageContent='" + messageContent + '\'' + '}';
    }
}
