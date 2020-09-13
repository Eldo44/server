package com.vimcar.server.rest.routes;


import com.vimcar.server.rest.domain.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private MessageService service;

    @PostMapping("/message")
    public void createMessage(@RequestBody String message){
        service.append(message);
    }
}
