package com.hhh.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hhh.server.mapper.DepartmentMapper;
import com.hhh.server.pojo.Department;
import com.hhh.server.service.IDepartmentService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author hhh
 * @since 2022-01-19
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>
    implements IDepartmentService {}
