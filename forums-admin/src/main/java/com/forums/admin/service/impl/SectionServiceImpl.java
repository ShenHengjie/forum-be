package com.forums.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.forums.admin.mapper.SectionMapper;
import com.forums.admin.service.SectionService;
import com.forums.model.pojo.Section;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SectionServiceImpl extends ServiceImpl<SectionMapper, Section> implements SectionService {

    @Resource
    private SectionMapper sectionMapper;
    @Override
    public List<Section> selectSectionList(Integer sid) {
        return sectionMapper.selectSectionList(sid);
    }
}
