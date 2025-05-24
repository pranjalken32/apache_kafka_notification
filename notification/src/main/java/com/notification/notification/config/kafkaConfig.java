package com.notification.notification.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import static com.notification.notification.config.constants.NOTIFICATION_TOPIC_NAME;

@Configuration
public class kafkaConfig {

    @Bean
    public NewTopic topic(){


         // we can add replicas and partitions also now using default
        return TopicBuilder
        .name(NOTIFICATION_TOPIC_NAME).build();

    }
}
