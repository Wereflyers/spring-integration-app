package org.example;

public class Message {

    private final String messageContent;
    private final boolean even;

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
