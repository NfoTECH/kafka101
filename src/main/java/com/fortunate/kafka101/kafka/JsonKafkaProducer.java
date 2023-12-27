package com.fortunate.kafka101.kafka;

import com.fortunate.kafka101.payload.User;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class JsonKafkaProducer {
    private static final Logger LOG = LoggerFactory.getLogger(JsonKafkaProducer.class);

    private final KafkaTemplate<String, User> kafkaTemplate;

    public void sendMessage(User data) {
        Message<User> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "fortunate_json")
                .build();
        LOG.info(String.format("#### -> Producing message -> %s", data));
        kafkaTemplate.send(message);
    }
}
