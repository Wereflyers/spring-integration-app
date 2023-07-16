package com.example.springintegrationproject;

import org.springframework.context.annotation.Bean;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.stereotype.Service;

@Service
public class IntegrationConfig {
    @Bean
    public IntegrationFlow routerFlow() {
        return IntegrationFlows.from("newMessageChannel")
                .route(Message.class, m -> m.isEven() ? "upperCase" : "reverse")
                .get();
    }

    @Bean
    public IntegrationFlow aggregateFlow() {
        return IntegrationFlows.from("master")
                .aggregate()
                .channel("finalMessage")
                .get();
    }

    @Bean
    public IntegrationFlow splitFlow() {
        return IntegrationFlows.from("listOfMessages")
                .split()
                .channel("newMessageChannel")
                .get();
    }
}
