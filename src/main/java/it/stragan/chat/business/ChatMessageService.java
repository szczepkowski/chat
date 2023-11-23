package it.stragan.chat.business;

import it.stragan.chat.api.controller.ChatDto;
import it.stragan.chat.business.mapper.ChatMapper;
import it.stragan.chat.infrastructure.ChatMessageRepository;
import it.stragan.chat.model.Chat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChatMessageService {

    @Autowired
    private ChatMessageRepository chatMessageRepository;

    @Autowired
    private ChatMapper chatMessageMapper;


    public List<ChatDto> getByChat(String chat) {
        List<Chat> chats = chatMessageRepository.findById(chat);
        return chats.stream().map(chatMessage -> chatMessageMapper.map(chatMessage))
                .collect(Collectors.toList());
    }

    public ChatDto create(ChatDto chatMessageDto) {
        Chat saved = chatMessageRepository.save(chatMessageMapper.map(chatMessageDto));
        return chatMessageMapper.map(saved);
    }
}
