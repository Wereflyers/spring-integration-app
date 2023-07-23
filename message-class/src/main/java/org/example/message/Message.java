package org.example.message;


public class Message {
    private final boolean even;
    private final String messageContent;

    public Message(String messageContent, boolean even) {
        this.even = even;
        this.messageContent = messageContent;
    }

    public boolean choseChannel() {
        return even;
    }

    public String getMessageContent() {
        return messageContent;
    }
}
