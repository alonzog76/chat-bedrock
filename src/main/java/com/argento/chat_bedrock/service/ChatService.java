package com.argento.chat_bedrock.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    @Autowired
    ChatModel chatModel;


    public String answerQuestion(String question){

        String response = ChatClient.create(this.chatModel)
                .prompt(question)
                .call()
                .content();


        return response;
    }
}
