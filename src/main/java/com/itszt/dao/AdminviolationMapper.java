package com.itszt.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itszt.domain.Adminviolation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 行政违法名单 Mapper 接口
 * </p>
 *
 * @author lijian
 * @since 2020-05-06
 */
@Repository
public interface AdminviolationMapper extends BaseMapper<Adminviolation> {


    Adminviolation  getbykeyid(@Param("keyid") long keyid);
}
