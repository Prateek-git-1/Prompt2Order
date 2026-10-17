package com.ai.tool_calling.controller;

import com.ai.tool_calling.dto.ChatRequest;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class ChatController {

    ChatClient chatClient;

    public ChatController(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @PostMapping(value="/ask")
    public String chat(@RequestBody ChatRequest chatRequest) {
        return chatClient.prompt()
                .user(chatRequest.getMessage())
                .call().content();
    }

}