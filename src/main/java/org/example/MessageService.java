package org.example;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public void printObject(String object) {
        System.out.println(object);
    }
}
