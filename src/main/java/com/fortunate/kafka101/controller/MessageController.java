package com.fortunate.kafka101.controller;

import com.fortunate.kafka101.kafka.KafkaProducer;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/kafka")
public class MessageController {

    private final KafkaProducer kafkaProducer;

    // http://localhost:8080/api/v1/kafka/publish?message=
    @GetMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestParam("message") String message) {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message published successfully");
    }
}
