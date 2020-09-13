package com.vimcar.server.rest.domain.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public void append(String message) {
        System.out.println(message);
    }
}
