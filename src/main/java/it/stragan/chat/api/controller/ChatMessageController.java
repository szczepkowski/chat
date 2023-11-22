package it.stragan.chat.api.controller;

import it.stragan.chat.business.ChatMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chat")
public class ChatMessageController {

    @Autowired
    private ChatMessageService chatMessageService;


    @PostMapping()
    public ChatMessageDto create(@RequestBody ChatMessageDto chatMessageDto) {
       return chatMessageService.create(chatMessageDto);
    }

    @GetMapping(path = "/{channelId}")
    public List<ChatMessageDto> get(@PathVariable String channelId){
        return chatMessageService.getByChannelId(channelId);
    }
}
