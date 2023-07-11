package org.example.slave1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainReverse {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("integration-context.xml");
    }
}
