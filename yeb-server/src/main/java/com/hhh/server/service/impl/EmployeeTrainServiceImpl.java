package com.hhh.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hhh.server.mapper.EmployeeTrainMapper;
import com.hhh.server.pojo.EmployeeTrain;
import com.hhh.server.service.IEmployeeTrainService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author hhh
 * @since 2022-01-19
 */
@Service
public class EmployeeTrainServiceImpl extends ServiceImpl<EmployeeTrainMapper, EmployeeTrain>
    implements IEmployeeTrainService {}
