package com.forums.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.forums.model.pojo.Follow;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public interface FollowService extends IService<Follow> {

    // 关注操作
    boolean follow(String userId,String folleredUser);

    // 关注列表
    Page<Follow> followList(Page<Follow> page,String userId);

    // 判断是否关注
    boolean pdFollowFlog(String userId,String followId);

    boolean cancelFollow(String userId,String followedId);
}
