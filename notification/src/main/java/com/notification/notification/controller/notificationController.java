package com.notification.notification.controller;

import com.notification.notification.service.messageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/notification")
public class notificationController {

    @Autowired
    private messageService messageService;

    @PostMapping("/update")
    public ResponseEntity<?> updateNotification() {
        messageService.sendNotification();
        return new ResponseEntity<>(Map.of("message","Notification Sent"), HttpStatus.OK);
    }
}
