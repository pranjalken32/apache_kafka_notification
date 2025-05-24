package com.enduser.enduser.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import static com.enduser.enduser.config.constants.GROUP_ID;
import static com.enduser.enduser.config.constants.NOTIFICATION_TOPIC_NAME;

@Configuration
public class kafkaConfig {

    @KafkaListener(topics=NOTIFICATION_TOPIC_NAME,groupId = GROUP_ID)
    public void getNotification(String message){
        System.out.println(message);
    }

}
