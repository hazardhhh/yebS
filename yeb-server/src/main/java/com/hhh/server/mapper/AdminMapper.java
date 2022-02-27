package com.hhh.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hhh.server.pojo.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Mapper 接口
 *
 * @author hhh
 * @since 2022-01-19
 */
public interface AdminMapper extends BaseMapper<Admin> {

  /**
   * 获取所有操作员
   *
   * @param keywords
   * @return
   */
  List<Admin> getAllAdmins(@Param("id") Integer id, @Param("keywords") String keywords);
}
