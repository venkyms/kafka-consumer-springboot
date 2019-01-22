package com.venkyms.kafka.kafkaconsumerspringboot.listener;

import com.venkyms.kafka.kafkaconsumerspringboot.model.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "simpleKafkaProducer")
    public void consume(String message) {
        System.out.println("ConsumedMessage:"+ message);

        //TODO  - call external service

    }

    @KafkaListener(topics = "simpleKafkaProducer_json", groupId = "group_json", containerFactory = "messageListenerContainerFactory")
    public void consumeMessage(Message message){
        System.out.println("consumed_json:"+message);
    }
}
