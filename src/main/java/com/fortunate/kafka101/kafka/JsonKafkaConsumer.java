package com.fortunate.kafka101.kafka;

import com.fortunate.kafka101.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOG = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "fortunate_json", groupId = "myGroup")
    public void consumeMessage(User user) {
        LOG.info(String.format("#### -> Consumed message -> %s", user.toString()));
    }
}
