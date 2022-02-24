package com.hhh.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hhh.server.pojo.Department;
import com.hhh.server.pojo.RespBean;

import java.util.List;

/**
 * 服务类
 *
 * @author hhh
 * @since 2022-01-19
 */
public interface IDepartmentService extends IService<Department> {

  /**
   * 获取所有部门
   *
   * @return
   */
  List<Department> getAllDepartments();

  /**
   * 添加部门
   *
   * @param dep
   * @return
   */
  RespBean addDep(Department dep);

  /**
   * 删除部门
   *
   * @param id
   * @return
   */
  RespBean deleteDep(Integer id);
}
