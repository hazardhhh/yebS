package com.hhh.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author HHH
 * @date 2022/1/21 @Version 1.0.0
 */
@RestController
public class HelloController {
  @GetMapping("hhh")
  public String hhh() {
    return "hhh";
  }

  @GetMapping("/employee/basic/hhh")
  public String hhh2() {
    return "/employee/basic/hhh";
  }

  @GetMapping("/employee/advanced/hhh")
  public String hhh3() {
    return "/employee/advanced/hhh";
  }
}
