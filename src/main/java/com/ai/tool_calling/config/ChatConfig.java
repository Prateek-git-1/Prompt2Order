package com.ai.tool_calling.config;

import com.ai.tool_calling.tools.OrderTools;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatConfig {

    @Bean
    public ChatClient getChatClient(ChatModel chatModel, OrderTools orderTools) {
        return ChatClient.builder(chatModel).defaultTools(orderTools).defaultSystem("").build();
    }
}
