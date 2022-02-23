package com.hhh.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hhh.server.pojo.MenuRole;
import org.apache.ibatis.annotations.Param;

/**
 * Mapper 接口
 *
 * @author hhh
 * @since 2022-01-19
 */
public interface MenuRoleMapper extends BaseMapper<MenuRole> {

  /**
   * 更新角色菜单
   *
   * @param rid
   * @param mids
   * @return
   */
  Integer insertRecord(@Param("rid") Integer rid, @Param("mids") Integer[] mids);
}
