package com.hhh.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hhh.server.pojo.Menu;

import java.util.List;

/**
 * 服务类
 *
 * @author hhh
 * @since 2022-01-19
 */
public interface IMenuService extends IService<Menu> {

  /**
   * 根据用户id查询菜单列表
   *
   * @return
   */
  List<Menu> getMenusByAdminId();

  /**
   * 根据角色获取菜单列表
   *
   * @return
   */
  List<Menu> getMenusWithRole();

  /**
   * 查询所有菜单
   *
   * @return
   */
  List<Menu> getAllMenus();
}
