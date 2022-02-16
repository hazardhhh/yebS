package com.hhh.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hhh.server.mapper.PositionMapper;
import com.hhh.server.pojo.Position;
import com.hhh.server.service.IPositionService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author hhh
 * @since 2022-01-19
 */
@Service
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position>
    implements IPositionService {}
