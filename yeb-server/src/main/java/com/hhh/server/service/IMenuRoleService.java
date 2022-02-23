package com.hhh.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hhh.server.pojo.MenuRole;
import com.hhh.server.pojo.RespBean;

/**
 * 服务类
 *
 * @author hhh
 * @since 2022-01-19
 */
public interface IMenuRoleService extends IService<MenuRole> {
  /**
   * 更新角色菜单
   *
   * @param rid
   * @param mids
   * @return
   */
  RespBean updateMenuRole(Integer rid, Integer[] mids);
}
