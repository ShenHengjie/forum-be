package com.forums.model.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("study_neirong")
public class StudyNeiRong {

    /* 学习内容id */
    @TableId(value = "sid",type = IdType.AUTO)
    private Integer sid;
    /* 内容 */
    @TableField("sneirong")
    private String sneirong;
}