package it.stragan.chat.business.mapper;


import it.stragan.chat.api.controller.ChatDto;
import it.stragan.chat.model.Chat;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class ChatMapper {

    @Mapping(target = "chatId.id", source = "id")
    @Mapping(target = "chatId.created", source = "created")
    public abstract ChatDto map(Chat chat);

    @Mapping(target = "chatId.created", expression = "java(java.time.LocalDateTime.now().toString())")
    @Mapping(target = "chatId.id", source = "chatId.id")
    public abstract Chat map(ChatDto dto);

}
