package com.hhh.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hhh.server.mapper.SysMsgMapper;
import com.hhh.server.pojo.SysMsg;
import com.hhh.server.service.ISysMsgService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author hhh
 * @since 2022-01-19
 */
@Service
public class SysMsgServiceImpl extends ServiceImpl<SysMsgMapper, SysMsg>
    implements ISysMsgService {}
