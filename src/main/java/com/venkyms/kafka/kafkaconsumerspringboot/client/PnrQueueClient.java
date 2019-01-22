package com.venkyms.kafka.kafkaconsumerspringboot.client;

import com.venkyms.kafka.kafkaconsumerspringboot.model.PnrQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;

@Component
public class PnrQueueClient {

    @Autowired
    private RestOperations restOperations;

    private final String url;

    public PnrQueueClient(@Value("${pnrqueue.service.url}") String url) {
        this.url = url;
    }

    public void placeInPnrQueue(PnrQueue pnrQueueData) {
        restOperations.getForObject(url, PnrQueue.class);
    }
}
