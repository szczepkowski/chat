package it.stragan.chat.business.mapper;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChatIdDto {
    private String id;
    private LocalDateTime created;
}
