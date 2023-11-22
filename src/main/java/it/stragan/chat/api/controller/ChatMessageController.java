package it.stragan.chat.api.controller;

import it.stragan.chat.infrastructure.ChatMessageRepository;
import it.stragan.chat.model.ChatMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/chat")
public class ChatMessageController {

    @Autowired
    private ChatMessageRepository chatMessageRepository;

    @PostMapping()
    public ChatMessage create(@RequestBody ChatMessageDto chatMessageDto) {
        return chatMessageRepository.save(ChatMessage.builder()
                .id(UUID.randomUUID().toString())
                .userId(chatMessageDto.getUserId())
                .channelId(chatMessageDto.getChannelId())
                .text(chatMessageDto.getText())
                .build());
    }
}
