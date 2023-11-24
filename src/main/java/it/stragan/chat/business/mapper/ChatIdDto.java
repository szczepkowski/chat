package it.stragan.chat.business.mapper;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChatIdDto {
    private String id;
    private String created;
}
