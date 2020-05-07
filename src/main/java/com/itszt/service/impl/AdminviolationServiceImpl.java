package com.itszt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itszt.dao.AdminviolationMapper;
import com.itszt.domain.Adminviolation;
import com.itszt.service.IAdminviolationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 行政违法名单 服务实现类
 * </p>
 *
 * @author lijian
 * @since 2020-05-06
 */
@Service
public class AdminviolationServiceImpl extends ServiceImpl<AdminviolationMapper, Adminviolation> implements IAdminviolationService {

}
