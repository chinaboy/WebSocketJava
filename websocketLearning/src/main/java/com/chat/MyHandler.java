package com.chat;

import org.springframework.web.socket.handler.TextWebSocketHandler;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.TextMessage;

public class MyHandler extends TextWebSocketHandler {

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) {

        try {
            super.handleTextMessage(session, message);
            session.sendMessage(message);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}