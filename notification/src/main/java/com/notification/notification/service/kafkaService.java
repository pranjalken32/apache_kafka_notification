package com.notification.notification.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import static com.notification.notification.config.constants.NOTIFICATION_TOPIC_NAME;

@Service
public class kafkaService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void updateNotification(String notification){
            this.kafkaTemplate.send(NOTIFICATION_TOPIC_NAME, notification);
    }
}
