package org.example.master;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(new ClassPathResource(
                        "/integration-context.xml" ).getPath() );
        context.getBean(MessageGateway.class).collectString("item1, item2, item3, item4");
        context.close();
    }
}
