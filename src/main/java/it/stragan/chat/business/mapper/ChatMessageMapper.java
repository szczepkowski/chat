package it.stragan.chat.business.mapper;


import it.stragan.chat.api.controller.ChatMessageDto;
import it.stragan.chat.model.ChatMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class ChatMessageMapper {
    public abstract ChatMessageDto map(ChatMessage chatMessage);

    @Mapping(target = "id", expression = "java(java.util.UUID.randomUUID().toString())")
    public abstract ChatMessage map(ChatMessageDto dto);

}
