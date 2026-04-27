package com.example.chatbot.controller;

import com.example.chatbot.model.MessageRequest;
import com.example.chatbot.model.MessageResponse;
import com.example.chatbot.service.ChatService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @Autowired
    private ChatService chatService;
    @PostMapping
    public MessageResponse receiveMessage(@RequestBody MessageRequest request) {

        System.out.println("Received message: " + request.getMessage());

        String reply = chatService.getReply(request.getMessage());

        // Generate time (HH:MM AM/PM)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        String time = LocalTime.now().format(formatter);

        return new MessageResponse(reply, time);
    }
}
