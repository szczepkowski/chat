package it.stragan.chat.api.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
public class ChatMessageDto {
    private String id;
    private String userId;
    private String channelId;
    private String text;
}
