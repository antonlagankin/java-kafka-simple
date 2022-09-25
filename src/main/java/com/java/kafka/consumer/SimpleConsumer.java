package com.java.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class SimpleConsumer {
    @KafkaListener(
            topics = "msg",
            groupId = "app.1"
    )

    public void msgListener(String message) {
        System.out.println("kafka-listener - " + message);
    }
}
