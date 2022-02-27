package com.hhh.server;

import com.hhh.server.pojo.Admin;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * 操作员工具类
 *
 * @author HHH
 * @version 1.0.0
 * @date 2022/2/26 2:11
 */
public class AdminUtils {

  /**
   * 获取当前登录操作员
   *
   * @return
   */
  public static Admin getCurrentAdmin() {
    return (Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
  }
}
