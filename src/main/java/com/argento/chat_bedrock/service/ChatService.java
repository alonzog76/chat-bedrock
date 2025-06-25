package com.argento.chat_bedrock.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.vectorstore.QuestionAnswerAdvisor;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    @Autowired
    ChatModel chatModel;

    private final VectorStore vectorStore;

    private final EmbeddingModel embeddingModel;

    public ChatService(EmbeddingModel embeddingModel, VectorStore vectorStore) {
        this.embeddingModel = embeddingModel;
        this.vectorStore = vectorStore;
    }

    public String answerQuestion(String question) {

        String response = ChatClient.create(this.chatModel)
                .prompt(question)
                .advisors(new QuestionAnswerAdvisor(vectorStore))
                .call()
                .content();


        return response;
    }
}
