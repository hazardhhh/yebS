package com.hhh.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hhh.server.pojo.Menu;

import java.util.List;

/**
 * Mapper 接口
 *
 * @author hhh
 * @since 2022-01-19
 */
public interface MenuMapper extends BaseMapper<Menu> {

  /**
   * 根据用户id查询菜单列表
   *
   * @param id
   * @return
   */
  List<Menu> getMenusByAdminId(Integer id);

  /**
   * 根据角色获取菜单列表
   *
   * @return
   */
  List<Menu> getMenusWithRole();
}
