package org.example;

import org.springframework.integration.annotation.Filter;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class MessageFilter {
    private static final AtomicInteger count = new AtomicInteger(0);

    @Filter
    public Boolean choseChannel() {
        return count.getAndIncrement() % 2 == 0;
    }
}
