package it.stragan.chat.api.controller;

import it.stragan.chat.business.mapper.ChatIdDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
public class ChatDto {
    private ChatIdDto chatId;
    private String userId;
    private String text;
}
