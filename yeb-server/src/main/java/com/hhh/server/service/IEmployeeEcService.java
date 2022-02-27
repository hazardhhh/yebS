package com.hhh.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hhh.server.pojo.Employee;
import com.hhh.server.pojo.EmployeeEc;
import com.hhh.server.pojo.RespPageBean;

import java.time.LocalDate;

/**
 * 服务类
 *
 * @author hhh
 * @since 2022-01-19
 */
public interface IEmployeeEcService extends IService<EmployeeEc> {

  /**
   * 获取所有员工(分页)
   *
   * @param currentPage
   * @param size
   * @param employee
   * @param beginDateScope
   * @return
   */
  RespPageBean getEmployeeByPage(
      Integer currentPage, Integer size, Employee employee, LocalDate[] beginDateScope);
}
