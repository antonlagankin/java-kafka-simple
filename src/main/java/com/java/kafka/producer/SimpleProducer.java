package com.java.kafka.producer;

import com.java.pojo.WebMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SimpleProducer {

    @Autowired
    private KafkaTemplate<Long, WebMessage> kafkaTemplate;

    @Value("${spring.kafka.consumer.group-id}")
    private String kafkaGroupId;

    public void sendMessage(WebMessage message) {
        kafkaTemplate.send(kafkaGroupId, message);
    }

}
