package com.hhh.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hhh.server.pojo.Role;

import java.util.List;

/**
 * Mapper 接口
 *
 * @author hhh
 * @since 2022-01-19
 */
public interface RoleMapper extends BaseMapper<Role> {

  /**
   * 根据用户id查询角色列表
   *
   * @param adminId
   * @return
   */
  List<Role> getRoles(Integer adminId);
}
