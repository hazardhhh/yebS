package com.hhh.server.controller;

import com.hhh.server.pojo.Menu;
import com.hhh.server.service.IMenuService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 前端控制器
 *
 * @author hhh
 * @since 2022-01-19
 */
@RestController
@RequestMapping("/system/config")
public class MenuController {

  @Autowired private IMenuService menuService;

  @ApiOperation(value = "根据用户id查询菜单列表")
  @GetMapping("/menu")
  public List<Menu> getMenusByAdminId() {
    return menuService.getMenusByAdminId();
  }
}
