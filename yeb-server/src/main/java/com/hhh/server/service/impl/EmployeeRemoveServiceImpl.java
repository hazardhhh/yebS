package com.hhh.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hhh.server.mapper.EmployeeRemoveMapper;
import com.hhh.server.pojo.EmployeeRemove;
import com.hhh.server.service.IEmployeeRemoveService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author hhh
 * @since 2022-01-19
 */
@Service
public class EmployeeRemoveServiceImpl extends ServiceImpl<EmployeeRemoveMapper, EmployeeRemove>
    implements IEmployeeRemoveService {}
