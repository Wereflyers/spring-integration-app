package org.example.message;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMessageClass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("integration-context.xml");
    }
}
