package com.forums.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.forums.model.pojo.PingLun;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PingLunMapper extends BaseMapper<PingLun> {

     List<PingLun> selectPL(Integer tid);

     // 取消评论
     Integer deletePL(Integer pid);
}
