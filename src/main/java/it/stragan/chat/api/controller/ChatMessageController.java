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
    public ChatDto create(@RequestBody ChatDto chatDto) {
       return chatMessageService.create(chatDto);
    }

    @GetMapping(path = "/{channelId}")
    public List<ChatDto> get(@PathVariable String channelId){
        return chatMessageService.getByChat(channelId);
    }
}
