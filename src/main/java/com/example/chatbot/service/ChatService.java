package com.example.chatbot.service;

import org.springframework.stereotype.Service;
@Service
public class ChatService {
    public String getReply(String message) {
        if(message==null){return "Invalid Message";}
        message = message.toLowerCase();
        switch (message){
            case "hi":return "Hello!";
            case "bye":return "GoodBye!";
            case "how are you": return "I'm doing great!";
            case "thanks": return "You're welcome!";
            case "help": return "You can say Hi or Bye!";
            default: return "I didn't understand that";
        }
    }
}
