package com.forums.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.forums.model.pojo.ShouCang;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
@Service
public interface ShouCangService extends IService<ShouCang> {
    // 收藏操作
    boolean shoucang(ShouCang shouCang);

    // 用户查看收藏列表
    Page<ShouCang> selectShouCangList(Page<ShouCang> page,String uid);

    // 判断当前登录用户是否点赞
    boolean isToShou(@Param("uid") String uid,@Param("tid") Integer tid);
}
