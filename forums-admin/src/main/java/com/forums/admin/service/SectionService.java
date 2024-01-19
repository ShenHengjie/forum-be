package com.forums.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.forums.model.pojo.Section;
import com.forums.model.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SectionService extends IService<Section> {


    List<Section> selectSectionList(Integer sid);
}
