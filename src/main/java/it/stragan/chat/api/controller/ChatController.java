package it.stragan.chat.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/chat")
public class ChatController {

    @GetMapping
    public List<Chat> getChats() {
        return Arrays.asList(Chat.values());
    }
}
