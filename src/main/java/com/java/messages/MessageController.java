package com.java.messages;

import com.java.kafka.producer.SimpleProducer;
import com.java.pojo.WebMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
public class MessageController {

    @Autowired
    private SimpleProducer producer;

    @PostMapping
    public void acceptTestMessage(@RequestBody WebMessage message) {
        System.out.println("got message");
        producer.sendMessage(message);
    }
}
