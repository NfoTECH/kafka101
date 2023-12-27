package com.fortunate.kafka101.controller;

import com.fortunate.kafka101.kafka.JsonKafkaProducer;
import com.fortunate.kafka101.payload.User;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {
    private final JsonKafkaProducer kafkaProducer;

    // http://localhost:8080/api/v1/kafka/publish
    @PostMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestBody User user) {
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json message published successfully");
    }
}
