package com.fortunate.kafka101.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;


@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic fortunateTopic() {
        return TopicBuilder.name("fortunate")
//            .partitions(3)
//            .replicas(3)
            .build();
    }

    @Bean
    public NewTopic fortunateJsonTopic() {
        return TopicBuilder.name("fortunate_json")
                .build();
    }
}
