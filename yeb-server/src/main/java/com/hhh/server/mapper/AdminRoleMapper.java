package com.hhh.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hhh.server.pojo.AdminRole;
import org.apache.ibatis.annotations.Param;

/**
 * Mapper 接口
 *
 * @author hhh
 * @since 2022-01-19
 */
public interface AdminRoleMapper extends BaseMapper<AdminRole> {

  /**
   * 更新操作员角色
   *
   * @param adminId
   * @param rids
   * @return
   */
  Integer addAdminRole(@Param("adminId") Integer adminId, @Param("rids") Integer[] rids);
}
