package com.hhh.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hhh.server.mapper.RoleMapper;
import com.hhh.server.pojo.Role;
import com.hhh.server.service.IRoleService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author hhh
 * @since 2022-01-19
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {}
