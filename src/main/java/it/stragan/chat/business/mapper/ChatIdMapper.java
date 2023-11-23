package it.stragan.chat.business.mapper;

import it.stragan.chat.model.ChatId;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ChatIdMapper {
    ChatIdDto map(ChatId chatId);
    ChatId map(ChatIdDto chatDto);
}
