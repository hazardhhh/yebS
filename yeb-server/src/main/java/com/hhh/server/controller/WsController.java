package com.hhh.server.controller;

import com.hhh.server.pojo.Admin;
import com.hhh.server.pojo.ChatMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;

/**
 * websocket
 *
 * @author HHH
 * @version 1.0.0
 * @date 2022/5/8 0:56
 */
@Controller
public class WsController {
  @Autowired private SimpMessagingTemplate simpMessagingTemplate;

  @MessageMapping("/ws/chat")
  public void handleMsg(Authentication authentication, ChatMsg chatMsg) {
    Admin admin = (Admin) authentication.getPrincipal();
    chatMsg.setFrom(admin.getUsername());
    chatMsg.setFromNickName(admin.getName());
    chatMsg.setDate(LocalDateTime.now());
    /** 发送消息 1.消息接收者 2.消息队列 3.消息对象 */
    simpMessagingTemplate.convertAndSendToUser(chatMsg.getTo(), "/queue/chat", chatMsg);
  }
}
