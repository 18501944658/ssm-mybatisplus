package com.itszt.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 行政违法名单
 * </p>
 *
 * @author lijian
 * @since 2020-05-06
 */
@Data
@TableName("credit_adminviolation")
public class Adminviolation implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 数据原始主键
     */
    private Long keyid;

    /**
     * 数据原始类别编号
     */
    private Integer typet;

    /**
     * 数据类型
     */
    private String typetname;

    /**
     * 标题
     */
    private String title;

    /**
     * 具体日期
     */

    private LocalDateTime sslong;

    /**
     * 输入的名称
     */
    private String name;

    /**
     * 案号
     */
    private String casenum;

    /**
     * 违法事由
     */
    private String casetopic;

    /**
     * 执法/复议/审判机关
     */
    private String court;

    /**
     * 金额(元)
     */
    private String money;

    /**
     * 行政执法结果
     */
    private String content;

    /**
     * 日期类别
     */
    private String timetype;

    /**
     * 收录时案件状态
     */
    private String state;

    /**
     * 刑期
     */
    private String xingqi;

    /**
     * 异议备注
     */
    private String remark;

    /**
     * 匹配度
     */
    private String accuracy;


}
