package com.fortunate.kafka101.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
        private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);

        @KafkaListener(topics = "fortunate", groupId = "myGroup")
        public void consumeMessage(String message) {
            LOG.info(String.format("#### -> Consumed message -> %s", message));
        }
}
