package com.fortunate.kafka101.kafka;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    private static final Logger LOG = LoggerFactory.getLogger(KafkaProducer.class);

    public void sendMessage(String message) {
        LOG.info(String.format("#### -> Producing message -> %s", message));
        this.kafkaTemplate.send("fortunate", message);
    }
}
