package com.hhh.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hhh.server.mapper.PoliticsStatusMapper;
import com.hhh.server.pojo.PoliticsStatus;
import com.hhh.server.service.IPoliticsStatusService;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author hhh
 * @since 2022-01-19
 */
@Service
public class PoliticsStatusServiceImpl extends ServiceImpl<PoliticsStatusMapper, PoliticsStatus>
    implements IPoliticsStatusService {}
