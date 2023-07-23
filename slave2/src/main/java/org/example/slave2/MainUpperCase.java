package org.example.slave2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainUpperCase {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/integration-context.xml");
    }
}
