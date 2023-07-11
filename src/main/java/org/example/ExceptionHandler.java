package org.example;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class ExceptionHandler {

    @ServiceActivator
    public void handleFailed(Exception e) {
        System.out.println("Failed:  "+ e);
    }
}
