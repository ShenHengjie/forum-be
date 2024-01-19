package com.forums.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.forums.model.pojo.PingLun;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PingLunService extends IService<PingLun> {

    List<PingLun> plList(Integer tid);

    boolean deletePL(Integer pid);
}
