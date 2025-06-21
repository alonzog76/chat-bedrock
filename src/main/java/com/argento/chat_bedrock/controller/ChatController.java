package com.argento.chat_bedrock.controller;

import com.argento.chat_bedrock.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/questions")
@RestController
public class ChatController {

    @Autowired
    ChatService chatService;

    @GetMapping
    public String askQuestion(@RequestParam String question){
        return chatService.answerQuestion(question);
    }

}
