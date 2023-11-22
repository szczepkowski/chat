package it.stragan.chat.business;

import it.stragan.chat.api.controller.ChatMessageDto;
import it.stragan.chat.business.mapper.ChatMessageMapper;
import it.stragan.chat.infrastructure.ChatMessageRepository;
import it.stragan.chat.model.ChatMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChatMessageService {

    @Autowired
    private ChatMessageRepository chatMessageRepository;

    @Autowired
    private ChatMessageMapper chatMessageMapper;


    public List<ChatMessageDto> getByChannelId(String channelId) {
        List<ChatMessage> chatMessages = chatMessageRepository.findByChannelId(channelId);
        return chatMessages.stream().map(chatMessage -> chatMessageMapper.map(chatMessage))
                .collect(Collectors.toList());
    }

    public ChatMessageDto create(ChatMessageDto chatMessageDto) {
        ChatMessage saved = chatMessageRepository.save(chatMessageMapper.map(chatMessageDto));
        return chatMessageMapper.map(saved);
    }
}
