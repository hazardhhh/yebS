package com.hhh.server.controller;

import com.hhh.server.pojo.Admin;
import com.hhh.server.service.IAdminService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 在线聊天
 *
 * @author HHH
 * @version 1.0.0
 * @date 2022/5/8 1:05
 */
@RestController
@RequestMapping("/chat")
public class ChatController {
  @Autowired private IAdminService adminService;

  @ApiOperation(value = "获取所有操作员")
  @GetMapping("/admin")
  public List<Admin> getAllAdmins(String keywords) {
    return adminService.getAllAdmins(keywords);
  }
}
