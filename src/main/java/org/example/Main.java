package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("integration-context.xml");
        context.getBean(MessageGateway.class).collectString("item1, item2, item3, item4");
    }
}
