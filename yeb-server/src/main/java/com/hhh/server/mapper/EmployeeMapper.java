package com.hhh.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hhh.server.pojo.Employee;
import com.hhh.server.pojo.EmployeeEc;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;

/**
 * Mapper 接口
 *
 * @author hhh
 * @since 2022-01-19
 */
public interface EmployeeMapper extends BaseMapper<Employee> {

  /**
   * 获取所有员工(分页)
   *
   * @param page
   * @param employee
   * @param beginDateScope
   * @return
   */
  IPage<Employee> getEmployeeByPage(
      Page<EmployeeEc> page,
      @Param("employee") Employee employee,
      @Param("beginDateScope") LocalDate[] beginDateScope);
}
