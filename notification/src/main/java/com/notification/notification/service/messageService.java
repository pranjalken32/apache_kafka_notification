package com.notification.notification.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Random;

@Service
public class messageService {

    private static final List<String> MESSAGES = List.of(
            "Hello, your order is packed.",
            "Your order is out for delivery.",
            "Your order has been delivered.",
            "Your order has been delayed.",
            "Thank you for shopping with us!",
            "We hope you enjoyed your purchase."
    );

    private static final Random random = new Random();

    @Autowired
    private kafkaService kafkaService;

    public void sendNotification() {
        for (int i = 0; i < 100; i++) {
            String message = MESSAGES.get(random.nextInt(MESSAGES.size()));
            kafkaService.updateNotification(message);
        }
    }
}
