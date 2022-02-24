package com.hhh.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hhh.server.pojo.Department;

import java.util.List;

/**
 * Mapper 接口
 *
 * @author hhh
 * @since 2022-01-19
 */
public interface DepartmentMapper extends BaseMapper<Department> {

  /** 获取所有部门 */
  List<Department> getAllDepartments(Integer parentId);

  /**
   * 添加部门
   *
   * @param dep
   */
  void addDep(Department dep);

  /**
   * 删除部门
   *
   * @param dep
   */
  void deleteDep(Department dep);
}
