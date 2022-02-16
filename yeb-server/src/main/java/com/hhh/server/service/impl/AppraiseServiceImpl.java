package com.hhh.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hhh.server.mapper.AppraiseMapper;
import com.hhh.server.pojo.Appraise;
import com.hhh.server.service.IAppraiseService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author hhh
 * @since 2022-01-19
 */
@Service
public class AppraiseServiceImpl extends ServiceImpl<AppraiseMapper, Appraise>
    implements IAppraiseService {}
