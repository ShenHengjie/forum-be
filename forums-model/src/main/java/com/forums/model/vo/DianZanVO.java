package com.forums.model.vo;

import lombok.Data;

import java.util.Date;

@Data
public class DianZanVO {
    private Integer did;
    private Integer tid;
    private String uid;
    private Date createTime;
    // 用于判断是第一次还是第二次
    private Integer count;
}
