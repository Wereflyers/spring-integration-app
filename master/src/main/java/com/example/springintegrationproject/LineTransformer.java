package com.example.springintegrationproject;

import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LineTransformer {

    @Transformer
    public List<Message> transformLine(String line) {
        List<Message> listOfMessages = new ArrayList<>();
        String[] lineSplit = line.split(",");
        for (int i = 0; i < lineSplit.length; i++) {
            listOfMessages.add(new Message(i % 2 == 0, lineSplit[i].trim()));
        }
        return listOfMessages;
    }
}
