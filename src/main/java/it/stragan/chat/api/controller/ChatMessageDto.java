package it.stragan.chat.api.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class ChatMessageDto {
    private final String id;
    private final String userId;
    private final String channelId;
    private final String text;
}
