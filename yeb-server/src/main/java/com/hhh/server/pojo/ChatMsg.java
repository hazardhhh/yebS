package com.hhh.server.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * 消息
 *
 * @author HHH
 * @version 1.0.0
 * @date 2022/5/8 0:53
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ChatMsg {
  private String from;
  private String to;
  private String content;
  private LocalDateTime date;
  private String fromNickName;
}
