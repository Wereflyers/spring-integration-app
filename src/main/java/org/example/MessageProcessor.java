package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class MessageProcessor {

    MessageService messageService;

    @Autowired
    public MessageProcessor(MessageService messageService) {
        this.messageService = messageService;
    }

    @ServiceActivator
    public void printLine(String message) {
        messageService.printObject(message);
    }
}
