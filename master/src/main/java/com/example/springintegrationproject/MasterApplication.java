package com.example.springintegrationproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

@SpringBootApplication
@ImportResource("/integration/integration.xml")
public class MasterApplication {

	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext ctx = new SpringApplication(MasterApplication.class).run(args);
		ctx.getBean(MessageGateway.class).collectString("item1, item2, item3, item4");
		ctx.close();
	}

}
